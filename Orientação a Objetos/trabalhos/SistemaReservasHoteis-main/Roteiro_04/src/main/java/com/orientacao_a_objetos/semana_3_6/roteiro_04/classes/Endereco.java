package com.orientacao_a_objetos.semana_3_6.roteiro_04.classes;

import java.util.Objects;

public class Endereco {
    private String CEP;
    private String cidade;
    private String rua;
    private int num;
    
    public Endereco(){
        this.CEP = "";
        this.cidade = "";
        this.rua = "";
        this.num = -1;
    }
    public Endereco(String CEP, String cidade, String rua, int num) {
        this.CEP = CEP;
        this.cidade = cidade;
        this.rua = rua;
        this.num = num;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.CEP);
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
        final Endereco other = (Endereco) obj;
        if (!Objects.equals(this.CEP, other.CEP)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.rua, other.rua)) {
            return false;
        }
        return Objects.equals(this.num, other.num);
    }

    @Override
    public String toString() {
        return "Endereco{" + "CEP=" + CEP + ", cidade=" + cidade + ", rua=" + rua + ", num=" + num + '}';
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
    
}
