package com.github.lgrodriguess.exercicio1;

import com.github.lgrodriguess.exercicio1.models.EnviadorSMS;
import com.github.lgrodriguess.exercicio1.models.IEnviadorMensagem;
import com.github.lgrodriguess.exercicio1.models.ProcessadorMensagem;

/**
 *
 * @author lrodr
 */
public class Main {

    public static void main(String[] args) {
        IEnviadorMensagem enviadorMensagem = new EnviadorSMS();
        ProcessadorMensagem processadorMensagem = new ProcessadorMensagem(enviadorMensagem);
        
        processadorMensagem.processar("Aluno aprovado!!");
        
    }
}
