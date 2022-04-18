/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.espec.utfpr.aula4pratica4.model;

import lombok.Data;

/**
 *
 * @author gabryelboeira
 */
@Data
public class ItemCompra {
    
    private Produto produto;
    private Integer qtde;

    public ItemCompra(Produto produto, Integer qtde) {
        this.produto = produto;
        this.qtde = qtde;
    }

    public ItemCompra() {
    }
    
}
