//Aluno: Luan Rodrigues
//Instituição: If Sudeste MG - Rp
//Período: Primeiro Período
//Escreva um trecho de código em que seja declarado duas variáveis qualquer e em seguida seus respectivos endereços de memória;
// Acabei modificando o exercico e adicionando mais coisa por conta propria!

#include<iostream>
using namespace std;

int main(){
	int a,b = 0;
	int * P, *N;
	cout<<"Insira o valor de a e b!"<<endl;
	cin>>a>>b;
	P = &a;
	N = &b;
	
	cout<<"Os endereçcos de memoria de a e b sao : "<<P<<" , "<<N<<endl;
	cout<<"Os valores de a e b sao : "<<*P<<" , "<<*N;

		return 0;
}
