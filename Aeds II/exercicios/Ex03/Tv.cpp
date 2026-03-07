#include "Tv.h"
#include <iostream>
#include <string>
using namespace std;

//Construtor
Tv::Tv(){
	this->marca = "";
	this->tamanho = 0.0;
	this->resolucao = 0.0;
	this->preco = 0.0;
}
//Construtor de copia
Tv::Tv(Tv &outro){
	this->marca = outro.getMarca();
	this->tamanho = outro.getTamanho();
	this->resolucao = outro.getResolucao();
	this->preco = outro.getPreco();
}
//copiar
void Tv::copiar(Tv &outro){
	this->marca = outro.getMarca();
	this->tamanho = outro.getTamanho();
	this->resolucao = outro.getResolucao();
	this->preco = outro.getPreco();
}
void Tv::preencher(){
	cout<<"Digite a marca: ";
	cin>> this->marca;
	cout<<"Digite o tamanho: ";
	cin>> this->tamanho;
	cout<<"Digite a resolucao: ";
	cin>> this->resolucao;
	cout<<"Digite o preco: ";
	cin>> this->preco;
}
void Tv::imprimir(){
	cout<<"--------------------"<<endl;
	cout<<"Marca : "<<this->marca;
	cout<<endl<<"Tamanho : "<<this->tamanho;
	cout<<endl<<"Resolucao : "<<this->resolucao;
	cout<<endl<<"Preco : "<<this->preco<<endl;
	cout<<"--------------------"<<endl;
}

//getters
string Tv::getMarca(){
	return this->marca;
}
int Tv::getTamanho(){
	return this->tamanho;
}
int Tv::getResolucao(){
	return this->resolucao;
}
int Tv::getPreco(){
	return this->preco;
}
//setters
void Tv::setMarca(string marca){
	this->marca = marca;
}
void Tv::setTamanho(int tamanho){
	this->tamanho = tamanho;
}
void Tv::setResolucao(int resolucao){
	this->resolucao = resolucao;
}
void Tv::setPreco(int preco){
	this->preco = preco;
}
