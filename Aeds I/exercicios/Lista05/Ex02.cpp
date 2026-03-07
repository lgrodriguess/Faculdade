//Crie uma struct chamada "Retângulo" que armazene os seguintes dados: largura (float) e altura (float). Crie uma função para calcular a área do retângulo e outra função para calcular o perímetro.

#include <iostream>
using namespace std;

struct Retangulo{
	float Largura;
	float altura;
};

void Carea(Retangulo &r1){
	float area;
	area = r1.altura*r1.Largura;
	cout <<"A area eh: "<< area << endl;
}

void Cperimetro(Retangulo &r1){
	float perim;
	perim = (2*r1.altura) + (2*r1.Largura);
	cout <<"O perimetro eh: "<< perim <<endl;
}

int main(){
	Retangulo r1;
	
	cout <<"Insira a altura\n";
	cin >> r1.altura;
	cout <<"Insira a largura\n";
	cin >> r1.Largura;
	
	Carea(r1);
	Cperimetro(r1);
	
	return 0;
}
