package com.github.lgrodriguess.ex11;
import java.util.ArrayList;
import java.util.List;
public class GerenciadorDeTransacoes {
    private List<Transacao> lst;
    
    GerenciadorDeTransacoes(){
        this.lst = new ArrayList<>();
    }
    public void listarTransacoes(){
        if(lst.isEmpty()){
            System.out.println("Lista vazia.");
            return;
        }
        for(Transacao transacao : lst){
            System.out.println(transacao);
        }
    }
    public void add(Transacao transacao){
        if(transacao != null){
            lst.add(transacao);
        }
    }
    public void remove(String idTransacao){
        lst.removeIf(transacao -> transacao.getID().equalsIgnoreCase(idTransacao));
    }
    public List<Transacao> getTransacoes(){
        return lst;
    }
}
