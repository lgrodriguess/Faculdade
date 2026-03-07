#include <iostream>
#include <string>
using namespace std;

class Livro{
	private:
	string nome;
	string autor;
	string editora;
	int paginas;
	
	public:
		Livro();
		Livro(Livro &outro);
		void copiar(Livro &outro);
		void preencher();
		void imprimir();
		
		
		string getNome();
		string getAutor();
		string getEditora();
		int getPaginas();
		
		void setNome(string nome);
		void setAutor(string autor);
		void setEditora(string editora);
		void setPaginas(int paginas);
		
	
	
};
void maiorNumeroPaginas(Livro l1, Livro l2);
int numeroDeLivrosAcimaDe200(Livro *vet, int tamanho);
