
package com.mycompany.ex3s1;

public class Carro {
    private String nome;
    private String marca;
    private int ano;
    private double preco;
    
    public Carro(){
        this.nome = "";
        this.marca = "";
        this.ano = 0;
        this.preco = 0.0;
    }
    
    public Carro(String nome, String marca, int ano, double preco){
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
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
    
    //Getters
    public String getNome(){
        return this.nome;
    }
    public String getMarca(){
        return this.marca;
    }
    public int getAno(){
        return this.ano;
    }
    public double getPreco(){
        return this.preco;
    }
    
}
