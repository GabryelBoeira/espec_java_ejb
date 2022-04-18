/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.br.espec.utfpr.tarefaejb.ejb.somar;

import javax.ejb.Stateless;

/**
 *
 * @author gabryelboeira
 */
@Stateless
public class EjbValidar {

    public boolean validarResultado(int resultado) {    
        return resultado == 50;
    }
}
