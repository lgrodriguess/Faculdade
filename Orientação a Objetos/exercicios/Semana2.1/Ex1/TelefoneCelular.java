package com.mycompany.mavenproject2;

import java.util.Scanner;

public class TelefoneCelular {
    //atributos
    private String marca;
    private String modelo;
    private double preco;
    private int memoria;
    
    
   TelefoneCelular(){
       this.marca = "";
       this.modelo = "";
       this.preco = 0.0;
       this.memoria = 0;
   }
   TelefoneCelular(String marca, String modelo, double preco, int memoria){
       this.marca = marca;
       this.modelo = modelo;
       this.preco = preco;
       this.memoria = memoria;
   }
    
   //getters
   public String getMarca(){
       return this.marca;
   }
    public String getModelo(){
       return this.modelo;
   }
   public double getPreco(){
       return this.preco;
   }
   public int getMemoria(){
       return this.memoria;
   }
   
   //setters
   public void setMarca(String marca){
       this.marca = marca;
   }
   public void setModelo(String modelo){
       this.modelo = modelo;
   }
   public void setPreco(double preco){
       this.preco = preco;
   }
   public void setMemoria(int memoria){
       this.memoria = memoria;
   }
   
   //preencher
   public void fill(){
       Scanner ler = new Scanner(System.in);
       
       System.out.println("Marca:");
       this.marca = ler.nextLine();
       
       System.out.println("Modelo:");
       this.modelo = ler.nextLine();
       
       System.out.println("Preco");
       this.preco = ler.nextDouble();
       
       System.out.println("Memoria");
       this.memoria = ler.nextInt();   
   }
   
   //imprimir
    @Override
   public String toString(){
           return "Telefone{ "+ 
                   "Marca='" + this.marca + "'" +
                   ", Modelo='" + this.modelo + "'" +
                   ", Preco='" + this.preco + "'" +
                   ", Memoria='" + this.preco +
                   "}";    
    }
   
   //Copiar
   public void Copy(TelefoneCelular other){
       this.marca = other.getMarca();
       this.memoria = other.getMemoria();
       this.preco = other.getPreco();
       this.memoria = other.getMemoria();
   }
}
