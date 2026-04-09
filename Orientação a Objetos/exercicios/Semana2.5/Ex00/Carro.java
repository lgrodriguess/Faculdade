
package com.github.lgrodriguess.ex00;

import java.util.Scanner;

public class Carro {
    private String modelo;
    private int ano;
    private String cor;

    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Carro{" + "modelo=" + modelo + ", ano=" + ano + ", cor=" + cor + '}';
    }
    
    public void buzinar(){
        Scanner ler = new Scanner(System.in);
        int escolha;
        
        System.out.println("Voce ve um carro parado no meio da rua. O que voce faz?");
        System.out.println("Deseja buzinar?");
        System.out.println("Digite 1 para sim.");
        escolha = ler.nextInt(); ler.nextLine();
        
        if(escolha == 1){
            System.out.println("O carro "+ getModelo() +" Buzinou BIBIBIBIBIBIBIBI" + "\n");
            
        }else{
            System.out.println("Voce teve paciencia!");
        }
        
        
    }
    public void abrirPorta(){
        Scanner ler = new Scanner(System.in);
        int escolha;
                
        System.out.println("Deseja entrar no carro?");
        System.out.println("Digite 1 para sim.");
        System.out.println("Digite 2 para nao.");
        escolha = ler.nextInt();ler.nextLine();
        
        if(escolha == 1){
            System.out.println("Voce abriu a porta!");
            System.out.println("Voce entrou no seu carro.");
            System.out.println("Voce fechou a porta!" + "\n");
        }else if (escolha == 2){
            System.out.println("Voce preferiu nao entrar.");
        }else{
            System.out.println("Opcao invalida!");
        }
    }
    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
    
    
}
