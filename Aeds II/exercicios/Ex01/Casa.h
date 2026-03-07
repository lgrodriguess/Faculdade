#include<iostream>
#include<string>
using namespace std;

class Casa{
	private:
		string endereco;
		int area;
		int numeroQuartos;
		float preco;
		
		
	public:
		Casa();
		Casa(Casa &outro);
	void copiar(Casa &outro);
	
	//getters
	string getEndereco();
	int getArea();
	int getNumeroQuartos();
	float getPreco();
	
	//setters
	void setEndereco(string endereco);
	void setArea(int area);
	void setNumeroQuartos(int numeroQuartos);
	void setPreco(float preco);
	
	//preencher&imprimir
	void preencher();
	void imprimir();
};
