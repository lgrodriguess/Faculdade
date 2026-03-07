//12. Faça um algoritmo que leia as **3 notas**	de um aluno e calcule a média final deste aluno. Considerar que a média é ponderada e que o peso das notas é: 2, 3 e 5, respectivamente.
//Aluno: Luan Rodrigues
//Instituição: If Sudeste MG - Rp
//Período: Primeiro Período

#include<iostream>
#include<math.h>
using namespace std;

void nota(float n1, float n2, float n3){
	float mediapond = ((n1*2) + (n2*3) + (n3*5)) / 10;
	cout<<"Sua nota final é : "<<mediapond<<endl;
	
}
int main (){
	float nota1, nota2, nota3;
	cout<<"Calculadora de média ponderada de notas escolares."<<endl;
	cout<<"Insira sua nota de portugues, peso 2."<<endl;
	cin>>nota1;
	cout<<"Insira sua nota de biologia, peso 3."<<endl;
	cin>>nota2;
	cout<<"Insira sua nota de matematica, peso 5."<<endl;
	cin>>nota3;
	
	nota(nota1, nota2, nota3);
	
	return 0;
}
