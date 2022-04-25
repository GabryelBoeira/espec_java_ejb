/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.espec.utfpr.aula5pratica1.ejb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 *
 * @author gabryelboeira
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "java/Fila"),
     @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue") 
})
public class EjbConsumidor implements MessageListener {

    @Override
    public void onMessage(Message msg) {
        
        try {
            
            TextMessage tm = (TextMessage) msg;
            System.out.println(tm.getText());
            
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }    
}
