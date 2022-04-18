/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
package com.br.espec.utfpr.aula4pratica4.ejb;

import com.br.espec.utfpr.aula4pratica4.model.ItemCompra;
import com.br.espec.utfpr.aula4pratica4.model.Produto;
import java.util.ArrayList;
import javax.ejb.Stateful;

/**
 *
 * @author gabryelboeira
 */
@Stateful
public class EjbCompra {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")   
    private ArrayList<ItemCompra> itemCompraList;

    public EjbCompra() {
        this.itemCompraList = new ArrayList<>();
    }

    public void addPrdoduto(Produto produto) {
        boolean adicionar = true;

        for (ItemCompra item : itemCompraList) {
            if (item.getProduto().getCodigo() == produto.getCodigo()) {
                item.setQtde(item.getQtde() + 1);
                adicionar = false;
                break;
            }
        }

        if (adicionar) {
            itemCompraList.add(new ItemCompra(produto, 1));
        }
    }

    public ArrayList<ItemCompra> getAll() {
        return itemCompraList;
    }

}
