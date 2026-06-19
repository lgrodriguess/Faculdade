
package com.github.lgrodriguess.exercicio4.models;

/**
 *
 * @author lrodr
 */
public class ConversorMoedaReal implements IConversorMoeda{

    @Override
    public float converterParaReal(float valor) {
        System.out.println("Valor em real R$" + valor); 
        return valor;
    }

    @Override
    public float converterParaDolar(float valor) {
        float valorDolar = 5.15F;
        float conversao = valor / valorDolar;
        
        System.out.println("Valor em dolar $" + conversao);
        return conversao;
    }
    
    
}
