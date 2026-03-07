#include<iostream>
using namespace std;

int fvetor(int *v1, int *v2, int tam1, int tam2){
	int soma = 0;
	
	for(int i = 0; i < tam2; i++){
		v1[i] = v2[i];
	}
	for (int i = tam2; i < tam1; i++){
		v1[i] = 5;
	}
	for(int i = 0; i < tam1; i++){
		soma = soma + v1[i];
	}
	return soma;
}

int main(){
	int *v1, *v2, tam1, tam2, aux;
	cout<<"Digite o tamanho do v1: "<<endl;
	cin>>tam1;
	cout<<"Digite o tamanho do v2: "<<endl;
	cin>>tam2;
	
	if (tam1 < tam2){
		aux = tam1;
		tam1 = tam2;
		tam2 = aux;
	}
	v1 = new int[tam1];
	v2 = new int[tam2];
	
	for(int i = 0; i < tam2; i++){
		cout<<"Digite o valor desejado: ";
		cin>> v2[i];
	}
	
	cout<<"Valor da soma : "<< fvetor(v1, v2, tam1, tam2)<<endl;
	return 0;
}
