
package com.github.lgrodriguess.exercicio4;

import com.github.lgrodriguess.exercicio4.models.ConversorMoedaReal;
import com.github.lgrodriguess.exercicio4.models.IConversorMoeda;
import com.github.lgrodriguess.exercicio4.models.ServicoFinanceiro;
import java.util.Scanner;


/**
 *
 * @author lrodr
 */
public class Main {

    public static void main(String[] args) {
        
        IConversorMoeda conversorMoeda = new ConversorMoedaReal();
        ServicoFinanceiro servicoFinanceiro = new ServicoFinanceiro(conversorMoeda);
        
        Scanner scanner = new Scanner(System.in);
                
        System.out.println("Insira seu valor em real");
        float valor = scanner.nextFloat(); scanner.nextLine();
        
        servicoFinanceiro.realizarTransacao(valor);
        
        
        
    }
}
