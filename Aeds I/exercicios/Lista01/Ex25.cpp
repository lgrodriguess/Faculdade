//Escreva uma função que recebe os **ângulos** de um triângulo e checa se o mesmo é **válido** ou **não**. Retorne um **booleano** para informar essa validade.
//Aluno: Luan Rodrigues
//Instituição: If Sudeste MG - Rp
//Período: Primeiro Período

#include<iostream>
#include<math.h>
using namespace std;

bool conta(float ang1, float ang2, float ang3){
	float angulo = ang1 + ang2 + ang3;
	
	if (angulo == 180){
		return true;
	}else{
		return false;
	}
	
}

int main(){
	float a1,a2,a3;
	cout<<"Escreva os 3 angulos internos do triangulo e irei verificar se ele é valido!"<<endl;
	cout<<"Informe o primeiro angulo"<<endl;
	cin>>a1;
	cout<<"Informe o segundo angulo"<<endl;
	cin>>a2;
	cout<<"Informe o terceiro angulo"<<endl;
	cin>>a3;
	
	bool resposta = false;
	resposta = conta(a1, a2, a3);
	
	if(resposta == true){
		cout<<"O triangulo eh valido;Os angulos formam um triangulo!"<<endl;
	}else{
		cout<<"O triangulo nao eh valido;Os angulos nao formam um triangulo!"<<endl;
	}
	return 0;
}
