package com.github.lgrodriguess.ex11;
import java.util.ArrayList;
import java.util.List;
public class GerenciadorDeContas {
    private List<Conta> lst;
    
    GerenciadorDeContas(){
        lst = new ArrayList<>();
    }
    public void listarContas(){
        for(Conta conta : lst){
            System.out.println(conta);
        }
    }
    public int totalCredores(){
        int contador = 0;
        for(Conta conta : lst){
            if(conta.getSaldo() > 0){
                contador++;
            }
        }
        return contador;
    }
    public int totalDevedores(){
        int contador = 0;
        for(Conta conta : lst){
            if(conta.getSaldo() < 0){
                contador++;
            }
        }
        return contador;
    }
    public Conta maiorSaldo(){
        if(lst.isEmpty()){
            return null;
        }
        Conta contaMaiorSaldo = new Conta();
        contaMaiorSaldo.copiar(lst.get(0));
        for(Conta conta : lst){
            if(conta.getSaldo() > contaMaiorSaldo.getSaldo()){
                contaMaiorSaldo.copiar(conta);
            }
        }
        return contaMaiorSaldo;
    }
    public Conta menorSaldo(){
        if(lst.isEmpty()){
            return null;
        }
        Conta contaMenorSaldo = new Conta();
        contaMenorSaldo.copiar(lst.get(0));
        for(Conta conta : lst){
            if(conta.getSaldo() < contaMenorSaldo.getSaldo()){
                contaMenorSaldo.copiar(conta);
            }
        }
        return contaMenorSaldo;
    }
    public void add(Conta conta){
        lst.add(conta);
    }
    public void remove(String titular){
        lst.removeIf(conta -> conta.getTitular().equalsIgnoreCase(titular));
    }
    public List<Conta> getContas(){
        return lst;
    }
}
