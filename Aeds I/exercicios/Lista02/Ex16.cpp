#include<iostream>
using namespace std;

void pareseimpares(int n, int &pares, int &impares){   //Esse "&" transforma a variavel em referencia! Passar uma variável por referência significa que, dentro da função, você pode modificar o valor da variável diretamente, e essas modificações serão refletidas fora da função também. Ou seja, qualquer alteração no valor de pares ou impares dentro da função vai afetar as variáveis originais no main
	if(n == 0){
		return;
	}
	int numero;
	cout<<"Digite o "<<(11 - n)<< " numero"<<endl;
	cin>>numero;
	
	if (numero % 2 == 0){
		pares++;
	}else{
		impares++;
	}
	
	pareseimpares(n - 1, pares, impares);
}


int main(){
	int pares = 0;
	int impares = 0;
	cout<<"Insira 10 numeros inteiros"<<endl;
	
	pareseimpares(10,pares,impares);
	
	cout<<"A quantidade de pares eh : "<<pares<<endl;
	cout<<"A quantidade de impares eh : "<<impares<<endl;

	return 0;
}
