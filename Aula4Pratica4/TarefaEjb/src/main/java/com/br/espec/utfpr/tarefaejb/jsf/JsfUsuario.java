/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.br.espec.utfpr.tarefaejb.jsf;

import com.br.espec.utfpr.tarefaejb.ejb.somar.EjbValidar;
import com.br.espec.utfpr.tarefaejb.ejb.usuario.UsuarioEjbLocal;
import com.br.espec.utfpr.tarefaejb.model.Usuario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import javax.ejb.EJB;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gabryelboeira
 */
@Named(value = "jsfUsuario")
@SessionScoped
public class JsfUsuario implements Serializable {

    @EJB
    private UsuarioEjbLocal usuarioEjb;

    @EJB
    private EjbValidar ejbValidar;
    
    @Getter
    @Setter
    private String nomeUsuario;
  
    @Setter
    @Getter
    private Usuario usuario;

    @Setter
    @Getter
    private String mensagem = null;

    @Setter
    @Getter
    private int valor;
    
    /**
     * Creates a new instance of JsfUsuario
     */
    public JsfUsuario() {
    }    
    
    public void validarResultado() {

        if (ejbValidar.validarResultado(valor)) {

            usuario = usuarioEjb.atualizarPontuacao(getUsuario());   
            mensagem = "Ponto! Acertou o resultado";
            return;
        }
        mensagem = "Errou! O resultado informado para a soma esta incorreto!";        
    }

    public ArrayList<Usuario> getAll() {
        return usuarioEjb.getAllUsuarios();
    }

    public void salvar() {        
        usuario = usuarioEjb.salvar(nomeUsuario);
    }

}
