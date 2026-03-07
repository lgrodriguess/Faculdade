#include<iostream>
#include "Casa.h"
using namespace std;

void qualMaisCara(Casa c1,Casa c2){
	if(c1.getPreco() > c2.getPreco()){
		cout<<"A casa 1 eh mais cara!";
	}else if(c1.getPreco() < c2.getPreco()){
		cout<<"A casa 2 eh mais cara!";
	}else{
		cout<<"O valor das duas casas eh igual!";
	}
}

int main(){
	Casa c1,c2;
	
	c1.preencher();
	c1.imprimir();
	
	c2.preencher();
	c2.imprimir();
	
	qualMaisCara(c1,c2);
	
	return 0;
}
