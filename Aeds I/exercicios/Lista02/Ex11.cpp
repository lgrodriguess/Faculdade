#include<iostream>
using namespace std;

void dados(){
	int idade;
	int salario;
	char ec;	
	while(true){
		cout<<"Insira sua Idade!"<<endl;
		cin>>idade;
		if (idade >= 0 and idade <= 130){
			cout<<"Insira seu Salario"<<endl;
			cin>>salario;
			if (salario > 0){
				cout<<"Insira seu Estado Civil"<<endl;
				cin>>ec;
					if (ec == 's' || ec == 'c' || ec == 'v' || ec == 'd'){
						cout<<"Idade = "<<idade<<"\n Salario = "<<salario<<"\n Estado Civil = "<<ec;
						break;
					}
						
			}
		}else{
			cout<<"Dados invalidos, insira novamente seguindo as regras!"<<endl;
		}
	}
	

	}

int main(){
	dados();
	return 0;
}
