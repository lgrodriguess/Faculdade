#include<iostream>
#include<math.h>
using namespace std;

//Faça um programa que troca os valores de a e b, se a for menor que b.
//Aluno: Luan Rodrigues
//Instituição: If Sudeste MG - Rp
//Período: Primeiro Período

void troca(float a, float b){ //Criei a função troca como void para não retornar nenhum valor e facilitar o entendimento do codigo!
	float c = 0.0;
	cout<<"Insira 2 numeros!"<<endl;
	cout<<"Insira a"<<endl;
	cin>>a;
	cout<<"Insira b"<<endl;
	cin>>b;
	
	if (a >= b){ //Aqui crio a condição a ser aplicada no exercicio!
		cout<<"Nao houve troca!"<<endl;
		cout<<"Seus numeros são: a = "<<a<<" e b = "<<b<<endl;
	}else if (a < b){
		cout<<"Houve troca!"<<endl;
		cout<<"Os valores dos seus numeros são: a = "<<b<<" e b = "<<a<<endl;
	}
	
}

int main(){  //Crio a função main, declaro as variaveis e insiro o valor 0 (pra nao ter "lixo" de memória
	float a = 0.0;
	float b = 0.0;
	 troca(a,b); //Chamo a função criada anteriormente para coloca-la pra "rodar" !
	 
	 return 0;
	
}
