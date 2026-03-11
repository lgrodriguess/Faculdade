package com.github.lgrodriguess.ex5;
import java.util.Scanner;

public class JogoVideogame {
    private String titulo;
    private String plataforma;
    private String classificacaoEtaria;
    private double preco;
    
    JogoVideogame(){
        this.titulo = "";
        this.plataforma = "";
        this.classificacaoEtaria = "";
        this.preco = 0.0;
    }
    
    JogoVideogame(String titulo, String plataforma, String classificacaoEtaria, double preco){
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.classificacaoEtaria = classificacaoEtaria;
        this.preco = preco;
    }
    
    //Copiar
    void Copy(JogoVideogame other){
        this.titulo = other.getTitulo();
        this.plataforma = other.getPlataforma();
        this.classificacaoEtaria = other.getClassificacaoEtaria();
        this.preco = other.getPreco();
    }
    
    //Setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setPlataforma(String plataforma){
        this.plataforma = plataforma;
    }
    
    public void setClassificacaoEtaria(String classificacaoEtaria){
        this.classificacaoEtaria = classificacaoEtaria;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    //Getters
    public String getTitulo(){
        return this.titulo;
    }
    
    public String getPlataforma(){
        return this.plataforma;
    }
    
    public String getClassificacaoEtaria(){
        return this.classificacaoEtaria;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    //Preencher
    void fill(){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Titulo:");
        this.titulo = ler.nextLine();
        System.out.println("Plataforma:");
        this.plataforma = ler.nextLine(); 
        System.out.println("Classificacao Etaria:");
        this.classificacaoEtaria = ler.nextLine();
        System.out.println("Preco:");
        this.preco = ler.nextDouble();
    }
    
    //Imprimir
    @Override
    public String toString(){
        return "JogoVideogame{\n" +
               "Titulo= '" + this.titulo + "'\n" +
               "Plataforma= '" + this.plataforma + "'\n" +
               "Classificacao Etaria= '" + this.classificacaoEtaria + "'\n" +
               "Preco= '" + this.preco + "'\n" +
               "}";
    }
}
