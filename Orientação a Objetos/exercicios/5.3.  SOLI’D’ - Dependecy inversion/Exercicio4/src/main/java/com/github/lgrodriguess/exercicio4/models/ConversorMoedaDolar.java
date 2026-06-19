
package com.github.lgrodriguess.exercicio4.models;

/**
 *
 * @author lrodr
 */
public class ConversorMoedaDolar implements IConversorMoeda{

    @Override
    public float converterParaReal(float valorDolar) {
        float valorReal = 5.15F;
        float conversao = valorDolar * valorReal;
        
        System.out.println("Valor em real R$" + conversao);
        
        return conversao;
    }
    

    @Override
    public float converterParaDolar(float valor) {
        System.out.println("Valor em dolar $" + valor);
        
        return valor;
    }
}
