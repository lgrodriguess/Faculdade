//Ler um vetor Q de 20 posições (aceitar somente números positivos). Escrever a seguir o valor do maior elemento de Q e a respectiva posição que ele ocupa no vetor.
#include<iostream>
using namespace std;

int main(){
	int maior = 0;
	int posicao;
	int* Q = new int[20];
	for(int i = 0; i < 20; i++){
	do{
		cout<<"Digite o "<<i+1<<" numero!"<<endl;
			cin>>Q[i];
		if ( Q[i] < 0){
			cout<<"Numero Invalido!"<<endl;
		}
		} while(Q[i] < 0);
		
		if ( maior < Q[i]){
			maior = Q[i];
			posicao = i + 1;
}
}
	cout<<"O maior numero eh: "<<maior<< " e ocupa a "<<posicao<<" posicao";
	return 0;
}
