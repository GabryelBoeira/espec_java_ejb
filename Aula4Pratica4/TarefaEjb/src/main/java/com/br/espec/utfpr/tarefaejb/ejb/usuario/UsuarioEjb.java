/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.br.espec.utfpr.tarefaejb.ejb.usuario;

import com.br.espec.utfpr.tarefaejb.model.Usuario;
import com.br.espec.utfpr.tarefaejb.repository.UsuarioRepository;
import java.util.ArrayList;
import java.util.Optional;
import javax.ejb.Stateful;

/**
 *
 * @author gabryelboeira
 */
@Stateful
public class UsuarioEjb implements UsuarioEjbLocal {

    private final UsuarioRepository usuarioRepository;

    public UsuarioEjb() {
        this.usuarioRepository = new UsuarioRepository();
    }

    @Override
    public Usuario atualizarPontuacao(final Usuario usuario) {

        Usuario usuarioUpdate = new Usuario(usuario.getNome(), usuario.getPontuacao() + 1);

        Optional<Usuario> usuarioExite = usuarioRepository.listar().stream().filter(it -> it.getNome().equals(usuario.getNome())).findFirst();

        if (usuarioExite.isPresent()) usuarioUpdate.setPontuacao(usuarioExite.get().getPontuacao() + 1);
        
        usuarioRepository.alterarUsuario(usuario, usuarioUpdate);

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
}
