package com.mycompany.ex1;

import static java.time.Clock.system;
import java.util.Scanner;

public class Tv {
    public String marca;
    public int tamanho;
    public String resolucao;
    public double preco;
    
    Tv(){
        this.marca = "";
        this.tamanho = 0;
        this.resolucao = "";
        this.preco = 0.0;
    }
    Tv(String marca, int tamanho, String resolucao, double preco){
        this.marca = marca;
        this.tamanho = tamanho;
        this.resolucao = resolucao;
        this.preco = preco;
    }
    
    //getters
    public String getMarca(){
        return this.marca;
    }
    public int getTamanho(){
        return this.tamanho;
    }
    public String getResolucao(){
        return this.resolucao;
    }
    public double getPreco(){
        return this.preco;
    }
    
    //setters
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }
    public void setResolucao(String resolucao){
        this.resolucao = resolucao;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    void fill(){
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Marca: ");
        this.marca = ler.nextLine();
        
        System.out.print("Tamanho: ");
        this.tamanho = ler.nextInt(); ler.nextLine();
        
        System.out.print("Resolucao: ");
        this.resolucao = ler.nextLine();
        
        System.out.print("Preco: ");
        this.preco = ler.nextDouble();
    }
    
    @Override
    public String toString(){
        return "Tv{" +
               "Marca-'" + this.marca + "'" +
               ", Tamanho-'" + this.tamanho + "'" +
               ", Resolucao-'" + this.resolucao + "'" +
               ", Preco-'" + this.preco + "'" +
               "}";
    }
    
    void Copy(Tv other){
        this.marca = other.getMarca();
        this.tamanho = other.getTamanho();
        this.resolucao = other.getResolucao();
        this.preco = other.getPreco();
    }
}
