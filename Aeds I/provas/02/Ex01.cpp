#include<iostream>
using namespace std;
void contador(int n, int &pares, int &positivos){
	int numero;
	if (n == 0){
		return;
	}
	
	cout<<"Digite o "<<n<<" numero : ";
	cin>>numero;
	
	if (numero % 2 == 0){
		pares++;
	}
	if (numero > 0){
		positivos++;
	}
	contador(n-1,pares,positivos);
}

int main(){
	int n;
	int pares = 0;
	int positivos = 0;
	cout<<"Digite a quantidade de numeros a sua escolha : ";
	cin>>n;
	contador(n,pares,positivos);
	
	cout<<"A quantidade de numeros pares sao : "<<pares<<endl;
	cout<<"A quantidade de numeros positivos sao : "<<positivos<<endl;
	
}
