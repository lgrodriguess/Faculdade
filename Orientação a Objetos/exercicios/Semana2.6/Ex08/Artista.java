package com.github.lgrodriguess.ex08;

import java.util.ArrayList;
import java.util.List;

public class Artista {
    private String nome;
    List<Album> albuns;
    
    Artista(){
        this.nome = "";
        this.albuns = new ArrayList<>();
    }
    
    Artista(String nome){
        this.nome = nome;
        this.albuns = new ArrayList<>();
    }

    public void imprimir(){
        System.out.println(this);
    }
    
    @Override
    public String toString() {
        return "Artista{" 
                + "nome=" + nome 
                + ", albuns=" + albuns 
                + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Album> getAlbuns() {
        return albuns;
    }

    public void adicionarAlbuns(Album album) {
        this.albuns.add(album);  
       }
  
    public void adicionarMusica(String nomeAlbum, Musica musica){
        for (Album album : albuns){
            if(album.getNome().equals(nomeAlbum)){
                album.adicionarMusica(musica);
                return;
            }
                System.out.println("Album: '"+ nomeAlbum + "' nao encontrado.");
        }
    }
    
    
}
