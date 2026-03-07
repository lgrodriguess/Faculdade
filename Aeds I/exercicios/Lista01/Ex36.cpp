#include<iostream>
#include<math.h>
using namespace std;


//Calculadora de IMC
//Aluno: Luan Rodrigues
//Instituição: If Sudeste MG - Rp
//Período: Primeiro Período



void imc(float a, float p){
	float altura = 0;
	float peso = 0;
	float calculo = 0;
	float imc = 0;
	cout<<"----------------"<<endl;
	cout<<"Insira seu peso "<<endl;
	cout<<"----------------"<<endl;
	cin>>peso;
	
	cout<<"-----------------"<<endl;
	cout<<"Insira sua altura"<<endl;
	cout<<"-----------------"<<endl;
	cin>>altura;
	
	
	calculo = peso/pow(altura,2);
	imc = calculo;
	cout<<"Seu imc é "<<calculo<<endl;
	
	
	if (imc <= 16){
		cout<<"---------------------"<<endl;
		cout<<"Magreza Grave"<<endl;
		cout<<"Procure ajuda médica!"<<endl;
		cout<<"---------------------"<<endl;
	}else if (imc <= 17){
		cout<<"----------------"<<endl;
		cout<<"Magreza Moderada"<<endl;
		cout<<"----------------"<<endl;
	}else if (imc >= 17 and imc < 18.5){
		cout<<"------------"<<endl;
		cout<<"Magreza Leve"<<endl;
		cout<<"------------"<<endl;
	}else if (imc >= 18.5 and imc <25){
		cout<<"--------"<<endl;
		cout<<"Saudavel"<<endl;
		cout<<"--------"<<endl;
	}else if (imc >= 25 and imc < 30){
		cout<<"---------"<<endl;
		cout<<"Sobrepeso"<<endl;
		cout<<"---------"<<endl;
	}else if (imc >= 30 and imc < 35){
		cout<<"----------------"<<endl;
		cout<<"Obesidade Grau 1"<<endl;
		cout<<"----------------"<<endl;
	}else if (imc >= 35 and imc < 40){
		cout<<"-------------------------"<<endl;
		cout<<"Obesidade Grau 2 (Severa)"<<endl;
		cout<<"Procure ajuda médica!"<<endl;
		cout<<"-------------------------"<<endl;
	}else if (imc >= 40){
		cout<<"--------------------------"<<endl;
		cout<<"Obesidade Grau 3 (Mórbida)"<<endl;
		cout<<"Procure ajuda médica!"<<endl;
		cout<<"--------------------------"<<endl;	
	}
}


int main(){
	float p = 0;
	float a = 0;
	cout<<"------------------"<<endl;
	cout<<"Calculadora de IMC"<<endl;
	cout<<"------------------"<<endl;
	
	imc(p,a);
	
	
		return 0;
}
