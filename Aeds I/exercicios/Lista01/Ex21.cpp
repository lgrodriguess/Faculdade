#include<iostream>
using namespace std;

//Faça um programa que receba um numero e informe se ele é par ou impar.
//Aluno: Luan Rodrigues
//Instituição: If Sudeste MG - Rp
//Período: Primeiro Período

void calculo(){
	int x = 0.0;
	cout<<"---------------------------------"<<endl;
	cout<<"Informe um valor de sua escolha!!"<<endl;
	cout<<"---------------------------------"<<endl;
	cin>>x;
	
	
	if (x % 2 == 0){
		cout<<"O numero informado é par."<<endl;
}
	else {
		cout<<"O numero informado é impar."<<endl;
	}
}
int main (){
	
	calculo();
	
	return 0;
}
