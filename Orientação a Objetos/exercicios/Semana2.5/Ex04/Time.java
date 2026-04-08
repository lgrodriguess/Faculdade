package com.github.lgrodriguess;
import java.util.Scanner;

public class Time {
    private String nome;
    private String cidade;
    private int anoFundacao;
    private Tecnico tecnico;

    public Time() {
        this.nome = "";
        this.cidade = "";
        this.anoFundacao = 0;
        this.tecnico = new Tecnico();
    }

    public Time(String nome, String cidade, int anoFundacao, Tecnico tecnico) {
        this.nome = nome;
        this.cidade = cidade;
        this.anoFundacao = anoFundacao;
        this.tecnico = tecnico;
    }

    public void copy(Time other) {
        this.nome = other.getNome();
        this.cidade = other.getCidade();
        this.anoFundacao = other.getAnoFundacao();

        Tecnico t = new Tecnico();
        t.copy(other.getTecnico());
        this.tecnico = t;
    }

    public void escalarTecnico(Tecnico t) {
        this.tecnico = t;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }
    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }
    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public String toString() {
        return "Time{" + "nome=" + nome + ", cidade=" + cidade + ", anoFundacao=" + anoFundacao + ", tecnico=" + tecnico + '}';
    }

    public void fill() {
        Scanner ler = new Scanner(System.in);

        System.out.print("Nome: ");
        this.nome = ler.nextLine();

        System.out.print("Cidade: ");
        this.cidade = ler.nextLine();

        System.out.print("Ano de Fundacao: ");
        this.anoFundacao = ler.nextInt();

        Tecnico t = new Tecnico();
        t.fill();
        this.tecnico = t;
    }
}
