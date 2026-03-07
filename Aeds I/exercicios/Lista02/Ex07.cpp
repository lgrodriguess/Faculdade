#include <iostream>
using namespace std;



void intervalo(int a , int b){
	if (a > b){
		int temp = a; //temp é uma variavel "Temporaria"
		a = b;
		b = temp;
	}
	int soma = 0;
	for(int i = a + 1; i < b; i++){ //i vai comecar com o menor valor (para o mesmo nao ser incluido); i < b garante que o programa encerra antes de i atingir o valor de b; aumenta o valor de i em 1 a cada "laço"
		cout << i << "  ";
		soma = soma + i;
	}
	cout<<endl<<"A soma dos numeros eh : "<<soma;
}

int main(){
	int a = 0;
	int b = 0;
	cout<<"Digite 2 numeros para saber o intervalo entre eles!"<<endl;
	cout<<"Primeiro : "<<endl;
	cin>>a;
	cout<<"Segundo : "<<endl;
	cin>>b;
	
	intervalo(a,b);
	return 0;
}
