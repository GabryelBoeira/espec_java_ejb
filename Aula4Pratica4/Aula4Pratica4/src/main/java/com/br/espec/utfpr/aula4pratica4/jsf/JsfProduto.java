/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.br.espec.utfpr.aula4pratica4.jsf;

import com.br.espec.utfpr.aula4pratica4.ejb.EjbProduto;
import com.br.espec.utfpr.aula4pratica4.model.Produto;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author gabryelboeira
 */
@Named(value = "jsfProduto")
@RequestScoped
public class JsfProduto {

    @EJB
    private EjbProduto ejbProduto;

    /**
     * Creates a new instance of JsfProduto
     */
    public JsfProduto() {
    }
    
    public ArrayList<Produto> getAllProdutos() {        
        return ejbProduto.getAllProdutos();
    }       
}
