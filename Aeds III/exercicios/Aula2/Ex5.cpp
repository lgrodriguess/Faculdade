/*encontre o elemento majoritário de
um vetor de tamanho n e verifique a
complexidade do algoritmo.
O elemento majoritário é o elemento que
aparece mais de ⌊
n
2
⌋ vezes, e portanto só existe
um elemento deste tipo por vetor. Você pode
assumir que o vetor não está vazio e o elemento
majoritário sempre existe dentro do vetor.
Entrada: Vetor de inteiros e tamanho.
Saída: O elemento majoritário no vetor.*/

#include <iostream>
using namespace std;

int main(){
	int	vetor[] = {4,6,3,4,4,7};
	int tamanhoV = 6;
	
	int elementoMajoritario = 0;
	int contador = 0;
	
	for(int i = 0; i < tamanhoV; i++){
		contador = 0;
		
		for(int j = 0; j < tamanhoV; j++){
			
			if(vetor[j] == vetor[i]){
				contador ++;
			}
			
			if(contador >= tamanhoV/2){
				elementoMajoritario = vetor[i];
				
			}
		}		
	}
	
	cout<<"O elemento majoritario do vetor é: "<<elementoMajoritario;
	
}
