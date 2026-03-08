//Faça um programa em java que leia do teclado dois números reais e informe o maior deles. Lembre-se que para ler uma informação do teclado é necessário usar a classe SCANNER.
package com.mycompany.ex1;

import java.util.Scanner;


class Ex1{

	public static void main( String[] args ) {
		Scanner ler = new Scanner(System.in);
		int num1, num2;
		System.out.print("Coloque o primeiro o numero: ");
		num1 = ler.nextInt();
		System.out.println("Coloque o segundo numero: ");
                num2 = ler.nextInt();
                
                if(num1 > num2){
                    System.out.println("O numero 1(" +num1+ ") eh maior.");
                }else if(num2 > num1){
                    System.out.println("O numero 2(" +num2+ ") eh maior.");
                }else{
                    System.out.println("Os dois numero sao iguais.");
                }
			}
}
