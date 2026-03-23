package com.github.lgrodriguess.ex03;
import java.util.HashSet;
import java.util.Stack;
/*Simule um histórico de navegação usando uma `Stack<String>` com 4 páginas visitadas em ordem.
Depois implemente o botão "voltar": remova e exiba as páginas uma a uma com `pop()`.
Use um `HashSet` para registrar apenas os domínios únicos visitados.*/

public class Ex03 {

    public static void main(String[] args) {
        
        Stack<String> Historico = new Stack<>();
        Historico.push("Disney+");
        Historico.push("Twitch");
        Historico.push("Kick");
        Historico.push("Crunchyroll");
        Historico.push("Kick");
        
        HashSet<String> dominios = new HashSet<>();
        dominios.addAll(Historico);
        
        for(int i = Historico.size()-1; i >= 0; i--){
            System.out.println("Site visitado -  " + Historico.get(i));
        }

        while (!Historico.isEmpty()) {
            voltar(Historico);
        }
        
        System.out.println("\nDominios unicos visitados:");
        System.out.println(dominios);
    }
    
    
    static void voltar(Stack<String> Historico){
        String removido = Historico.pop();
        System.out.println("");
        
        System.out.println("Voltou de: " + removido);
        for(int i = Historico.size()-1; i >= 0; i--){
            System.out.println("Site visitado -  " + Historico.get(i));
        }
        if(Historico.isEmpty()){
            System.out.println("Historico de navegacao excluido.");
        }
    }
    }

