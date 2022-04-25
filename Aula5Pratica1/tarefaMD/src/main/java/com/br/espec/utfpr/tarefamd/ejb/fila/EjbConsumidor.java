/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.espec.utfpr.tarefamd.ejb.fila;

import com.br.espec.utfpr.tarefamd.model.Usuario;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 *
 * @author gabryelboeira
 * @since 24 de abr. de 2022
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "java/TarefaMd"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class EjbConsumidor implements MessageListener {

    @Override
    public void onMessage(Message msg) {
        try {

            System.out.println("Atualizacao no ranking:");
            System.out.println("");
              
            LinkedHashMap<Integer, String> usuarioList = msg.getBody(LinkedHashMap.class);
            for (Map.Entry<Integer, String> entry : usuarioList.entrySet()) {
                System.out.println(entry.getValue());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
