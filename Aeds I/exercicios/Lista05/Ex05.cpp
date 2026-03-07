//crie uma struct chamada "Círculo" que armazene o raio (float). Crie uma função para calcular a área do círculo e outra função para calcular o perímetro.
#include<iostream>
using namespace std;

struct Circulo{
	float raio;
};
void calculoA(Circulo &C1){
	float area;
	area = 3.14 * (C1.raio * C1.raio);
	cout<<"Considerando 'PI' =~ 3.14"<<endl;
	cout<<"Area = PI * Raio^2"<<endl;
	cout<<"Area = "<<area<<endl;
}
void calculoP(Circulo &C1){
	float perimetro;
	perimetro = 2 * 3.14 * C1.raio;
	cout<<endl<<"Considerando 'PI' =~ 3.14"<<endl;
	cout<<"Perimetro = 2 * PI * Raio"<<endl;
	cout<<"Perimetro = "<<perimetro;
}
int main(){
	Circulo C1;
	cout<<"Insira o raio desejado para calcular Area e Perimetro de um Circulo!"<<endl;
	cin>>C1.raio;
	calculoA(C1);
	calculoP(C1);
	
	return 0;
}
