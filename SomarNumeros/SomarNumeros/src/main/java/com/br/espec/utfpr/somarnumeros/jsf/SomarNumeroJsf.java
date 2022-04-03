/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.br.espec.utfpr.somarnumeros.jsf;

import com.br.espec.utfpr.somarnumeros.ejb.SomarNumeroEjbLocal;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author gabryelboeira
 */
@Named(value = "somarNumeroJsf")
@RequestScoped
public class SomarNumeroJsf {

    @EJB
    private SomarNumeroEjbLocal somarNumeroEjb;
    
    @Setter @Getter
    private int valorA;
    
    @Setter @Getter
    private int valorB;
    
    @Getter
    private int resultado;
    
    /**
     * Creates a new instance of SomarNumeroJsf
     */
    public SomarNumeroJsf() {
    }
    
    public void somarNumeros() {
        resultado = somarNumeroEjb.somarNumeros(valorA, valorB);
    }
        
}
