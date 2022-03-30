/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.br.espec.utfpr.ejb.aula4pratica2.jsf;

import com.br.espec.utfpr.ejb.aula4pratica2.ejb.EjbLocalLocal;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author gabryelboeira
 * @since 29/03/2022
 */
@Named(value = "jsfLocal")
@RequestScoped
public class JsfLocal {

    @EJB
    private EjbLocalLocal ejbLocal;

    private int valor;
    private int resultado;
    
    /**
     * Creates a new instance of JsfLocal
     */
    public JsfLocal() {
    }

    public void dobrar() {
        resultado = ejbLocal.dobrar(valor);
    }
    
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
}
