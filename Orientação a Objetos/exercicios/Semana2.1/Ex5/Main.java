package com.github.lgrodriguess.ex5certo;

public class Main {

    public static void main(String[] args) {
        AnimalEst a1= new AnimalEst();
        AnimalEst a2= new AnimalEst();
        AnimalEst a3= new AnimalEst();
        
        a1.fill();
        a2.fill();
        a3.fill();
        
        System.out.println("Animal 1:");
        System.out.println(a1.toString());
        
        System.out.println("Animal 2:");
        System.out.println(a2.toString());
        
        System.out.println("Animal 3:");
        System.out.println(a3.toString());
        
    }
}
