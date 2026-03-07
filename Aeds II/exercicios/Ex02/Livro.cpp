#include "Livro.h"
#include <iostream>
#include <string>
using namespace std;

// Construtor 
Livro::Livro() {
    this->nome = "";
    this->autor = "";
    this->editora = "";
    this->paginas = 0;
}

// Construtor de cópia
Livro::Livro(Livro &outro) {
    this->nome = outro.getNome();
    this->autor = outro.getAutor();
    this->editora = outro.getEditora();
    this->paginas = outro.getPaginas();
}

//copiar
void Livro::copiar(Livro &outro) {
    this->nome = outro.getNome();
    this->autor = outro.getAutor();
    this->editora = outro.getEditora();
    this->paginas = outro.getPaginas();
}

//preencher
void Livro::preencher(){ 
cout<<"Digite o nome: "; 
cin>> this->nome; 
cout<<"Digite o autor: "; 
cin>> this ->autor; 
cout<<"Digite a editora: "; 
cin>> this->editora; 
cout<<"Digite a qnt paginas: "; 
cin>> this->paginas; 
}

//imprimir
void Livro::imprimir(){ 
cout<<"Nome: "<<this->nome
cout<<endl<<"Autor: "<<this->autor; 
cout<<endl<<"Editora: "<<this->editora; 
cout<<endl<<"Paginas: "<<this->paginas; 
}

//qual livro tem mais páginas
void maiorNumeroPaginas(Livro l1, Livro l2){ 
if (l1.getPaginas() > l2.getPaginas()){ 
	cout<<"O livro 1 tem mais paginas"; 
}else if(l1.getPaginas() == l2.getPaginas()){ 
	cout<<"Os dois tem o mesmo numero de paginas"; 
}else{ 
	cout<<"O livro 2 tem mais paginas"; 
} 
}

// Conta quantos livros tem mais de 200 páginas
int numeroDeLivrosAcimaDe200(Livro *vet, int tamanho) {
    int count = 0;
    for (int i = 0; i < tamanho; i++) {
        if (vet[i].getPaginas() >= 200) {
            count++;
        }
    }
    return count;
}

// Setters
void Livro::setNome(string nome) {
    this->nome = nome;
}
void Livro::setAutor(string autor) {
    this->autor = autor;
}
void Livro::setEditora(string editora) {
    this->editora = editora;
}
void Livro::setPaginas(int paginas) {
    this->paginas = paginas;
}

// Getters
string Livro::getNome() {
    return this->nome;
}
string Livro::getAutor() {
    return this->autor;
}
string Livro::getEditora() {
    return this->editora;
}
int Livro::getPaginas() {
    return this->paginas;
}
