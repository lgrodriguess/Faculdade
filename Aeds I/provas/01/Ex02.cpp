#include<iostream>
using namespace std;

float final(float vx, float qx, float ipix, float vy, float qy, float ipiy){

	float conta1 = 0.0;
	float conta2 = 0.0;
	float total;
		conta1 = (vx * qx ) * ((ipix/100)+1);
		conta2 = (vy * qy ) * ((ipiy/100)+1);
		
		total = conta1 + conta2;
		
		if (total <= 10000 and total > 5000){
			cout<<"Lucro"<<endl;
		}else if(total > 10000)
			cout<<"Muito Lucro"<<endl;
			return total;
		}

int main(){
	int a = 0.0;
	float vx,qx,ipix,vy,qy,ipiy;
	cout<<"Insira o valor unitario da peca x"<<endl;
	cin>>vx;
	cout<<"Insira a quantidade da peca x"<<endl;
	cin>>qx;
	cout<<"Insira o ipi da peca x"<<endl;
	cin>>ipix;
	cout<<"Insira o valor unitario da peca y"<<endl;
	cin>>vy;
	cout<<"Insira a quantidade da peca y"<<endl;
	cin>>qy;
	cout<<"Insira o ipi da peca y"<<endl;
	cin>>ipiy;
	a = final(vx,qx,ipix,vy,qy,ipiy);
	
	cout<<"O valor total a ser pago eh R$"<<a<<endl;
	
		return 0;
	
}
