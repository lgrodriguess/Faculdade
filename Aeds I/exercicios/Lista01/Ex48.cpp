#include<iostream>
#include<math.h>
using namespace std;

//a percentagem do IPI a ser acrescido no valor das peças - o código da peça 1, valor unitário da peça 1, quantidade de peças 1 - o código da peça 2, valor unitário da peça 2, quantidade de peças 2 - O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
//Fórmula: $(valor_1 * quant_1 + valor_2 * quant_2) * (IPI/100 + 1)*/ 
//Aluno: Luan Rodrigues
//Instituição: If Sudeste MG - Rp
//Período: Primeiro Período

float formula(float valor1, float quant1, float valor2, float quant2, float ipi){
		float conta = (valor1 * quant1 + valor2 * quant2) * ((ipi/100) + 1);
		return conta;
}


int main(){
	float v1, v2, q1, q2, c1, c2, ipi;
	cout<<"Insira o codigo da primeira peca"<<endl;
	cin>>c1;
	cout<<"Insira o valor da primeira peca"<<endl;
	cin>>v1;
	cout<<"Insira a quantidade da primeira peca"<<endl;
	cin>>q1;
	
	cout<<"Insira o codigo da segunda peca"<<endl;
	cin>>c2;
	cout<<"Insira o valor da segunda peca"<<endl;
	cin>>v2;
	cout<<"Insira a quantidade da segunda peca"<<endl;
	cin>>q2;
	
	cout<<"Insira o ipi que será aplicado nas pecas!!"<<endl;
	cin>>ipi;
	
	cout<<"--------------------------------"<<endl;
	cout<<"O codigo da primeira peca eh "<<c1<<endl;
	cout<<"O valor da primeira peca eh "<<v1<<endl;
	cout<<"A Quantidade da primeira peca eh "<<q1<<endl;
	cout<<"O codigo da segunda peca eh "<<c2<<endl;
	cout<<"O valor da segunda peca eh "<<v2<<endl;
	cout<<"A Quantidade da segunda peca eh "<<q2<<endl;
	cout<<"--------------------------------"<<endl;
	
	cout<<"O valor total a ser pago eh "<<formula(v1,q1,v2,q2,ipi);
		return 0;
}
