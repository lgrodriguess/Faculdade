package com.github.lgrodriguess.ex06;
import java.util.Scanner;

public class Produto {

    private int codigo;
    private String nome;
    private int quantidade;

    public Produto() {}

    public Produto(int codigo, String nome, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    //getters e setters
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    //preenche
    public void fill() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Código: ");
        this.codigo = scanner.nextInt(); scanner.nextLine();

        System.out.print("Nome: ");
        this.nome = scanner.nextLine();

        System.out.print("Quantidade: ");
        this.quantidade = scanner.nextInt(); scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + this.codigo +
                ", nome='" + this.nome + '\'' +
                ", quantidade=" + this.quantidade +
                '}';
    }

    public void copy(Produto other) {
        this.codigo = other.getCodigo();
        this.nome = other.getNome();
        this.quantidade = other.getQuantidade();
    }
}
