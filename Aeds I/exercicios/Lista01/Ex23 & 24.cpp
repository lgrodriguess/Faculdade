#include<iostream>
#include<math.h>
using namespace std;


//8. Faça um módulo que verifica se o valor das variáveis **a** `E` **b** é par. and Faça um módulo que verifica se o valor das variáveis a OU b é par.
// OBS : Alem de fazer a verificação de ser par, fiz a verificação individual de cada se sao pares ou impares :)
//Aluno: Luan Rodrigues
//Instituição: If Sudeste MG - Rp
//Período: Primeiro Período

void calculo(){
	int a = 0.0;
	int b = 0.0;
	cout<<"---------------------------------"<<endl;
	cout<<"Informe dois valores de sua escolha!!"<<endl;
	cout<<"---------------------------------"<<endl;
	cin>>a;
	cin>>b;
	
	
	if (a % 2 == 0 and b % 2 == 0 ){
		cout<<"Os dois numeros sao pares."<<endl;	
	}else if (a % 2 == 0 and b % 2 != 0){
		cout<<"O primeiro numero é par e o segundo é impar."<<endl;
	}else if (a % 2 != 0 and b % 2 != 0){
		cout<<"Os dois numeros informados sao impares"<<endl;
	}else if (a % 2 != 0 and b % 2 == 0){
		cout<<"O primeiro numero é impar e o segundo é par."<<endl;
	}
}

int main (){
	calculo();
	return 0;
}
