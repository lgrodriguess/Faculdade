package com.github.lgrodriguess.exercicio1.models;
/**
 *
 * @author lrodr
 */
public class ProcessadorMensagem {
    
    private IEnviadorMensagem enviadorMensagem;
    
    public ProcessadorMensagem(IEnviadorMensagem enviadorMensagem){
        this.enviadorMensagem = enviadorMensagem;
    }
    
    public void processar(String msg){
        this.enviadorMensagem.enviarMensagem(msg);
    
    }

}
