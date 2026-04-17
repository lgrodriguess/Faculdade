package com.github.lgrodriguess.ex08;

import java.util.ArrayList;
import java.util.List;

public class Gerenciador {
    private List<Artista> artistas;
    
    Gerenciador(){
        this.artistas = new ArrayList<>();
    }  

    public List<Artista> getArtistas() {
        return artistas;
    }

    public void adicionarArtistas(Artista artista) {
        this.artistas.add(artista);
    }
    
    
    public Artista artistaComMaisAlbuns(){
        Artista artistaMaisAlbuns = null;
        int numAlbuns = 0;
        
        for(Artista artista : artistas){
            int quantidade = artista.getAlbuns().size();
            
            if(quantidade > numAlbuns){
                numAlbuns = quantidade;
                artistaMaisAlbuns = artista;
            }
        }
        return artistaMaisAlbuns;
    }
    
    public Album albumComMaisMusicas(){
        Album albumMaisMusica = null;
        int numMusica = 0;
        
        for(Artista artista : artistas){
            for(Album album : artista.getAlbuns()){
                
            int quantidade = album.getMusicas().size();
            
                if(quantidade > numMusica){
                    numMusica = quantidade;
                    albumMaisMusica = album;
            }
            }
        }
        return albumMaisMusica;
    }
    
    
    
    
}
