package com.github.lgrodriguess.exercicio1.models;

/**
 *
 * @author lrodr
 */
public class EnviadorSMS implements IEnviadorMensagem {

    @Override
    public void enviarMensagem(String msg) {
        System.out.println("Enviando mensagem:" + msg + " | Por SMS");
    }
    
}
