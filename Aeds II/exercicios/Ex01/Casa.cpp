#include<iostream>
#include "Casa.h"
using namespace std;

Casa::Casa(){
	this->endereco = "";
	this->area = 0.0;
	this->numeroQuartos = 0.0;
	this->preco = 0.0;
}
Casa::Casa(Casa &outro){
	this->endereco = outro.endereco;
	this->area = outro.area;
	this->numeroQuartos = outro.numeroQuartos;
	this->preco = outro.preco;
}
void Casa::copiar(Casa &outro){
	this->endereco = outro.endereco;
	this->area = outro.area;
	this->numeroQuartos = outro.numeroQuartos;
	this->preco = outro.preco;
}
//Getters
string Casa::getEndereco(){
	return this-> endereco;
}
int Casa::getArea(){
	return this->area;
}
int Casa::getNumeroQuartos(){
	return this->numeroQuartos;
}
float Casa::getPreco(){
	return this->preco;
}
//setters
void Casa::setEndereco(string endereco){
	this->endereco = endereco;
}
void Casa::setArea(int area){
	this->area = area;
}
void Casa::setNumeroQuartos(int numeroQuartos){
	this->numeroQuartos = numeroQuartos;
}
void Casa::setPreco(float preco){
	this->preco = preco;
}
//preencher
void Casa::preencher(){
	cout<<"Digite o endereco: ";
	cin>>this->endereco;
	cout<<"Digite a area: ";
	cin>>this->area;
	cout<<"Digite o numero de quartos: ";
	cin>>this->numeroQuartos;
	cout<<"Digite o preco: ";
	cin>>this->preco;
}
//imprimir
void Casa::imprimir(){
	cout<<"------------------------"<<endl;
	cout<<"Endereco: "<<this->endereco<<endl;
	cout<<"Area: "<<this->area<<endl;
	cout<<"Numero de Quartos: "<<this->numeroQuartos<<endl;
	cout<<"Preco: "<<this->preco<<endl;
	cout<<"------------------------"<<endl;
}
