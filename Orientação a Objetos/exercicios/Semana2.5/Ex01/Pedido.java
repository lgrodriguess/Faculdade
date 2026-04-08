
package com.github.lgrodriguess;

import java.util.Scanner;

public class Pedido {
        private String numero;
        private String data;
        private double quantidade;
        private Produto produto;
        
        
    public Pedido(){
        this.numero = "";
        this.data = "";
        this.quantidade = 0.0;
        this.produto = new Produto();
    }    
    
    public void copy(Pedido other){
        this.numero = other.getNumero();
        this.data = other.getData();
        this.quantidade = other.getQuantidade();
        
        Produto p = new Produto();
        p.copy(other.getProduto());
        this.produto = p;
    }

    public Pedido(String numero, String data, double quantidade, Produto produto) {
        this.numero = numero;
        this.data = data;
        this.quantidade = quantidade;
        this.produto = produto;
    }
    
    public double calcularTotal(){
        return this.quantidade * this.produto.getPreco();
    }
    

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Pedido{" + "numero=" + numero + ", data=" + data + ", quantidade=" + quantidade + ", produto=" + produto + '}';
    }
        
    public void fill(){
        Scanner ler = new Scanner(System.in);
        
        System.out.print("numero: ");
        this.numero = ler.nextLine();
        
        System.out.print("Data: ");
        this.data = ler.nextLine();
        
        System.out.print("Quantidade: ");
        this.quantidade = ler.nextDouble();
        
        Produto p = new Produto();
        p.fill();
        
        this.produto = p;
        
    }
        
    
}
