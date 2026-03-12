package com.github.lgrodriguess.ex7;
import java.util.Scanner;

public class Filme {
    private String titulo;
    private String diretor;
    private int duracao;
    private double preco;
    
    Filme(){
        this.titulo = "";
        this.diretor = "";
        this.duracao = 0;
        this.preco = 0.0;
    }
    
    Filme(String titulo, String diretor, int duracao, double preco){
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.preco = preco;
    }
    
    //Copiar
    void Copy(Filme other){
        this.titulo = other.getTitulo();
        this.diretor = other.getDiretor();
        this.duracao = other.getDuracao();
        this.preco = other.getPreco();
    }
    
    //Setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }
    
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    //Getters
    public String getTitulo(){
        return this.titulo;
    }
    
    public String getDiretor(){
        return this.diretor;
    }
    
    public int getDuracao(){
        return this.duracao;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    //Preencher
    void fill(){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Titulo:");
        this.titulo = ler.nextLine();
        
        System.out.println("Diretor:");
        this.diretor = ler.nextLine();
        
        System.out.println("Duracao:");
        this.duracao = ler.nextInt(); ler.nextLine();
        
        System.out.println("Preco:");
        this.preco = ler.nextDouble();
    }
    
    //Imprimir
    @Override
    public String toString(){
        return "Filme{\n" +
               "Titulo= '" + this.titulo + "'\n" +
               "Diretor= '" + this.diretor + "'\n" +
               "Duracao= '" + this.duracao + "'\n" +
               "Preco= '" + this.preco + "'\n" +
               "}";
    }
}
