package com.github.lgrodriguess.ex09;

public class Gerente {
    private String nome;
    private int id;
    private double salario;
    private String areaDeGerencia;
    
    public Gerente(){
        this.nome = "";
        this.id = 0;
        this.salario = 0.0;
        this.areaDeGerencia = "";
    }

    public Gerente(String nome, int id, double salario, String areaDeGerencia) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
        this.areaDeGerencia = areaDeGerencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getAreaDeGerencia() {
        return areaDeGerencia;
    }

    public void setAreaDeGerencia(String areaDeGerencia) {
        this.areaDeGerencia = areaDeGerencia;
    }
    
    
    
}
