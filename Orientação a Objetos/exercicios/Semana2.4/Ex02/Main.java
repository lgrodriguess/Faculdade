package com.github.lgrodriguess;
public class Main {

    public static void main(String[] args) {

        Livro l1 = new Livro("Dom Casmurro", "Machado de Assis", 256);
        Livro l2 = new Livro("O Cortiço","Aluísio Azevedo", 310);
        Livro l3 = new Livro("Vidas Secas", "Graciliano Ramos", 176);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        System.out.println("Alterando nome da biblioteca");
        Livro.libraryName = "Biblioteca do Vini";

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }
}
