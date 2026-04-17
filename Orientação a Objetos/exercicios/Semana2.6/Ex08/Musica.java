package com.github.lgrodriguess.ex08;

import java.util.Objects;

public class Musica {
    private String titulo;
    private double duracao;
    
    public Musica(){
        this.titulo = "";
        this.duracao = 0.0;
    }

    public Musica(String titulo, double duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }
    
    public void copiar(Musica outra){
        this.titulo = outra.getTitulo();
        this.duracao = outra.getDuracao();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Musica{" + 
                "titulo=" + titulo + 
                ", duracao=" + duracao + '}';
    }
    
    public void imprimir(){
        System.out.println(this);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.titulo);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.duracao) ^ (Double.doubleToLongBits(this.duracao) >>> 32));
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
        final Musica other = (Musica) obj;
        if (Double.doubleToLongBits(this.duracao) != Double.doubleToLongBits(other.duracao)) {
            return false;
        }
        return Objects.equals(this.titulo, other.titulo);
    }

    
    
    
    
    
}
