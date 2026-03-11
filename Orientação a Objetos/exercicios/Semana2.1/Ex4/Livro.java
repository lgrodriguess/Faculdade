package com.github.lgrodriguess.ex5;
import java.util.Scanner;

public class Livro {
    private String titulo;
    private String autor;
    private int numPag;
    private double preco;
    
    Livro(){
        this.titulo = "";
        this.autor = "";
        this.numPag = 0;
        this.preco = 0.0;
    }
    Livro(String titulo, String autor, int numPag, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
        this.preco = preco;
    }
    //Copiar
    void Copy(Livro other){
        this.titulo = other.getTitulo();
        this.autor = other.getAutor();
        this.numPag = other.getNumPag();
        this.preco = other.getPreco();
    }
    //Setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setNumPag(int numPag){
        this.numPag = numPag;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    //Getters
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getNumPag(){
        return this.numPag;
    }
    public double getPreco(){
        return this.preco;
    }
    
    //Preencher
    void fill(){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Titulo:");
        this.titulo = ler.nextLine();
        System.out.println("Autor:");
        this.autor = ler.nextLine();
        System.out.println("Numero de Paginas:");
        this.numPag = ler.nextInt(); ler.nextLine();
        System.out.println("Preco:");
        this.preco = ler.nextDouble();
    }
    
     //Imprimir
    @Override
    public String toString(){
        return "Livro{\n" +
               "Titulo= '" + this.titulo + "'\n" +
               "Autor= '" + this.autor + "'\n" +
               "Numero de Paginas= '" + this.numPag + "'\n" +
               "Preco= '" + this.preco + "'\n" +
               "}";
    }
}
