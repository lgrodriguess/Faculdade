#include<iostream>
#include<string>

using namespace std;

class Tv{
		private:
		string marca;
		int tamanho;
		int resolucao;
		float preco;
		
		public:
		Tv();
		Tv(Tv &outro);
		void copiar(Tv &outro);
		void preencher();
		void imprimir();
		
		//getters
		string getMarca();
		int getTamanho();
		int getResolucao();
		int getPreco();
		
		//setters
		void setMarca(string marca);
		void setTamanho(int tamanho);
		void setResolucao(int resolucao);
		void setPreco(int preco);
		
};
