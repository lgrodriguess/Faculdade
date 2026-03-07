#include<iostream>
#include<math.h>
using namespace std;

//Faça um programa que receba 5 notas de 0 a 100 e informe quantas delas são superiores a 60.
//Aluno: Luan Rodrigues
//Instituição: If Sudeste MG - Rp
//Período: Primeiro Período

int main (){
	int numeronotas = 0.0;
	
	float nota1, nota2, nota3, nota4, nota5;
	cout<<"Insira o valor da nota 1"<<endl;
	cin>>nota1;
	cout<<"Insira o valor da nota 2"<<endl;
	cin>>nota2;
	cout<<"Insira o valor da nota 3"<<endl;
	cin>>nota3;
	cout<<"Insira o valor da nota 4"<<endl;
	cin>>nota4;
	cout<<"Insira o valor da nota 5"<<endl;
	cin>>nota5;
	
	if (nota1 > 60){
		numeronotas = numeronotas + 1;
		}
	if (nota2 > 60){
		numeronotas = numeronotas + 1;
	}
	if (nota3 > 60){
		numeronotas = numeronotas + 1;
	}
	if (nota4 > 60){
		numeronotas = numeronotas + 1;
	}
	if (nota5 > 60){
		numeronotas = numeronotas + 1;
	}

	cout<<"O numero de notas maior que o valor de 60 é : "<<numeronotas<<endl;
	
	return 0;
}
