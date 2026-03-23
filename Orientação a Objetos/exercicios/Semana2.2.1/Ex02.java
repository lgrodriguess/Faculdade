package com.github.lgrodriguess.ex02;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Crie um `HashMap<String, Double>` que armazene pelo menos 4 produtos e seus preços. Implemente as seguintes operações: 

(a) exiba todos os pares produto/preço; 

(b) atualize o preço de um produto; 

(c) verifique se um produto existe antes de removê-lo.

Dica: use `entrySet()` para percorrer, `containsKey()` antes de remover e `put()` para atualizar. */

public class Ex02 {

    public static void main(String[] args) {
        
       //letra A
       Map<String, Double> produtos = new HashMap<>(); //Criacao do HashMap
       produtos.put("Carne",4.50); //o put, vai adicionar um produto dentro do map passando seus respectivos valores de String e Double;
       produtos.put("Ovos", 5.65);
       produtos.put("Banana", 3.45);
       produtos.put("Queijo", 2.75);
       
       for(Map.Entry<String,Double> p : produtos.entrySet()){
           System.out.println(p.getKey() + ": " + p.getValue() + " Reais");
           }
       //letra B
       produtos.put("Banana", 5.45); 
       
       //letra C
       Scanner leitor = new Scanner(System.in); //Aq criei o scanner, para o usuario inserir o produto que deseja verificar pra remover
       System.out.println("Escreva o nome do produto que deseja remover:");
       String busca = leitor.next();

        if (produtos.containsKey(busca)) {
            System.out.println("O produto " + busca + " foi encontrado");
            System.out.println("Deseja remover? Digite 1 para sim e 2 para nao!");
            int escolha = leitor.nextInt();
                if(escolha == 1){
                    produtos.remove(busca);
                    System.out.println("O produto " + busca + " foi removido");
                }else{
                    System.out.println("O produto " + busca + " nao foi removido");
                }
        } else {
            System.out.println("Não existe produto com esse nome para ser removido!");
        }
    }
   } 
