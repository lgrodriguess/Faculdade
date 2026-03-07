#include <iostream>
using namespace std;

void tabuada(int n){
	int final;
	cout << "A tabuada do numero "<<n<<" eh :"<<endl;
	
	for(int i = 1; i<=10; i++){
		final = n * i;
		cout<<n<<" x "<<i<<" = "<<final<<endl;
	}
}

int main(){
	int n;
	cout<<"Insira o valor que deseja saber a tabuada : ";
	cin>>n;
	tabuada(n);
	return 0;
}
