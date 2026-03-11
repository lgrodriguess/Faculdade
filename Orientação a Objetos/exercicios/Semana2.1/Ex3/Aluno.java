
package com.github.lgrodriguess.ex3;
import java.util.Scanner;

public class Aluno {
    private String nome;
    private int idade;
    private String matricula;
    private int anoIngresso;
    
    Aluno(){
        this.nome = "";
        this.idade = 0;
        this.matricula = "";
        this.anoIngresso = 0;
    }
    Aluno(String nome, int idade, String matricula, int anoIngresso){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.anoIngresso = anoIngresso;
    }
   //Copiar
    void Copy(Aluno other){
        this.nome = other.getNome();
        this.idade = other.getIdade();
        this.matricula = other.getMatricula();
        this.anoIngresso = other.getAnoIngresso();
    }
    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setAnoIngresso(int anoIngresso){
        this.anoIngresso = anoIngresso;
    }
    //Getters
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public int getAnoIngresso(){
        return this.anoIngresso;
    }
    
    //Preencher
    public void fill(){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Nome:");
        this.nome = ler.nextLine();
        System.out.println("Idade:");
        this.idade = ler.nextInt(); ler.nextLine();
        System.out.println("Matricula:");
        this.matricula = ler.nextLine();
        System.out.println("Ano Ingresso:");
        this.anoIngresso = ler.nextInt();
    }
    
    //Imprimir
    @Override
    public String toString(){
        return "Aluno{\n" +
                "Nome='" + this.nome + "'\n" +
                "Idade='" + this.idade + "'\n" +
                "Matricula='" + this.matricula + "'\n" +
                "Ano Ingresso='" + this.anoIngresso + "'\n" +
                "}";
    }
    
}
