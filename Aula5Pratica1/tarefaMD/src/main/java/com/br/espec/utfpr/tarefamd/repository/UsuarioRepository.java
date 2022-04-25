/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.espec.utfpr.tarefamd.repository;

import com.br.espec.utfpr.tarefamd.model.Usuario;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author gabryelboeira
 */
public class UsuarioRepository {

    private final ArrayList<Usuario> usuarioList;

    public UsuarioRepository() {
        this.usuarioList = new ArrayList<>();
    }

    public Usuario salvar(Usuario usuario) {
        
        Optional<Usuario> usuarioExite = usuarioList.stream().filter(it -> it.getNome().equals(usuario.getNome())).findFirst();
        
        if (usuarioExite.isPresent()) {
            return usuarioExite.get();
        }

        usuarioList.add(usuario);
        return usuario;
    }

    public ArrayList<Usuario> listar() {
        return usuarioList;
    }

    public void alterarUsuario(Usuario usuarioOld, Usuario usuario) {
        
        usuarioList.set(usuarioList.indexOf(usuarioOld), usuario);
    }
}
