/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.br.espec.utfpr.ejb.aula4prativa1;

import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author gabryelboeira
 * @since 29/03/2022
 */
@Named(value = "jsfOi")
@RequestScoped
public class JsfOi {

    @EJB
    private EjbOlaMundo ejbOlaMundo;

    /**
     * Creates a new instance of JsfOi
     */
    public JsfOi() {
    }
    
    public String getOi() {
    
        return ejbOlaMundo.getOi();
    }
    
}
