/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package com.br.espec.utfpr.ejb.aula4pratica2.ejb;

import javax.ejb.Local;

/**
 *
 * @author gabryelboeira
 * @since 29/03/2022
 */
@Local
public interface EjbLocalLocal {

    int dobrar(int valor);
    
}
