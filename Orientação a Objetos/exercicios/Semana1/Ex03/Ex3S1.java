
package com.mycompany.ex3s1;

public class Ex3S1 {

    public static void main(String[] args) {
        Carro c1, c2;
        
        c1 = new Carro();
        c1.setNome("Sentra");
        c1.setMarca("Nissam");
        c1.setAno(2016);
        c1.setPreco(40000);
        
        c2 = new Carro();
        c2.setNome("Livinea");
        c2.setMarca("Nissam");
        c2.setAno(2021);
        c2.setPreco(80000);
        
        //copiar nome do c1 para o c2
        c2.setNome(c1.getNome());
      
    }
}
