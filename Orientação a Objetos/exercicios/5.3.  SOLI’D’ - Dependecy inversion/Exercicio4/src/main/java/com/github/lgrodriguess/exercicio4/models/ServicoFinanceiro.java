
package com.github.lgrodriguess.exercicio4.models;

/**
 *
 * @author lrodr
 */
public class ServicoFinanceiro {
    
    private IConversorMoeda conversorMoeda;
    
    public ServicoFinanceiro(IConversorMoeda conversorMoeda){
        this.conversorMoeda = conversorMoeda;
    }
    
    public void realizarTransacao(float valor){
        this.conversorMoeda.converterParaDolar(valor);
        this.conversorMoeda.converterParaReal(valor);
    }
    
}
