/*Exercício 6: você tem 8 bolas de sinuca do
mesmo tamanho. Sete delas tem o mesmo peso
e uma delas pesa um pouco mais. Como é
possível encontrar uma bola que é mais pesada
usando uma balança e somente duas pesagens?*/

#include <iostream>
using namespace std;

int main(){
	int vetor[8] = {9,9,9,10,9,9,9,9};
	
	int grupoA = vetor[0] + vetor[1] + vetor[2];
	int grupoB = vetor[3] + vetor[4] + vetor[5];
	
	int inicio;
	
	if(grupoA == grupoB){
		inicio = 6;
	}else if (grupoA > grupoB){
		inicio = 0;
	}else{
		inicio = 3;
	}
	
	int pesado;
	
	if(vetor[inicio] == vetor[inicio + 1]){
		pesado = inicio + 2;
		cout<<"A bola mais pesada é: "<<vetor[pesado]<<" e ocupa a posicao de numero "<<pesado;
	}else if (vetor[inicio] > vetor[inicio + 1]){
		pesado = inicio;
		cout<<"A bola mais pesada é: "<<vetor[pesado]<<" e ocupa a posicao de numero "<<pesado;
	}else{
		pesado = inicio + 1;
		cout<<"A bola mais pesada é: "<<vetor[pesado]<<" e ocupa a posicao de numero "<<pesado;
	}
	
	return 0;
	
}
