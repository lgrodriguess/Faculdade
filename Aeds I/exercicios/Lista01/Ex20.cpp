#include<iostream>
#include<math.h>
using namespace std;

//5. Melhore seu programa sobre carteira de motorista. Caso o usuário informe uma idade menor que 18, seu algoritmo deve calcular quantos anos faltam e informar a ele
//Aluno: Luan Rodrigues
//Instituição: If Sudeste MG - Rp
//Período: Primeiro Período

void carteira(float x){
	
	float tempo = 0.0;
	
	cout<<"------------------------------------------------------------------------------------------------"<<endl;
	cout<<"|Bem vindo/a a AutoEscola Rodrigo! Vamos ver se voce tem idade suficiente pra tirar a carteira?|"<<endl;
	cout<<"------------------------------------------------------------------------------------------------"<<endl;
	cout<<endl<<"Digite sua idade!!"<<endl;
	cin>>x;
	
	if (x >= 18){
		cout<<"------------------------------------------------"<<endl;
		cout<<"Voce está apto à tirar a carteira de motorista!!"<<endl;
		cout<<"Vamos fazer sua inscrição??"<<endl;
		cout<<"------------------------------------------------"<<endl;
	}else if (x < 18){
		tempo = 18 - x;
		cout<<"----------------------------------------------------"<<endl;
		cout<<"Voce não está apto à tirar a carteira de motorista!!"<<endl;
		cout<<"Faltam "<<tempo<<" anos pra voce tirar! Te aguardamos!"<<endl;
		cout<<"------------------------------------------------"<<endl;
	}
}

int main (){
	float x = 0.0;
	carteira(x);
	
	return 0;
	
}
