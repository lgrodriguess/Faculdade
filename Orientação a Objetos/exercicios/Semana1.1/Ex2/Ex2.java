//Faça um programa em java que leia do teclado um numero inteiro e efetue a soma de todos os impares de 0 até este número. Lembre-se que para ler uma informação do teclado é necessário usar a classe SCANNER.
package com.mycompany.ex2;

import java.util.Scanner;


class Ex2{

	public static void main( String[] args ) {
		Scanner ler = new Scanner(System.in);
		int num1;
		System.out.print("Coloque o numero: ");
		num1 = ler.nextInt();
                int soma = 0;
                
                for(int i = 0; i <= num1; i++){
                    if(i % 2 != 0){
                        soma += i;   
                    }
                    }
                System.out.println("A soma dos numeros impares de 0 até "+num1+" é: "+soma);
                
    }
}
