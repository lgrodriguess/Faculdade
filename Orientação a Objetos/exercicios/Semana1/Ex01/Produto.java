package com.mycompany.ex1s1;

public class Produto {
        private String nome;
        private int estoque;
        private double preco;
        
        
        public Produto(){
            this.nome = "";
            this.estoque = 0;
            this.preco = 0.0;
        }
        
        public Produto(String nome, int estoque, double preco){
            this.nome = nome;
            this.estoque = estoque;
            this.preco = preco;
        }
}
