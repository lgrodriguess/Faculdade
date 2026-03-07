#include<iostream>
using namespace std;
struct Pessoa{
	string nome;
	char sexo;
	int idade;
	string estadoCivil;
	string profissao;	
};
void preenchepessoa(Pessoa &P){
	cout<<endl<<"Digite o nome: "<<endl;
	cin>>P.nome;
	cout<<"Digite o sexo: "<<endl;
	cin>>P.sexo;
	cout<<"Estado Civil: "<<endl;
	cin>>P.estadoCivil;
	cout<<"Profissao: "<<endl;
	cin>>P.profissao;	
}
void imprime(Pessoa &P){
	cout<<endl<<"Segue abaixo os dados da Pessoa"<<endl;
	cout<<"Nome: "<<P.nome<<" / "<<"Sexo: "<<P.sexo<<" / "<<"Estado Civil: "<<P.estadoCivil<<" / "<<"Profissao: "<<P.profissao<<endl;
}
int main(){
	int n;
	cout<<"Informe o numero de pessoas: "<<endl;
	cin>>n;
	Pessoa P[n];
	
	for(int i = 0; i < n;i++){
		preenchepessoa(P[i]);
	}
	for(int i = 0;i < n;i++){
		imprime(P[i]);
	}	
	return 0;
}
