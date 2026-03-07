/*Faça uma função que receba como parâmetro dois números inteiros. Multiplique o primeiro
número por ele mesmo uma quantidade de vezes igual ao segundo número. Se o segundo
número for maior que 9, retornar 0 (ZERO).
b) No main, pergunte ao usuário quantas vezes ele deseja executar a função da letra a. Execute a
função o número de vezes que o usuário escolheu e armazene todas as respostas da função num
vetor dinâmico. Depois, imprima todos os valores que o vetor contém.*/
#include<iostream>
using namespace std;

int multp(int a , int b){
	if(b >= 9){
		return 0;
	}
	
	int resultado = 1;
	for(int i =0; i < b; i++){
		resultado = resultado * a;
	}
	return resultado;
}


int main(){
	int a, b, qnt;
	cout<<"Quantas vezes deseja executar a funcao? "<<endl;
	cin>>qnt;
	int *vetor = new int[qnt];
	for(int i = 0; i < qnt;i++){
		cout<<"Digite o primeiro valor: "<<endl;
		cin>>a;
		cout<<"Digite o segundo valor: "<<endl;
		cin>>b;
		vetor[i] = multp(a,b);	
	}
	for(int i = 0; i < qnt; i++){
		cout<<vetor[i]<<"  ";
	}
	return 0;
}
