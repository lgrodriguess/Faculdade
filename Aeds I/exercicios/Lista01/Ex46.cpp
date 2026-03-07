#include<iostream>
#include<math.h>
using namespace std;

//Faça uma função que retorne o preço de uma conta de luz. Para um cliente que usou até 100 kW, o custo é de R$	0,50 por kW. A partir de 100, o custo é de R$ 0,75 por kW. A partir	de 200 kW, o custo é de R$ 1,20 por kW. A partir de 250 kW, o preço é de R$ 1,50 por kW. Ao final, deve-se acrescentar 20% do valor da conta para o pagamento de impostos.
//Aluno: Luan Rodrigues
//Instituição: If Sudeste MG - Rp
//Período: Primeiro Período

void calculoconta(float a){
	float b;
	float c;
	
	if (a < 100){
		b = a * 0.5;
		c = b + (b * 20/100);
	}else if (a > 100 and a < 200){
		b = a * 0.75 ;
		c = b + (b * 20/100);
	}else if (a > 200 and a <250){
		b = a * 1.20;
		c = b + (b * 20/100); 
	}else if (a > 250){
		b = a * 1.50;
		c = b + (b * 20/100);
	}
	cout<<"O valor que voce deve pagar é "<<c<<endl;
	
}
int main(){
	float x = 0;
	cout<<"---------------------------------------------"<<endl;
	cout<<"Digite a quantidade de kW que foi utilizado!!"<<endl;
	cout<<"---------------------------------------------"<<endl;
	cin >>x;
	calculoconta(x);
	
	
	
	return 0;
}
