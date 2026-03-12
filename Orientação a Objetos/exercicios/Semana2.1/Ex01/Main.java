package com.mycompany.mavenproject2;

public class Main{

    public static void main(String[] args) {
        TelefoneCelular celular = new TelefoneCelular();
        
        celular.fill();
        System.out.println(celular.toString());
      
    }
}
