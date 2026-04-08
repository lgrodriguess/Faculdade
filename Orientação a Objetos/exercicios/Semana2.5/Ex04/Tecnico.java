package com.github.lgrodriguess;
import java.util.Scanner;

public class Tecnico {
    private String nome;
    private String nacionalidade;
    private int anoNascimento;

    public Tecnico() {
        this.nome = "";
        this.nacionalidade = "";
        this.anoNascimento = 0;
    }

    public Tecnico(String nome, String nacionalidade, int anoNascimento) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.anoNascimento = anoNascimento;
    }

    public void copy(Tecnico other) {
        this.nome = other.getNome();
        this.nacionalidade = other.getNacionalidade();
        this.anoNascimento = other.getAnoNascimento();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return "Tecnico{" + "nome=" + nome + ", nacionalidade=" + nacionalidade + ", anoNascimento=" + anoNascimento + '}';
    }

    public void fill() {
        Scanner ler = new Scanner(System.in);

        System.out.print("Nome: ");
        this.nome = ler.nextLine();

        System.out.print("Nacionalidade: ");
        this.nacionalidade = ler.nextLine();

        System.out.print("Ano de Nascimento: ");
        this.anoNascimento = ler.nextInt();
    }
}
