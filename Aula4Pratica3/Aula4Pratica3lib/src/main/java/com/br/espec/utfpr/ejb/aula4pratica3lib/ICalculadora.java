/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.br.espec.utfpr.ejb.aula4pratica3lib;

import javax.ejb.Remote;

/**
 *
 * @author gabryelboeira
 * @since 30/032022
 */
@Remote
public interface ICalculadora {
    
    public int somar(int a, int b);
}
