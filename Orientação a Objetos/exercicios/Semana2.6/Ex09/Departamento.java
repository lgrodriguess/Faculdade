package com.github.lgrodriguess.ex09;

import java.util.List;
import java.util.ArrayList;

public class Departamento {
    private String nome;
    Gerente gerente;
    Funcionario funcionario;
    private final List<Funcionario> funcionarioList; 

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarioList =  new ArrayList<>(); 
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public List<Funcionario> getFuncionarioList() {
        return funcionarioList;
    }
    
    public void adicionarFuncionario(Funcionario funcionario){
        funcionarioList.add(funcionario);
    }
    
    public boolean removerFuncionario(Funcionario funcionario){
        return funcionarioList.remove(funcionario);
    }
    
}
