//Elaborar um algoritmo que lê 3 valores a, b, c e os escreve. A seguir, encontre o maior dos 3 valores e o escreva com na tela "O maior dentre os três é: __ ".
//Aluno: Luan Rodrigues
//Instituição: If Sudeste MG - Rp
//Período: Primeiro Período

#include<iostream>
#include<math.h>
using namespace std;

void verificar(float n1, float n2, float n3){
	cout<<"Os numeros inseridos foram: "<<n1<<", "<<n2<<", "<<n3<<endl;
	
	if(n1 >= n2 and n1 >= n3){
		cout<<"O numero "<<n1<<", é o maior dentre os 3."<<endl;
	}else if(n2 >=  n1 and n2 >= n3){
		cout<<"O numero "<<n2<<", é o maior dentre os 3."<<endl;
	}else if(n3 >= n1 and n3 >= n2){
		cout<<"O numero "<<n3<<", é o maior dentre os 3."<<endl;
	}
	

}	

int main (){
	float n1 = 0.0, n2 = 0.0, n3 = 0.0;
	cout<<"Insira o primeiro numero."<<endl;
	cin>>n1;
	cout<<"Insira o segundo numero."<<endl;
	cin>>n2;
	cout<<"Insira o terceiro numero."<<endl;
	cin>>n3;
	
	verificar(n1, n2, n3);
	return 0;
}
