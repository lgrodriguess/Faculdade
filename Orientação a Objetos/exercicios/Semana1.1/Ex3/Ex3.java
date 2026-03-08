//Faça um programa que receba como entrada o nome de dois alunos e verifique se eles tem o mesmo nome. Caso na tenham o mesmo nome informe qual dos dois tem maior número de caracteres. Dica: use os métodos da classe string
package com.mycompany.ex3;

import java.util.Scanner;


class Ex3{

	public static void main( String[] args ) {
		Scanner ler = new Scanner(System.in);
		String nome1, nome2;
                System.out.println("Escreva o primeiro nome:");
                nome1 = ler.next();
                int quant1 = nome1.length();
                System.out.println("Escreva o segundo nome:");
                nome2 = ler.next();
                int quant2 = nome2.length();//calcula a quantidade de letras
                
                if(quant1 == quant2){
                    System.out.println("Os dois nomes tem o mesmo numero de letras!");
                }else if(quant1 > quant2){
                    System.out.println("O primeiro nome tem mais letras("+quant1+")");
                }else{
                    System.out.println("O segundo nome tem mais letras("+quant2+")");
                }
                
    }
}
