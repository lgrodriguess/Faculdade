package com.github.lgrodriguess;

public class Main {
    public static void main(String[] args) {

        // Criando técnicos
        Tecnico t1 = new Tecnico("Carlo Ancelotti", "Italiano", 1959);
        Tecnico t2 = new Tecnico("Pep Guardiola", "Espanhol", 1971);
        Tecnico t3 = new Tecnico("Jurgen Klopp", "Alemão", 1967);

        // Criando times com seus técnicos
        Time time1 = new Time("Real Madrid", "Madrid", 1902, t1);
        Time time2 = new Time("Manchester City", "Manchester", 1880, t2);

        System.out.println("=== ANTES DA TROCA ===");
        System.out.println(time1);
        System.out.println(time2);

        // Trocando o técnico do time1
        time1.escalarTecnico(t3);

        System.out.println("\n=== DEPOIS DA TROCA ===");
        System.out.println(time1);
        System.out.println(time2);
    }
}
