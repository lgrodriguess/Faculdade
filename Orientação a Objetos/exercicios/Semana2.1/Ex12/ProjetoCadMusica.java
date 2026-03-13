package com.github.lgrodriguess.ex12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjetoCadMusica {

    public static int imprimeMenu() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println("1 - Inserir Musica");
        System.out.println("2 - Remover Musica");
        System.out.println("3 - Pesquisar Musica (titulo)");
        System.out.println("4 - Pesquisar Musica (artista)");
        System.out.println("0 - Sair");
        System.out.println("-----------------------------");
        System.out.println("Escolha uma opção:");

        return leitor.nextInt();
    }

    public static void main(String[] args) {
        List<Musica> listMusica = new ArrayList();
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;

        do {
            opcao = imprimeMenu();
            if (opcao == 1) { //Aqui vai inserir as musicas
                Musica musica1 = new Musica();
                musica1.fill();
                listMusica.add(musica1);
            } else if (opcao == 2) { //Aqui vai remover a musica de escolha
                System.out.println("Informe o titulo da musica que deseja remover:");
                String titulo = leitor.nextLine();
                Musica encontrada = null;
                
                for (Musica musica : listMusica) {
                    if (titulo.equalsIgnoreCase(musica.getTitulo())) { //ignora letra maiuscula e minuscula
                        encontrada = musica;
                    }
                }
                
                if (encontrada == null){
                    System.out.println("Musica nao encontrada!");
                } else {                
                    listMusica.remove(encontrada);
                    System.out.println("Musica Removida");
                }
                
            } else if (opcao == 3){
                System.out.println("Informe o titulo desejado:");
                String titulo = leitor.nextLine();
                Musica encontrada = null;
                
                for (Musica musica : listMusica){
                    if (titulo.equalsIgnoreCase(musica.getTitulo())){ 
                        encontrada = musica;
                    }
                }
                if(encontrada == null){
                    System.out.println("Musica nao encontrada");
                }else{
                    System.out.println("Musica por titulo encontrada: " + encontrada.toString());
                }
                
            }else if (opcao == 4){
                System.out.println("Informe o artista desejado");
                String artista = leitor.nextLine();
                Musica encontrada = null;
                
                for (Musica musica : listMusica){
                    if (artista.equalsIgnoreCase(musica.getArtista())){
                        encontrada = musica;
                    }
                }  
                if(encontrada == null){
                    System.out.println("Musica nao encontrada");
                }else{
                    System.out.println("Musica por artista encontrada: " + encontrada.toString());
                }
            }
        } while (opcao != 0);
    }
}
