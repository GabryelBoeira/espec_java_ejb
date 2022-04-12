/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.br.espec.utfpr.somarnumeros.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author gabryelboeira
 */
@Stateless
public class SomarNumeroEjb implements SomarNumeroEjbLocal {

    @Override
    public int somarNumeros(int valorA, int valorB) {
        return valorA + valorB;
    }
}