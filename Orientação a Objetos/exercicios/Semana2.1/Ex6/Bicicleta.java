package com.github.lgrodriguess.ex6;
import java.util.Scanner;

public class Bicicleta {
    private String marca;
    private String modelo;
    private double tamanhoQuadro;
    private double preco;
    
    Bicicleta(){
        this.marca = "";
        this.modelo = "";
        this.tamanhoQuadro = 0.0;
        this.preco = 0.0;
    }
    
    Bicicleta(String marca, String modelo, double tamanhoQuadro, double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoQuadro = tamanhoQuadro;
        this.preco = preco;
    }
    
    //Copiar
    void Copy(Bicicleta other){
        this.marca = other.getMarca();
        this.modelo = other.getModelo();
        this.tamanhoQuadro = other.getTamanhoQuadro();
        this.preco = other.getPreco();
    }
    
    //Setters
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setTamanhoQuadro(double tamanhoQuadro){
        this.tamanhoQuadro = tamanhoQuadro;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    //Getters
    public String getMarca(){
        return this.marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public double getTamanhoQuadro(){
        return this.tamanhoQuadro;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    //Preencher
    void fill(){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Marca:");
        this.marca = ler.nextLine();
        System.out.println("Modelo:");
        this.modelo = ler.nextLine();
        System.out.println("Tamanho do Quadro:");
        this.tamanhoQuadro = ler.nextDouble(); ler.nextLine();
        System.out.println("Preco:");
        this.preco = ler.nextDouble();
    }
    
    //Imprimir
    @Override
    public String toString(){
        return "Bicicleta{\n" +
               "Marca= '" + this.marca + "'\n" +
               "Modelo= '" + this.modelo + "'\n" +
               "Tamanho do Quadro= '" + this.tamanhoQuadro + "'\n" +
               "Preco= '" + this.preco + "'\n" +
               "}";
    }
}
