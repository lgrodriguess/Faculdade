package com.github.lgrodriguess.exercicio1.models;

/**
 *
 * @author lrodr
 */
public class EnviadorTELEGRAM implements IEnviadorMensagem{
    
    public void enviarMensagem(String msg) {
        System.out.println("Enviando mensagem:" + msg + " | Por Telegram");
    }
    
    
}
