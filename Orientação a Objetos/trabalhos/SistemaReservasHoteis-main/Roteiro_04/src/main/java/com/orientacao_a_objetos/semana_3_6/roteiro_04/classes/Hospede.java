package com.orientacao_a_objetos.semana_3_6.roteiro_04.classes;

import com.orientacao_a_objetos.semana_3_6.roteiro_04.gerenciadores.GerenciadorContato;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

public class Hospede {
    private String ID;
    private String nome;
    private String documento;
    private Endereco endereco;
    private GerenciadorContato contatos;
    
    public Hospede(){
        this.ID = "";
        this.nome = "";
        this.documento = "";
        this.endereco = new Endereco();
        this.contatos = new GerenciadorContato();
    }
    
    public Hospede(String ID, String nome, String documento) {
        this.ID = ID;
        this.nome = nome;
        this.documento = documento;
        this.endereco = new Endereco();
        this.contatos = new GerenciadorContato();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.ID);
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
        final Hospede other = (Hospede) obj;
        return Objects.equals(this.ID, other.ID);
    }

    @Override
    public String toString() {
        return "Hospede{" + "ID=" + ID + ", nome=" + nome + ", endereco=" + endereco + ", contatos=" + contatos + '}';
    }

    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public GerenciadorContato getContatos() {
        return contatos;
    }

    public void setContatos(GerenciadorContato contatos) {
        this.contatos = contatos;
    }
    @JsonIgnore
    public String getPrimeiroContato() {
        if(contatos.getContatos().isEmpty()) {
            return "";
        }
    return contatos.getContatos().get(0);
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    
    
    
    
}
