package com.github.lgrodriguess.ex9;

public class Main {

    public static void main(String[] args) {
        /*
        Geralmente faço assim
        
        Casa c1 = new Casa();
        Casa c2 = new Casa();
        Casa c3 = new Casa();
        
        c1.fill();
        c2.fill();
        c3.fill();
        */
        
        Casa c1 = new Casa("Rua das Flores, 123", 200, 3, 95000);
        Casa c2 = new Casa("Av. Paulista, 456", 120, 2, 78000);
        Casa c3 = new Casa("Rua do Lago, 78", 350, 4, 14000);
        
        System.out.println(c1.exibirResumo());
        System.out.println(c2.exibirResumo());
        System.out.println(c3.exibirResumo()); 
        
        double p1 = c1.calcularPrecoPorM2();
        double p2 = c2.calcularPrecoPorM2();
        double p3 = c3.calcularPrecoPorM2();
        
        if(p1 < p2 && p1 < p3){
            System.out.println("Melhor custo por m²: " + c1.getEndereco() + " - " + p1);
        }else if(p2 < p1 && p2 < p3){
            System.out.println("Melhor custo por m²: " + c2.getEndereco() + " - " + p2);
        }else{
            System.out.println("Melhor custo por m²: " + c3.getEndereco() + " - " + p3);
        }
    }
}
