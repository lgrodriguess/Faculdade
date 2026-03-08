package com.mycompany.ex4s1;

public class Ex4S1 {

    public static void main(String[] args) {
        Proprietario p1;
        p1 = new Proprietario();
        p1.setNome("jamil");
        p1.setCpf(23409872341.0);
        
        Carro c1;
        c1 = new Carro();
        c1.setNome("Sentra");
        c1.setMarca("Nissam");
        c1.setAno(2016);
        c1.setPreco(40000);
        c1.setDono(p1);

                
    }    
}
