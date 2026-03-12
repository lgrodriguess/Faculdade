package com.github.lgrodriguess.ex11;

public class Main {

    public static void main(String[] args) {

        Ativo a1 = new Ativo("Apple Inc.", 121.99, 255, 1.87);
        Ativo a2 = new Ativo("Microsoft", 310.45, 120, -0.52);
        Ativo a3 = new Ativo("Tesla", 245.30, 80, 2.14);
        
        
        System.out.println(a1.exibirResumo());
        System.out.println(a2.exibirResumo());
        System.out.println(a3.exibirResumo());
        
        double t1 = a1.calcularPosicaoDoAtivo();
        double t2 = a2.calcularPosicaoDoAtivo();
        double t3 = a3.calcularPosicaoDoAtivo();
        
        double total = t1 + t2 + t3;
        System.out.println("Valor total da carteira: R$" + total);
       
    }
  }
