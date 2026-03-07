#include<iostream>
#include<math.h>
using namespace std;

//Faça um programa que receba como entrada um	numero qualquer do usuário e informe se o número é positivo ou negativo.
//Aluno: Luan Rodrigues
//Instituição: If Sudeste MG - Rp
//Período: Primeiro Período

void programa(float a){
	if (a == 0){
		cout<<"Seu numero é neutro!"<<endl;
	}else if (a > 0){
		cout<<"Seu numero é positivo!"<<endl;
	}else if (a < 0){
		cout<<"Seu numero é negativo!"<<endl;
	}	
}

int main (){
	float a = 0.0;
	cout<<"-------------------------------------------------"<<endl;
	cout<<"Vamos ver se o seu numero é positivo ou negativo!"<<endl;
	cout<<"-------------------------------------------------"<<endl;
	cout<<endl<<" Insira Seu numero!"<<endl;
	cin>>a;
	programa(a);
	
	return 0;
	}
