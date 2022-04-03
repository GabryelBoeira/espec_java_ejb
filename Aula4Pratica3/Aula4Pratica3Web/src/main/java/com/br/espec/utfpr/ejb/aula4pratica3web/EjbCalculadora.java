/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.br.espec.utfpr.ejb.aula4pratica3web;

import com.br.espec.utfpr.ejb.aula4pratica3lib.ICalculadora;
import javax.ejb.Stateless;

/**
 *
 * @author gabryelboeira
 * @since 30/03/2022
 */
@Stateless
public class EjbCalculadora implements ICalculadora  {

    @Override
    public int somar(int a, int b) {        
        return a + b;
    }
}
