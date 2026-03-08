package com.mycompany.ex4s1;


public class Carro {
    private String nome;
    private String marca;
    private int ano;
    private double preco;
    private Proprietario dono;

    public Carro() {
        this.nome = "";
        this.marca = "";
        this.ano = 0;
        this.preco = 0.0;  
        this.dono = null;
    }

    public Carro(String nome, String marca, int ano, double preco, Proprietario dono) {
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
        this.dono = dono;
    }
    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setDono(Proprietario p1){
        this.dono = p1;
    }


    
    
    
}
