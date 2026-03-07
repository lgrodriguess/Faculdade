//crie uma struct chamada "Livro" que armazene os seguintes dados: título (string), autor (string) e ano de publicação (int). Crie uma função para exibir as informações de um livro.
#include<iostream>
using namespace std;

struct Livro{
	string titulo;
	string autor;
	int anoPub;
};
void exibirinfo(Livro &L1){
	cout<<"Titulo : "<<L1.titulo<<endl;
	cout<<"Autor : "<<L1.autor<<endl;
	cout<<"Ano de Publicacao : "<<L1.anoPub<<endl;
}
int main(){
	Livro L1;
	cout<<"Insira o titulo do livro (escreva sem espaco)!"<<endl;
	cin>>L1.titulo;
	cout<<"Insira o autor do livro!"<<endl;
	cin>>L1.autor;
	cout<<"Insira o ano de publicacao do livro!"<<endl;
	cin>>L1.anoPub;
	
	exibirinfo(L1);
	return 0;
}
