package com.orientacao_a_objetos.semana_3_6.roteiro_04.gerenciadores;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorContato {
    private List<String> contatos;  
    
    public GerenciadorContato(){
        this.contatos = new ArrayList<>();
    }
    public void add(String contato){
    contatos.add(contato);
    }
    public void remove(int contato){
       contatos.remove(Integer.valueOf(contato));
    }
    public boolean buscar(int contato){
        return contatos.contains(contato);
    }
    public void listar(){
        System.out.println(contatos);
    }

    public List<String> getContatos() {
        return contatos;
    }

    public void setContatos(List<String> contatos) {
        this.contatos = contatos;
    }
  
}
