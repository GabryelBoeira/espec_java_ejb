/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package com.br.espec.utfpr.tarefaejb.ejb.usuario;

import com.br.espec.utfpr.tarefaejb.model.Usuario;
import java.util.ArrayList;
import javax.ejb.Local;

/**
 *
 * @author gabryelboeira
 */
@Local
public interface UsuarioEjbLocal {

    Usuario salvar(final String nome);
    ArrayList<Usuario> getAllUsuarios();
    Usuario atualizarPontuacao(final Usuario usuario);
}
