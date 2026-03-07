#include<iostream>
using namespace std;

void fatorial(int n){
	if (n < 0){
		return;
	}
	int fator = 1;
	for (int i = 1; i<=n; i++){
		fator =fator * i;	
	}
	cout<<"O fatorial de "<<n<<" eh : "<<fator;
	}

int main(){
	int n;
	cout<<"Digite o numero que gostaria de saber o fatorial do mesmo : ";
	cin>>n;
	
	fatorial(n);
	return 0;
}
