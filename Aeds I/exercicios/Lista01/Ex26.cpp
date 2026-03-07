//Escrever um algoritmo que lê a hora de	início de um jogo e a hora do final do jogo (considerando apenas horas inteiras) e calcula a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.
//Aluno: Luan Rodrigues
//Instituição: If Sudeste MG - Rp
//Período: Primeiro Período

#include<iostream>
#include<math.h>
using namespace std;

void hora(float horaI, float horaF){
	float total = horaI - horaF;
	float total2 = 0.0;
	
	if (horaI > horaF){
		total2 = 24 - (horaI - horaF);
		cout<<"O jogo durou "<<total2<<" horas."<<endl;
	}else if (horaF > horaI){
		cout<<"O jogo durou "<<total<<" horas"<<endl;
	}
}	

int main (){
	float horaI = 0.0, horaF = 0.0;
	cout<<"Escreva a hora inicial."<<endl;
	cin>>horaI;
	cout<<"Escreva a hora final."<<endl;
	cin>>horaF;
	
	hora(horaI, horaF);
	return 0;
}
