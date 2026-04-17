package com.github.lgrodriguess.ex08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("=== Cadastro de Proprietario ===");
        System.out.print("Nome: ");
        String nome = read.nextLine();
        System.out.print("CPF: ");
        String cpf = read.nextLine();
        System.out.print("Email: ");
        String email = read.nextLine();

        Owner proprietario = new Owner(nome, cpf, email);

        String continuarCarro = "s";
        while (continuarCarro.equalsIgnoreCase("s")) {
            System.out.println("\n--- Adicionando um Carro ---");
            System.out.print("Fabricante: ");
            String fab = read.nextLine();
            System.out.print("Modelo: ");
            String mod = read.nextLine();
            System.out.print("Cor: ");
            String cor = read.nextLine();

            Car novoCarro = new Car(fab, mod, cor);

       
            for (int i = 1; i <= 4; i++) {
                System.out.println("Dados da Roda " + i + ":");
                System.out.print("  Raio: ");
                double raio = read.nextDouble();
                read.nextLine(); // Limpa buffer
                System.out.print("  Material: ");
                String mat = read.nextLine();
                System.out.print("  Cor da Roda: ");
                String corRoda = read.nextLine();

                Wheel roda = new Wheel(raio, mat, corRoda);
                novoCarro.addWheel(roda); // Delegação: Carro -> WheelManager
            }

         
            proprietario.addCar(novoCarro); // Delegação: Owner -> CarManager

            System.out.print("\nDeseja cadastrar outro carro para este dono? (s/n): ");
            continuarCarro = read.nextLine();
        }

      
        System.out.println("\n========================================");
        System.out.println("RESUMO DO PROPRIETARIO E SEUS BENS");
        System.out.println("========================================");
        System.out.println(proprietario.toString()); 
        
        read.close();
    }
}
