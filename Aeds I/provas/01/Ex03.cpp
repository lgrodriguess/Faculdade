//Desenvolver um algoritmo que faça a leitura de 6 números reais no main e, numa sub-rotina a parte,
//imprima se os três primeiros valores são iguais ou se os três últimos valores são iguais, em caso afirmativo,
//retorne o valor 15. Caso contrário, ou seja, se nenhum dos dois casos acontecerem, imprimir um alerta ao
//usuário somente se a soma dos seis números resultar num valor que é múltiplo do último valor digitado. A
//sub-rotina deve sempre retornar o valor desse somatório. No main, se o retorno for 15, imprimir Ótimo, se for diferente de 15, imprimir Excelente.

//Aluno: Luan Rodrigues
//Instituição: If Sudeste MG - Rp
//Período: Primeiro Período

#include<iostream>
#include<math.h>
using namespace std;

void valor(int num1, int num2, int num3, int num4, int num5, int num6){
	int final =0;
	if (num1 == num2 and num1 == num3 or num4 == num5 and num4 == num6){
		final = 15;
		cout<<"Otimo! Valor = "<<final<<endl;
	}else if ((num1 + num2 + num3 + num4 + num5 + num6) % num6 == 0){
		final = num1 + num2 + num3 + num4 + num5 + num6;
		cout<<"ALERTA!!! ALERTA!!!"<<endl;
		cout<<"Soma total é : "<<final<<endl;
	}else{
		cout<<"Excelente!!"<<endl;
	}
		
}


int main(){
	int num1=0, num2=0, num3=0, num4=0, num5=0, num6=0;
	cout<<"Insira o primeiro valor!"<<endl;
	cin>>num1;
	cout<<"Insira o segundo valor!"<<endl;
	cin>>num2;
	cout<<"Insira o terceiro valor!"<<endl;
	cin>>num3;
	cout<<"Insira o quarto valor!"<<endl;
	cin>>num4;
	cout<<"Insira o quinto valor!"<<endl;
	cin>>num5;
	cout<<"Insira o sexto valor!"<<endl;
	cin>>num6;
	
	valor(num1,num2,num3,num4,num5,num6);
	return 0;	
}
