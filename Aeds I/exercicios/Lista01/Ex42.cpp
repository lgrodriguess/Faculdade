//Um banco concederá um crédito especial aos seus clientes, variável com o saldo médio no último ano. Faça um algoritmo que leia o saldo médio de um cliente e calcule o valor do	crédito de acordo com a tabela abaixo. Mostre uma mensagem informando o saldo médio e o valor do crédito. (use o comando case e não faça repetições)
//Aluno: Luan Rodrigues
//Instituição: If Sudeste MG - Rp
//Período: Primeiro Período

#include<iostream>
using namespace std;

void tabela(int y){
		
	switch (y){
		case 1:
			float conta;
			float salario;
			cout<<"Digite o valor exato do salario medio."<<endl;
			cin>>salario;
			conta = 0;
			cout<<"Seu salario medio é R$"<<salario<<" e seus creditos sao "<<conta<<endl;
			break;
		case 2:	
			cout<<"Digite o valor exato do salario medio."<<endl;
			cin>>salario ;
			conta = salario * 0.20 ;
			cout<<"Seu salario medio é R$"<<salario<<" e seus creditos sao "<<conta<<endl;
			break;
		case 3:
			cout<<"Digite o valor exato do salario medio."<<endl;
			cin>>salario;
			conta = salario * 0.30;
			cout<<"Seu salario medio é R$"<<salario<<" e seus creditos sao "<<conta<<endl;
			break;
		case 4:
			cout<<"Digite o valor exato do salario medio."<<endl;
			cin>>salario;
			conta = salario * 0.40;
			cout<<"Seu salario medio é R$"<<salario<<" e seus creditos sao "<<conta<<endl;
			break;
	}
}
int main(){
	float x = 0.0;
		cout<<"----------------------------------------------------"<<endl;
		cout<<"|    Calculo de credito com base no seu salario.    |"<<endl;
		cout<<"|Digite 1 caso seu salario medio for de 0 - 200.    |"<<endl;
		cout<<"|Digite 2 caso seu salario medio for de 201 - 400   |"<<endl;
		cout<<"|Digite 3 caso seu salario medio for de 401 - 600   |"<<endl;
		cout<<"|Digite 4 caso seu salario medio for mais do que 600|"<<endl;
		cout<<"-----------------------------------------------------"<<endl;
		cin>>x;
		
		tabela(x);
		return 0;
}
