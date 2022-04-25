/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.br.espec.utfpr.tarefamd.ejb.usuario;

import com.br.espec.utfpr.tarefamd.model.Usuario;
import com.br.espec.utfpr.tarefamd.repository.UsuarioRepository;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Optional;
import javax.annotation.Resource;
import javax.ejb.Stateful;
import javax.jms.ConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;

/**
 *
 * @author gabryelboeira
 */
@Stateful
public class UsuarioEjb implements UsuarioEjbLocal {

    private final UsuarioRepository usuarioRepository;

    @Resource(lookup = "java:comp/DefaultJMSConnectionFactory")
    private ConnectionFactory connectionFactory;

    @Resource(lookup = "java/TarefaMd")
    private Queue fila;

    public UsuarioEjb() {
        this.usuarioRepository = new UsuarioRepository();
    }

    @Override
    public Usuario atualizarPontuacao(final Usuario usuario) {

        Usuario usuarioUpdate = new Usuario(usuario.getNome(), usuario.getPontuacao() + 1);

        Optional<Usuario> usuarioExite = usuarioRepository.listar().stream().filter(it -> it.getNome().equals(usuario.getNome())).findFirst();

        if (usuarioExite.isPresent()) {
            usuarioUpdate.setPontuacao(usuarioExite.get().getPontuacao() + 1);
        }

        usuarioRepository.alterarUsuario(usuario, usuarioUpdate);

        enviarRanking();

        return usuarioUpdate;
    }

    @Override
    public ArrayList<Usuario> getAllUsuarios() {
        return usuarioRepository.listar();
    }

    @Override
    public Usuario salvar(final String nome) {

        Usuario usuario = new Usuario(nome, 0);
        return usuarioRepository.salvar(usuario);
    }

    private void enviarRanking() {

        ArrayList<Usuario> usuarioList = usuarioRepository.listar();        
        
        LinkedHashMap<Integer, String> mapUsuarioList = new LinkedHashMap<>();
        for (int i = 0; i < usuarioList.size(); i++) {            
            mapUsuarioList.put(i, usuarioList.get(i).toString());
        }

        try {

            JMSContext context = connectionFactory.createContext();
            context.createProducer().send(fila, mapUsuarioList);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
