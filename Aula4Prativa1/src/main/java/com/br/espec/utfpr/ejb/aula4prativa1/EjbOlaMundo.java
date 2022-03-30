/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package com.br.espec.utfpr.ejb.aula4prativa1;

import javax.ejb.Stateless;

/**
 *
 * @author gabryelboeira
 * @since 29/03/2022
 */
@Stateless
public class EjbOlaMundo {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public String getOi() {
        return "Ola mundo";
    }
}
