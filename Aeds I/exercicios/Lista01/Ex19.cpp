#include<iostream>
#include<math.h>
using namespace std;

//Faça um programa que receba como entrada a idade de uma pessoa e informe se ela está apta ou não a tirar carteira de motorista
//Aluno: Luan Rodrigues
//Instituição: If Sudeste MG - Rp
//Período: Primeiro Período

void carteira(float x){
	cout<<"------------------------------------------------------------------------------------------------"<<endl;
	cout<<"|Bem vindo/a a AutoEscola Rodrigo! Vamos ver se voce tem idade suficiente pra tirar a carteira?|"<<endl;
	cout<<"------------------------------------------------------------------------------------------------"<<endl;
	cout<<endl<<"Digite sua idade!!"<<endl;
	cin>>x;
	
	if (x >= 18){
		cout<<"------------------------------------------------"<<endl;
		cout<<"Voce está apto à tirar a carteira de motorista!!"<<endl;
		cout<<"Vamos fazer sua inscrição??"<<endl;
		cout<<"------------------------------------------------"<<endl;
	}else if (x < 18){
		cout<<"----------------------------------------------------"<<endl;
		cout<<"Voce não está apto à tirar a carteira de motorista!!"<<endl;
		cout<<"Que pena!!"<<endl;
		cout<<"------------------------------------------------"<<endl;
	}
}

int main (){
	float x = 0.0;
	carteira(x);
	
	return 0;
	
}
