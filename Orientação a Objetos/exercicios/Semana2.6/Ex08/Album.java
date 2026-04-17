package com.github.lgrodriguess.ex08;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Album {
    private String nome;
    private int anoLancamento;
    private List<Musica> musicas;

    public Album(){
        this.nome = "";
        this.anoLancamento = 0;
        
        this.musicas = new ArrayList<>();
    }
    public Album(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        
        this.musicas = new ArrayList<>();
    }

    public void imprimir(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Album{" 
                + "nome=" + nome 
                + ", anoLancamento=" + anoLancamento 
                + ", musicas=" + musicas 
                + '}';
    }
    
    
    public void copiar(Album outro){
        this.nome = outro.getNome();
        this.anoLancamento = outro.getAnoLancamento();
        
        for(int i=0; i<= outro.musicas.size()-1; i++){
            Musica mi = outro.musicas.get(i);
            
            Musica nova = new Musica();
            nova.copiar(mi);
            
            this.musicas.add(nova); 
            
        }
                
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.nome);
        hash = 37 * hash + this.anoLancamento;
        hash = 37 * hash + Objects.hashCode(this.musicas);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Album other = (Album) obj;
        if (this.anoLancamento != other.anoLancamento) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.musicas, other.musicas);
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    
    public void adicionarMusica(Musica musica){
        this.musicas.add(musica);
    }
    
    public List<Musica> getMusicas(){
        return musicas;   
    }
    

    
    
    
}
