#include<iostream>
#include<string>
using namespace std;

void login(){
	string nome;
	string senha;
	cout<<"------------------------"<<endl;
	cout<<"     Login - Emcomp     "<<endl;
	cout<<"------------------------"<<endl;
	cout<<"\n Digite o Nome : "<<endl;
	cin>>nome;
	cout<<"Digite a Senha : "<<endl;
	cin>>senha;
	
	
	
	while (nome == senha){
		cout<<"Nome e Senhas iguais!"<<endl;
		cout<<"Digite o nome : "<<endl;
		cin>>nome;
		cout<<"Digite a senha : "<<endl;
		cin>>senha;
}
	
		cout<<"           O login foi realizado com sucesso!!                "<<endl;
		cout<<"        Seja Bem-Vindo a pagina inicial da Emcomp!            "<<endl;
		cout<<"--------------------------------------------------------------"<<endl;
	
}
int main(){
	login();
	return 0;
}
