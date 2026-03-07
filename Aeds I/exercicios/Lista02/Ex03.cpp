//Faça um programa que leia N números e informe a soma e a média dos números.
//Aluno: Luan Rodrigues
//Instituição: If Sudeste MG - Rp
//Período: Primeiro Período
#include<iostream>
using namespace std;

void calculototal(int a){
	int i =1;
	float total = 0;
	float media = 0;
	while(i <= a){
		total = total + i;
		i++;
		}
		media = total/a;
	cout<<"a soma de 1 ate "<<a<<" é "<<total<<endl;
	cout<<"a media das somas é "<<media;
	
}

int main(){
	int a;
	cout<<"Insira um valor que deseja somar e saber a media do resultado."<<endl;
	cin>>a;
	calculototal(a);
	return 0;
}
