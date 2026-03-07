//Simulado - Questao 1



#include<iostream>
using namespace std;

float menu(){
	char codigo = 0.0;
	float valor = 0.0;
	
	
	cout<<"Calculadora do valor atualizado de tipos diferentes de carros"<<endl;
	cout<<"Para carros Sedan Codigo s"<<endl;
	cout<<"Para carros Conversiveis Codigo c"<<endl;
	cout<<"Para carros Populares Codigo p"<<endl;
	cout<<"Para outros tipos de carro Codigo x"<<endl;
	cout<<"Insira o codigo do carro"<<endl;
	cin>>codigo;

	return codigo;
}

float calculo(char codigo){

	float novovalor = 0.0;
	float valor = 0.0;
		cout<<"Insira o valor do carro"<<endl;
		cin>>valor;
	
	switch(codigo){
		case 's':
			if (valor < 150000){
				novovalor = valor + (valor * 0.11);
				cout<<"O valor antigo era R$"<<valor<<endl;
		
			}else {
				novovalor = valor + (valor * 0.07);
				cout<<"O valor antigo era R$"<<valor<<endl;
		
			}
				break;
				
		case 'c':
			if (valor < 100000){
				novovalor = valor + (valor * 0.09);
				cout<<"O valor antigo era R$"<<valor<<endl;
			
			}else{
				novovalor = valor;
				cout<<"Nao houve alteracao no valor do carro"<<endl;
			
			}
				break;
		case 'p':
				novovalor = valor + (valor * 0.04);
				cout<<"O valor antigo era R$"<<valor<<endl;
			
				break;
		case 'x':
				novovalor = valor + (valor * 0.05);
				cout<<"O valor antigo era R$"<<valor<<endl;
				
				
				break;
				
}
				return novovalor;
}

int main(){
	int a = calculo(menu());
	cout<<"O valor novo é R$"<<a;
			return 0;	
	
}
