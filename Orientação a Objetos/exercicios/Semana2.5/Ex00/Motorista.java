package com.github.lgrodriguess.ex00;

public class Motorista {
    private String nome;
    private Carro carro;

    public Motorista(String nome, Carro carro) {
        this.nome = nome;
        this.carro = carro;
    }

    @Override
    public String toString() {
        return "Motorista{" + "nome=" + nome + ", carro=" + carro + '}';
    }

    public void Dirigir(){
        System.out.println("Voce esta de frente ao seu carro!");
        carro.abrirPorta();
        carro.buzinar();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    
    
}
