#include<iostream>
#include<math.h>
using namespace std;

//7. Faça um algoritmo que leia um numero inteiro e mostre uma mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.
//Aluno: Luan Rodrigues
//Instituição: If Sudeste MG - Rp
//Período: Primeiro Período


void calculo(){
	int x = 0.0;
	cout<<"---------------------------------"<<endl;
	cout<<"Informe um valor de sua escolha!!"<<endl;
	cout<<"---------------------------------"<<endl;
	cin>>x;
	
	
	if (x % 2 == 0 and x > 0){
		cout<<"O numero informado é positivo e par."<<endl;
	
	}else if (x % 2 == 0 and x < 0){
		cout<<"O numero informado é negativo e par."<<endl;
	}else if (x % 2 != 0 and x > 0){
		cout<<"O numero informado é positivo e impar."<<endl;
	}else if (x % 2 != 0 and x < 0){
		cout<<"O numero informado é negativo e impar."<<endl;
	}
}
int main (){
	
	calculo();
	
	return 0;
}
