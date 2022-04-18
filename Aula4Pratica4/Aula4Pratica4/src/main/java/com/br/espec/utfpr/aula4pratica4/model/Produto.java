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
public class Produto {
    
    private int codigo;
    private String descricao;

    public Produto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Produto() {
    }
       
}
