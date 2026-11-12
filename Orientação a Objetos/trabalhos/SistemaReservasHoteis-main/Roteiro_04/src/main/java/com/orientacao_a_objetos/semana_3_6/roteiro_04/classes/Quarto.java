package com.orientacao_a_objetos.semana_3_6.roteiro_04.classes;

import java.util.Objects;

public class Quarto {
    private int num;
    private String tipo;
    private double preco;
    
    public Quarto(){
        this.num = 0;
        this.tipo = "";
        this.preco = 0.0;
    }
    public Quarto(int num, String tipo, double preco) {
        this.num = num;
        this.tipo = tipo;
        this.preco = preco;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.num);
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
        final Quarto other = (Quarto) obj;
        return Objects.equals(this.num, other.num);
    }

    @Override
    public String toString() {
        return "Quarto{" + "num=" + num +", tipo=" + tipo + ", preco=" + preco + '}';
    }
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
}
