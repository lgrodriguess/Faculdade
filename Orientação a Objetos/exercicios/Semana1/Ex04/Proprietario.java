package com.mycompany.ex4s1;

public class Proprietario {
    private String nome;
    private double cpf;

     public Proprietario() {
         this.nome = "";
         this.cpf = 0;
    }
     
    public Proprietario(String nome, double cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    //Setters
   public void setNome(String nome){
       this.nome = nome;
   }
   public void setCpf(double cpf){
       this.cpf = cpf;
   }
   //Getters
   public String getNome(){
       return this.nome;
   }
   public double getCpf(){
       return this.cpf;
}
    
    
    
}
