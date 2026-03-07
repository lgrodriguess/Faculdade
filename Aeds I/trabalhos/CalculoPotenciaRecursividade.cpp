#include<iostream>
using namespace std;

int elevado(int base, int pot){
	int final = 0;
	if (pot == 0)
		return 1;
	else 
		return base * elevado(base,pot - 1);		
}
int main(){
	int base=0,pot=0;
	cout<<"escreva o numero que vc quer realizar a conta e por quanto quer eleva-lo "<<endl;
	cin>>base;
	cin>>pot;
	cout << elevado(base,pot);
	
	return 0;
}
