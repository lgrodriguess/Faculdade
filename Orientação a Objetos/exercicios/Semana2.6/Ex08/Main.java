package com.github.lgrodriguess.ex08;
public class Main {

    public static void main(String[] args) {
        Artista artista1 = new Artista("Rogerio");
        Album Sol = new Album("Sol", 2020);
        Album Luz = new Album("Luz", 2021);
        
        Artista artista2 = new Artista ("Cleiton");
        Album album1 = new Album("Album1", 1980);
        Album album2 = new Album("Album2", 1987);
        
        artista1.adicionarAlbuns(Sol);
        artista1.adicionarAlbuns(Luz);
        
        Musica Raio = new Musica("Raio", 3.30);
        Musica Calor = new Musica("Calor", 4.00);
        Musica Claro = new Musica("Claro", 4.20);
        Musica Luminoso = new Musica("Luminoso", 5.00);
        Musica Brighter = new Musica("Brighter", 2.45);
        

        artista1.adicionarMusica(Sol.getNome(), Raio);
        artista1.adicionarMusica(Sol.getNome(), Calor); // Adicionando duas músicas ao Álbum 1
        artista1.adicionarMusica(Luz.getNome(), Claro); // ao album 2
        artista1.adicionarMusica(Luz.getNome(), Luminoso);
        artista1.adicionarMusica(Luz.getNome(), Brighter);
        
        
        artista2.adicionarAlbuns(album1);
        artista2.adicionarAlbuns(album2);
        
        Musica m1 = new Musica("M1", 2.30);
        Musica m2 = new Musica("M2", 2.55);
        Musica m3 = new Musica("M3", 5.00);
        Musica m5 = new Musica("M5", 4.47);
        
        artista2.adicionarMusica(album1.getNome(), m1);
        artista2.adicionarMusica(album1.getNome(), m2);
        artista2.adicionarMusica(album1.getNome(), m3);
        artista2.adicionarMusica(album1.getNome(), m5);
                
        
        

        // Supondo a existência de um gerenciador para facilitar as consultas
        Gerenciador gerenciador = new Gerenciador();
        gerenciador.adicionarArtistas(artista1);
        gerenciador.adicionarArtistas(artista2);

        Artista artistaComMaisAlbuns = gerenciador.artistaComMaisAlbuns();
        System.out.println("Artista com mais álbuns: " + artistaComMaisAlbuns.getNome());

        Album albumComMaisMusicas = gerenciador.albumComMaisMusicas();
        System.out.println("Álbum com mais músicas: " + albumComMaisMusicas.getNome());
    }
    }

