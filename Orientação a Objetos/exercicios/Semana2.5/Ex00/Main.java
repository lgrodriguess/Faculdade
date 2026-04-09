package com.github.lgrodriguess.ex00;
public class Main {

    public static void main(String[] args) {
        Carro meuCarro = new Carro("Sentra", 2016, "branco");
        Motorista motorista = new Motorista("Luan", meuCarro);
        
        motorista.Dirigir();
        System.out.println("Informacoes do "+motorista);
        
        
    }
}
