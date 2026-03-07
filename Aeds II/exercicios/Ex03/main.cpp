#include <iostream>
#include "Tv.h"
using namespace std;

	void qualTvMaisCara(Tv a, Tv b){
	if(a.getPreco() > b.getPreco()){
		cout<<"A Tv 1 é mais cara";
	}else if(a.getPreco() < b.getPreco()){
		cout<<"A Tv 2 é mais cara";
	}else{
		cout<<"As duas tem o mesmo preco";
	}
}

int main() {
	Tv a, b;
	
	a.preencher();
	a.imprimir();
	
	b.preencher();
	b.imprimir();
	
	qualTvMaisCara(a,b);
	return 0;
}
