/*Exercício 3: implemente o algoritmo anterior.
1. Verifique seu resultado.
2. Mostre quantas vezes a função recursiva foi
chamada em cada execução.
3. Calcule 10^0, 10^1, 10^2, 10^3, ... 10^100000.

4. Faça um gráfico com os resultados obtidos no
Google Planilhas (Spreadsheets). (Feito a parte) */

#include <stdio.h>
#include <iostream>
using namespace std;

int contador = 0;

double power(double x, int n) {
	contador ++;
    if (n == 0) return 1; // caso base x^0 = 1
    if (n < 0) { // expoentes negativos
        x = 1 / x;
        n = -n;
    }
    // guarda recursao com metade de n
    double half = power(x, n / 2); 
    // n par: eleva o resultado de metade
    // do expoente ao quadrado
    if (n % 2 == 0) return half * half; 
    // n impar: faz o mesmo e multiplica pela base
    else return x * half * half; 
}

int main() {
		for(int i = 0; i<=100000; i++){
			contador = 0;
			power(10.0,i);
			//cout<<"10^"<<i<<" :"<<power(10.0,i)<<" ";
			cout<<contador<<endl;
		}

    return 0;
}
