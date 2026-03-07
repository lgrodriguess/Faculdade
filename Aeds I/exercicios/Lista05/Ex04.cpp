//crie uma struct chamada "Data" que armazene os seguintes dados: dia (int), mês (int) e ano (int). Crie uma função para verificar se uma data é válida.
#include<iostream>
using namespace std;

struct Data{
	int dia;
	int mes;
	int ano;
	};
void verificar(Data &D1){
	if(D1.dia < 1 || D1.dia > 31){
		cout<<"Dia Invalido!"<<endl;	
	}else{
		cout<<"Dia Valido!"<<endl;	
	}
	if(D1.mes < 1 || D1.mes > 12){
		cout<<"Mes Invalido!"<<endl;
	}else{
		cout<<"Mes Valido!"<<endl;	
	}
	if(D1.ano < 0){
		cout<<"Ano Invalido!"<<endl;
	}else{
		cout<<"Ano Valido!"<<endl;
	}
}
void informar(Data &D1){
	cout<<D1.dia<<"/"<<D1.mes<<"/"<<D1.ano;
}
int main(){
	Data D1;
	cout<<"Insira o numero do dia!"<<endl;
	cin>>D1.dia;
	cout<<"Insira o numero do mes!"<<endl;
	cin>>D1.mes;
	cout<<"Insira do numero do ano!"<<endl;
	cin>>D1.ano;
	
	verificar(D1);
	informar(D1);
	
	return 0;
}
