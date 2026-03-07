#include <iostream>
#include "Livro.h"
using namespace std;

int main(){
	Livro l1, l2;
	
	l1.preencher();
	l1.imprimir();
	
	l2.preencher();
	l2.imprimir();
	
	maiorNumeroPaginas(l1,l2);
	Livro *prateleira = new Livro[20];
	numeroDeLivrosAcimaDe200(prateleira, 20);
}
