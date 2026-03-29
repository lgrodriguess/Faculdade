package com.github.lgrodriguess.mavenproject2;
import java.util.Scanner;

public class Main {
    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("   GERENCIADOR DE ESTOQUE");
        System.out.println("------------------------------");
        System.out.println("1 - Adicionar produto");
        System.out.println("2 - Remover produto");
        System.out.println("3 - Atualizar quantidade");
        System.out.println("4 - Listar todos os produtos");
        System.out.println("5 - Buscar produto por código");
        System.out.println("0 - Sair");
        System.out.println("-----------------------------");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        GerenciadorEstoque gerenciadorEstoque = new GerenciadorEstoque();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            opcao = menu();
            switch (opcao) {
                case 1: {
                    Produto produto = new Produto();
                    produto.fill();
                    gerenciadorEstoque.addProduct(produto);
                    System.out.println("Produto adicionado!");
                    break;
                }
                case 2: {
                    System.out.print("Codigo do produto que remover: ");
                    int code = scanner.nextInt();
                    Produto encontrado = null;

                    for (Produto produto : gerenciadorEstoque) {
                        if (code == produto.getCodigo()) { 
                            encontrado = produto;
                            break;
                        }
                    } 

                    if (encontrado == null) {
                        System.out.println("Nao existe produto com esse codigo");
                    } else {
                        gerenciadorEstoque.removeProduct(encontrado);
                        System.out.println("Produto removido com sucesso!");
                    }
                    break; // ✅ Fix 4: break adicionado
                }
                case 3: {
                    System.out.print("Código do produto: ");
                    int code = scanner.nextInt();
                    System.out.print("Nova quantidade: ");
                    int newQuantity = scanner.nextInt();
                    System.out.println(gerenciadorEstoque.updateQuantity(code, newQuantity)
                            ? "Quantidade atualizada com sucesso." : "Produto não encontrado.");
                    break;
                }
                case 4: {
                    if (gerenciadorEstoque.isEmpty()) {
                        System.out.println("Nenhum produto no estoque.");
                        break;
                    }
                    gerenciadorEstoque.listProducts();
                    break;
                }
                case 5: {
                    System.out.print("Código do produto: ");
                    int code = scanner.nextInt();
                    Produto found = gerenciadorEstoque.findByCode(code);
                    System.out.println(found != null ? found : "Produto não encontrado.");
                    break;
                }
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }
}
