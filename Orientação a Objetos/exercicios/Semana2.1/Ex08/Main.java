package com.github.lgrodriguess.ex8;

public class Main {

    public static void main(String[] args) {
        Musica m1 = new Musica();
        
        m1.fill();
        System.out.println(m1.toString());
        m1.tocarMusica();
        System.out.println("Passou " + m1.getDuracao() + " minutos.");
        m1.desligarMusica();
    }
}
