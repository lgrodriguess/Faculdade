//Calcule a média aritmética das 3 notas	de um aluno e mostre, além do valor da média aritmética, uma mensagem de "Aprovado", caso a média seja igual ou superior a 6, ou a mensagem "reprovado", caso	contrário.
//Aluno: Luan Rodrigues
//Instituição: If Sudeste MG - Rp
//Período: Primeiro Período

#include<iostream>
#include<math.h>
using namespace std;

void media(float n1, float n2, float n3){
	float median = (n1 + n2 + n3)/3;
	
	if (median >= 6){
		cout<<"Voce foi Aprovado!!! Sua media foi "<<median<<endl;
	}else if (median < 6){
		cout<<"Voce foi Reprovado :( Sua media foi "<<median<<endl;
	}

}	

int main (){
	float n1 = 0.0, n2 = 0.0, n3 = 0.0;
	
	cout<<"Insira sua nota da priemria prova."<<endl;
	cin>>n1;
	cout<<"Insira sua nota da segunda prova."<<endl;
	cin>>n2;
	cout<<"Insira sua nota da terceira prova."<<endl;
	cin>>n3;
	
	media(n1, n2, n3);
	
	return 0;
}
