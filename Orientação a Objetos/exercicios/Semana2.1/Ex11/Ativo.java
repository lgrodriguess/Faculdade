package com.github.lgrodriguess.ex11;
import java.util.Scanner;

public class Ativo {
    private String nomeEmpresa;
    private double precoAcao;
    private int qtdAcoes;
    private double variacaoDiaria;

    Ativo(){
        this.nomeEmpresa = "";
        this.precoAcao = 0.0;
        this.qtdAcoes = 0;
        this.variacaoDiaria = 0.0;
    }

    Ativo(String nomeEmpresa, double precoAcao, int qtdAcoes, double variacaoDiaria){
        this.nomeEmpresa = nomeEmpresa;
        this.precoAcao = precoAcao;
        this.qtdAcoes = qtdAcoes;
        this.variacaoDiaria = variacaoDiaria;
    }

    //Copiar
    void Copy(Ativo other){
        this.nomeEmpresa = other.getNomeEmpresa();
        this.precoAcao = other.getPrecoAcao();
        this.qtdAcoes = other.getQtdAcoes();
        this.variacaoDiaria = other.getVariacaoDiaria();
    }

    //Setters
    public void setNomeEmpresa(String nomeEmpresa){
        this.nomeEmpresa = nomeEmpresa;
    }

    public void setPrecoAcao(double precoAcao){
        this.precoAcao = precoAcao;
    }

    public void setQtdAcoes(int qtdAcoes){
        this.qtdAcoes = qtdAcoes;
    }

    public void setVariacaoDiaria(double variacaoDiaria){
        this.variacaoDiaria = variacaoDiaria;
    }

    //Getters
    public String getNomeEmpresa(){
        return this.nomeEmpresa;
    }

    public double getPrecoAcao(){
        return this.precoAcao;
    }

    public int getQtdAcoes(){
        return this.qtdAcoes;
    }

    public double getVariacaoDiaria(){
        return this.variacaoDiaria;
    }

    //Preencher
    void fill(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Nome da Empresa:");
        this.nomeEmpresa = ler.nextLine();

        System.out.println("Preco da Acao:");
        this.precoAcao = ler.nextDouble();

        System.out.println("Quantidade de Acoes:");
        this.qtdAcoes = ler.nextInt();

        System.out.println("Variacao Diaria:");
        this.variacaoDiaria = ler.nextDouble();
    }

    //Imprimir
    @Override
    public String toString(){
        return "Ativo{\n" +
               "Nome da Empresa= '" + this.nomeEmpresa + "'\n" +
               "Preco da Acao= '" + this.precoAcao + "'\n" +
               "Quantidade de Acoes= '" + this.qtdAcoes + "'\n" +
               "Variacao Diaria= '" + this.variacaoDiaria + "'\n" +
               "}";
    }
    public double calcularPosicaoDoAtivo(){
        return getPrecoAcao() * getQtdAcoes();    
    }
    public String exibirResumo(){
        return this.nomeEmpresa + "|" + "R$" + this.precoAcao + "|" + this.qtdAcoes + " acoes|" + this.variacaoDiaria + "%" + "| Posicao: R% " + calcularPosicaoDoAtivo();         
    }
}
