/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.br.espec.utfpr.aula4pratica4.jsf;

import com.br.espec.utfpr.aula4pratica4.ejb.EjbCompra;
import com.br.espec.utfpr.aula4pratica4.model.ItemCompra;
import com.br.espec.utfpr.aula4pratica4.model.Produto;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import javax.ejb.EJB;

/**
 *
 * @author gabryelboeira
 */
@Named(value = "jsfCompra")
@SessionScoped
public class JsfCompra implements Serializable {

    @EJB
    private EjbCompra ejbCompra;

    /**
     * Creates a new instance of JsfCompra
     */
    public JsfCompra() {
    }

    public void add(Produto produto) {
        ejbCompra.addPrdoduto(produto);
    }

    public ArrayList<ItemCompra> getAll() {
        return ejbCompra.getAll();
    }
}
