#include <iostream>
using namespace std;

void conta(int x, int z){
	int final;
	
	final = (x * x)*z;
	cout<<x<<" ^ "<<z<<" = "<<final;
	
}

int main(){
	int x,z;
	cout<<"Insira a base : "<<endl;
	cin>>x;
	cout<<"Insira o expoente : "<<endl;
	cin>>z;
	
	conta(x,z);
	return 0;
}
