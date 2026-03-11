
package com.github.lgrodriguess.ex8;

import java.util.Scanner;

public class Musica {
        private String titulo;
        private String artista;
        private double duracao;
        private double preco;
        
        Musica(){
            this.titulo = "";
            this.artista = "";
            this.duracao = 0.0;
            this.preco = 0.0;
        }
        Musica(String titulo, String artista, double duracao, double preco){
            this.titulo = titulo;
            this.artista = artista;
            this.duracao = duracao;
            this.preco = preco;
        }
        //Copy
        void Copy(Musica other){
            this.titulo = other.getTitulo();
            this.artista = other.getArtista();
            this.duracao = other.getDuracao();
            this.preco = other.getPreco(); 
        }
        //Setters
        public void setTitulo(String titulo){
            this.titulo = titulo;
        }
        public void setArtista(String artista){
            this.artista = artista;
        }
        public void setDuracao(double duracao){
            this.duracao = duracao;
        }
        public void setPreco(double preco){
            this.preco = preco;
        }
        //Getters
        public String getTitulo(){
            return this.titulo;
        }
        public String getArtista(){
            return this.artista;
        }
        public double getDuracao(){
            return this.duracao;
        }
        public double getPreco(){
            return this.preco;
        }
        //Preencher
        public void fill(){
            Scanner ler = new Scanner(System.in);
            
            System.out.println("Titulo:");
            this.titulo = ler.nextLine();
            System.out.println("Artista:");
            this.artista = ler.nextLine();
            System.out.println("Duracao:");
            this.duracao = ler.nextDouble(); ler.nextLine();
            System.out.println("Preco:");
            this.preco = ler.nextDouble();
        }
        //Imprimir
        public String toString(){
            return  "Musica{\n" +
                    "Titulo= '" + this.titulo + "'\n" +
                    "Artista= '" + this.artista + "'\n" +
                    "Duracao= '" + this.duracao + "'\n" +
                    "Preco= '" + this.preco + "'\n" +
                    "}";        
        }
        public void tocarMusica(){
            System.out.println("A musica " + this.titulo + " está tocando!");
    }
        public void desligarMusica(){
            System.out.println("A musica " + this.titulo + " parou de tocar!");
        }
}
