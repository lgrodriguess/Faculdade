//Crie uma struct chamada "Aluno" que armazene os seguintes dados: matrícula (int), nome (string) e notas (array de floats). Crie uma função para preencher as notas de um aluno e outra função para calcular a média das notas.
#include<iostream>
using namespace std;

struct Aluno{
	int matricula;
	string nome;
	float* notas;
};

void preenchen(Aluno &a1, int n){
	for(int i = 0; i < n; i++){
	cout<<"Insira a "<<i+1<<" nota: ";
	cin>>a1.notas[i];
}
}

void calcm(Aluno &a1, int n){
	float total = 0;
	float media = 0;
	for(int i = 0; i < n; i++){
		total += a1.notas[i];
	}
	media = total/n;
	cout<<"A media das notas eh: "<<media;
}

int main(){
	int n;
	Aluno a1;
	cout<<"Insira o numero de matricula: "<<endl;
	cin>>a1.matricula;
	cout<<"Insira o nome do aluno: "<<endl;
	cin>>a1.nome;
	cout<<"Insira a quantidade de notas: "<<endl;
	cin>>n;
	
	a1.notas = new float[n];
	
	preenchen(a1,n);
	calcm(a1,n);
	
	
	return 0;
}
