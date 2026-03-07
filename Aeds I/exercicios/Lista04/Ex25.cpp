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
float calculo(float **matriz) {
    float a = matriz[0][0], b = matriz[0][1], c = matriz[0][2];
    float d = matriz[1][0], e = matriz[1][1], f = matriz[1][2];
    float g = matriz[2][0], h = matriz[2][1], i = matriz[2][2];
    
    return a * (e * i - f * h) - b * (d * i - f * g) + c * (d * h - e * g);
}


int main(){
	float **matriz;
	int linhas = 3;
	int colunas = 3;	
	matriz = new float*[linhas];
	for(int i=0; i <= linhas-1; i++){
		matriz[i] = new float [colunas];
	}
	
	preenche(matriz,linhas,colunas);
	cout<<"O determinante é : "<<calculo(matriz);
	
	return 0;
}
