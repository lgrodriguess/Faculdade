package com.github.lgrodriguess.ex06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GerenciadorEstoque implements Iterable<Produto> { 

    private final List<Produto> productList;

    public GerenciadorEstoque() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Produto produto) {
        getProductList().add(produto);
    }

    
    public boolean removeProduct(Produto produto) {
        return getProductList().remove(produto);
    }

    public boolean updateQuantity(int code, int newQuantity) {
        for (Produto produto : this.productList) {
            if (produto.getCodigo() == code) {
                produto.setQuantidade(newQuantity);
                return true;
            }
        }
        return false;
    }

    public Produto findByCode(int code) {
        for (Produto produto : getProductList()) {
            if (produto.getCodigo() == code) {
                return produto;
            }
        }
        return null;
    }

    public boolean isEmpty() {
        return getProductList().isEmpty();
    }

    public void listProducts() {
        for (Produto produto : getProductList()) {
            System.out.println(produto);
        }
    }

    public List<Produto> getProductList() {
        return productList;
    }

  
    @Override
    public Iterator<Produto> iterator() {
        return productList.iterator();
    }
}
