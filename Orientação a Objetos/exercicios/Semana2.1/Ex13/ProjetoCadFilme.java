package com.github.lgrodriguess.ex13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjetoCadFilme {

    public static int imprimeMenu() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println("1 - Inserir Filme");
        System.out.println("2 - Remover Filme");
        System.out.println("3 - Pesquisar Filme (titulo)");
        System.out.println("4 - Pesquisar Filme (diretor)");
        System.out.println("0 - Sair");
        System.out.println("-----------------------------");
        System.out.println("Escolha uma opção:");

        return leitor.nextInt();
    }
    public static void main(String[] args) {
        List<Filme> listFilme = new ArrayList();
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;
        
        do{
            opcao = imprimeMenu();
            if(opcao == 1){
                Filme filme1 = new Filme();
                filme1.fill();
                listFilme.add(filme1);
            }else if (opcao == 2){
                System.out.println("Informe o titulo do filme que deseja remover:");
                String titulo = leitor.nextLine();
                Filme encontrado = null;
                
                for(Filme filme : listFilme){
                    if(titulo.equalsIgnoreCase(filme.getTitulo())){
                        encontrado = filme;
                    }
                if(encontrado == null){
                    System.out.println("Nao ha filme com esse titulo para remover!!");
                }else{
                    listFilme.remove(encontrado);
                    System.out.println("Filme removido com sucesso!");
                }
                    
             }
            }else if (opcao == 3){
                System.out.println("Infome o titulo do filme para pesquisa:");
                String titulo = leitor.nextLine();
                Filme encontrado = null;
                
                for(Filme filme : listFilme){
                    if(titulo.equalsIgnoreCase(filme.getTitulo())){
                        encontrado = filme;
                    }
                if (encontrado == null){
                    System.out.println("Nenhum filme com esse titulo encontrado!");
                }else{
                    System.out.println("Filme por titulo encontrado: " + encontrado.toString());   
                    }
                }
            }else if (opcao == 4){
                System.out.println("Informe o diretor do filme para remocao:");
                String diretor = leitor.nextLine();
                Filme encontrado = null;
                
                for(Filme filme : listFilme){
                    if(diretor.equalsIgnoreCase(filme.getDiretor())){
                        encontrado = filme;
                    }
                if(encontrado == null){
                    System.out.println("Nenhum filme com esse diretor encontrado!");
                }else{
                    System.out.println("Filme por diretor encontrado: " + encontrado.toString());
                }
                }
            }
        }while (opcao != 0);
    }
}
    
