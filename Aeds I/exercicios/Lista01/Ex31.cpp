//Elabore um algoritmo que dada a idade de um nadador classifica-o em categorias
//Aluno: Luan Rodrigues
//Instituição: If Sudeste MG - Rp
//Período: Primeiro Período


#include<iostream>
#include<math.h>
using namespace std;

void categoria(float x){
	
	
	if (x >= 5 and x <= 7){
		cout<<"---------------------------------"<<endl;
		cout<<" Sua Categoria é Infantil A"<<endl;
		cout<<" Sua idade esta entre 5 - 7 anos"<<endl;
		cout<<"---------------------------------"<<endl;
	}else if ( x >= 8 and x <= 10){
		cout<<"----------------------------------"<<endl;
		cout<<" Sua Categoria é Infantil B"<<endl;
		cout<<" Sua idade esta entre 8 - 10 anos"<<endl;
		cout<<"----------------------------------"<<endl;
	}else if (x >= 11 and x <= 13){
		cout<<"-----------------------------------"<<endl;
		cout<<" Sua Categoria é Juvanil A"<<endl;
		cout<<" Sua idade esta entre 11 - 13 anos"<<endl;
		cout<<"-----------------------------------"<<endl;
	}else if (x >= 14 and x <= 17){
		cout<<"-----------------------------------"<<endl;
		cout<<" Sua Categoria é Juvanil B"<<endl;
		cout<<" Sua idade esta entre 14 - 17 anos"<<endl;
		cout<<"-----------------------------------"<<endl;
	}else if (x >= 18){
		cout<<"-------------------------"<<endl;
		cout<<" Sua Categoria é Adulto"<<endl;
		cout<<" Sua idade eh 18 ou mais"<<endl;
		cout<<"-------------------------"<<endl;
	}

}

int main(){
	float idade = 0.0;
	cout<<"----------------------"<<endl;
	cout<<" Insira a sua idade!!"<<endl;
	cout<<"----------------------"<<endl;
	cin>>idade;
	
	categoria(idade);
		return 0;
}
