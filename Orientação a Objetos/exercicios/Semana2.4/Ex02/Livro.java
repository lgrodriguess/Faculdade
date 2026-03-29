package com.github.lgrodriguess.ex02;

import java.util.Scanner;

public class Livro {

    public static String libraryName = "Biblioteca Central";

    private String titulo;
    private String autor;
    private int paginas;

    public Livro() {}

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getPaginas() { return paginas; }
    public void setPaginas(int paginas) { this.paginas = paginas; }

    public void fill() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Título: ");
        this.titulo = scanner.nextLine();

        System.out.print("Autor: ");
        this.autor = scanner.nextLine();

        System.out.print("Páginas: ");
        this.paginas = scanner.nextInt(); scanner.nextLine();
    }

    public void copy(Livro other) {
        this.titulo = other.getTitulo();
        this.autor = other.getAutor();
        this.paginas = other.getPaginas();
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + this.titulo + '\'' +
                ", autor='" + this.autor + '\'' +
                ", paginas=" + this.paginas +
                ", biblioteca='" + libraryName + '\'' +
                '}';
    }
}
