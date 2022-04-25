/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.br.espec.utfpr.aula5pratica1.jsf;

import javax.annotation.Resource;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.jms.ConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;
import lombok.Getter;
import lombok.Setter;


/**
 *
 * @author gabryelboeira
 */
@Named(value = "jsfProdutor")
@RequestScoped
public class JsfProdutor {

    @Resource(lookup = "java:comp/DefaultJMSConnectionFactory")
    private ConnectionFactory connectionFactory;

    @Resource(lookup = "java/Fila")
    private Queue fila;

    @Getter
    @Setter
    private String menssagem;
    
    /**
     * Creates a new instance of JsfProdutor
     */
    public JsfProdutor() {
    }

    public void sendMessage() {

        try {

            JMSContext context = connectionFactory.createContext();
            context.createProducer().send(fila, menssagem);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
