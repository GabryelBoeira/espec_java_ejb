/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.br.espec.utfpr.ejb.aula4pratica2.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author gabryelboeira
 * @since 29/03/2022
 */
@Stateless
public class EjbLocal implements EjbLocalLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public int dobrar(int valor) {
        return valor * 2;
    }
}
