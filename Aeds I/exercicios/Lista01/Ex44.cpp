//Escrever um algoritmo que lê um conjunto de 4 valores i, a, b, c, onde i é um valor inteiro e positivo e a, b, c, são quaisquer valores reais e os escreva -  Se i=1 escrever os três valores a, b, c em ordem crescente. ; Se i=2 escrever os três valores a, b, c em ordem decrescente. ; Se i=3 escrever os três valores a, b, c de forma que o maior entre a, b, c fique dentre os dois.
//Aluno: Luan Rodrigues
//Instituição: If Sudeste MG - Rp
//Período: Primeiro Período

#include<iostream>
using namespace std;
float maior(float a , float b){
		if (a > b){
			return a;
		}else{
			return b;
		}

}
float menor(float a, float b){
		if (a < b){
			return a;
		}else{
			return b;
		}
}		

void conjunto(int x, float num1, float num2, float num3){
		float pequeno;
		float meio;
		float grande;
		
				grande = maior(maior(num1,num2),num3);
				if (grande == num1){
					meio = maior(num2,num3);
					pequeno = menor(num2,num3);
				}else if (grande == num2){
					meio = maior(num1,num3);
					pequeno = menor(num1,num3);
				}else if (grande == num3){
					meio = maior(num1,num2);
					pequeno = menor(num1,num2);
				}
		
		switch (x){
			case 1:
				cout<<"A ordem crescente eh :"<<pequeno<<" "<<meio<<" "<<grande;
				break;
			case 2:
				cout<<"A ordem decrescente eh :"<<grande<<" "<<meio<<" "<<pequeno;
				break;
			case 3:
				cout<<"A ordem com o maior no meio eh :"<<meio<<" "<<grande<<" "<<pequeno;
				break;
		}
}

int main(){
	int x;
	float num1, num2, num3;
	cout<<"Insira 3 valores."<<endl;
	cout<<"Primeiro numero :"<<endl;
	cin>>num1;
	cout<<"Segundo numero :"<<endl;
	cin>>num2;
	cout<<"Terceiro numero :"<<endl;
	cin>>num3;
	
	cout<<"Seus numeros sao :"<<num1<<" "<<num2<<" "<<num3<<endl;	
	cout<<"1 para colocar os valores em ordem crescente."<<endl;
	cout<<"2 para colocar os valores em ordem decrescente"<<endl;
	cout<<"3 para colocar o maior numero entre os 2 menores"<<endl;
	cin>>x;
	
	conjunto(x,num1,num2,num3);
	
	
	return 0;
}
