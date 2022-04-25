/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.espec.utfpr.tarefamd.model;

import lombok.Data;

/**
 *
 * @author gabryelboeira
 */
@Data
public class Usuario {
    
    private String nome;
    private int pontuacao;

    public Usuario(String nome, int pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    public Usuario() {
    }   
    
    
}
