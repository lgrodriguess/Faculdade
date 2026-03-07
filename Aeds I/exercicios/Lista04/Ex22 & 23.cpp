#include<iostream>
using namespace std;
void imprime(float **matriz, int linhas, int colunas){
	for(int l=0; l <= linhas-1; l++){
		for(int c=0; c <= colunas-1; c++){
			cout<< matriz[l][c]<< "\t";
		}
		cout<< endl;
	}
}


void preenche(float **matriz, int linhas, int colunas){
	cout<<"Insira os dados da matriz: "<<endl;
	for(int l=0; l <= linhas-1; l++){
		for(int c=0; c <= colunas-1; c++){
			cout<<"m[" <<l<< "][" <<c<< "]:";
			cin>>matriz[l][c];
		}
	}
	imprime(matriz,linhas,colunas);
}
int main(){
	float **matriz;
	int linhas, colunas;
	cout<<"Informe o numero de linhas: "<<endl;
	cin>>linhas;
	cout<<"Informe o numero de colunas: "<<endl;
	cin>>colunas;
	
	matriz = new float*[linhas];
	for(int i=0; i <= linhas-1; i++){
		matriz[i] = new float [colunas];
	}
	
	preenche(matriz,linhas,colunas);
	
	return 0;
}
