
package com.github.lgrodriguess;

import java.util.Scanner;

public class Produto {
    private String categoria;
    private String nome;
    private double preco;

    
     public Produto(){
            this.categoria = "";
            this.nome = "";
            this.preco = 0.0;
        }
     
    public Produto(String categoria, String nome, double preco) {
        this.categoria = categoria;
        this.nome = nome;
        this.preco = preco;
    }
    
    public void copy(Produto other){
        this.categoria = other.getCategoria();
        this.nome = other.getNome();
        this.preco = other.getPreco();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "categoria=" + categoria + ", nome=" + nome + ", preco=" + preco + '}';
    }
    
    public void fill(){
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Categoria: ");
        this.categoria = ler.nextLine();
        
        System.out.print("Nome: ");
        this.nome = ler.nextLine();
        
        System.out.print("Preco: ");
        this.preco = ler.nextDouble();
    }
    
    
}
