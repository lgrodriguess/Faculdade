//15. Elaborar um algoritmo que lê 2 valores **a** e **b** e os escreve com a mensagem: **"*São	múltiplos"*** ou ***"Não são múltiplos"***.
//Aluno: Luan Rodrigues
//Instituição: If Sudeste MG - Rp
//Período: Primeiro Período

#include<iostream>
#include<math.h>
using namespace std;

void multiplo(int n1, int n2){
	
	if( n1 > n2 and n1 % n2 == 0){
		cout<<"Eles sao multiplos!"<<endl;
	}else if ( n2 > n1 and n2 % n1 == 0){
		cout<<"Eles sao multiplos"<<endl;
	}else{
		cout<<"Eles nao sao multiplos"<<endl;
	}
}	

int main (){
	int n1 = 0.0, n2 = 0.0;
	cout<<"Verificadora de multiplos."<<endl;
	cout<<"Insira o primeiro numero!"<<endl;
	cin>>n1;
	cout<<"Insira o segundo numero!"<<endl;
	cin>>n2;
	
	multiplo(n1, n2);
	
	return 0;
}
