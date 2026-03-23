package com.github.lgrodriguess.ex01;

import java.util.LinkedList;
import java.util.Queue;
//Simule uma fila de atendimento de um banco. Adicione 5 clientes à fila. Enquanto houver clientes, atenda-os um por um (usando `poll()`), exibindo quem está sendo atendido e quantos ainda aguardam. Ao final, confirme que a fila está vazia.
//Dica: use `queue.size()` dentro do `while` para exibir a quantidade de clientes restantes antes de chamar o próximo.
public class Ex01 {

    public static void main(String[] args) {
        
            Queue<String> filaAtendimento = new LinkedList<>();
            filaAtendimento.add("Luan");
            filaAtendimento.add("Vitao");
            filaAtendimento.add("Felipao");
            filaAtendimento.add("Wing");
            filaAtendimento.add("Rodrigo");
            
            
            while(!filaAtendimento.isEmpty()){
                    System.out.println("Temos um total de "+ filaAtendimento.size() + " Cliente/s");
                    String cliente = filaAtendimento.poll();
                    System.out.println("Atendendo " + cliente);
                    System.out.println("Faltam " + filaAtendimento.size() + " cliente/s!");
                        if(!filaAtendimento.isEmpty()){
                          System.out.println("Proximo cliente: " + filaAtendimento.peek()+ "\n");
                        }               
            }
            System.out.println("\n" + "Todos os clientes foram atendidos!!!");
   }
}
