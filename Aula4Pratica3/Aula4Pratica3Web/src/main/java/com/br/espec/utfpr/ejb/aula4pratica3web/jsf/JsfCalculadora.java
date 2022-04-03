/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.br.espec.utfpr.ejb.aula4pratica3web.jsf;

import com.br.espec.utfpr.ejb.aula4pratica3lib.ICalculadora;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author gabryelboeira
 */
@Named(value = "jsfCalculadora")
@RequestScoped
public class JsfCalculadora {

    @EJB
    private ICalculadora ejbCalculadora;

    /**
     * Creates a new instance of JsfCalculadora
     */
    public JsfCalculadora() {
    }
    
    public void somar () {
        System.out.println("asd  " + valorA + " asdasd " + valorB);
        resultado = ejbCalculadora.somar(valorA, valorB);
    }
    
    @Setter @Getter
    private int valorA;
    
    @Setter @Getter
    private int valorB;
    
    @Getter
    private int resultado;
    
}
