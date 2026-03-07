//	Uma empresa concederá um aumento de salário aos seus funcionários, variável de acordo com o cargo, conforme a tabela abaixo. Faça um algoritmo que leia o salário e o cargo de 	um funcionário e calcule o novo salário. Se o cargo do funcionário não estiver na tabela, ele deverá, então, receber 40% de aumento. Mostre o salário antigo, o novo salário e a diferença.

#include<iostream>
using namespace std;


int main(){
	int codigo;
	int code;
	float salario;
	float final;
	cout<<"-------------------------------------------------------------------------------------------------------------------"<<endl;
	cout<<"Vamos ter uma reformulacao nos salarios de nossa empresa!Por gentileza informe seu codigo de servico e seu salario!"<<endl;
	cout<<"-------------------------------------------------------------------------------------------------------------------"<<endl;
	cout<<endl<<"Insira seu codigo aqui!"<<endl;
	cin>>codigo;
	cout<<"Insira seu salario aqui!"<<endl;
	cin>>salario;
	
	if (codigo == 101){
	code = 1;
	}else if (codigo == 102){
	code = 2;
	}else if (codigo == 103){
	code = 3;
	}else{
	code = 4;
}

	switch (code){
		case 1:
			cout<<"Seu cargo eh Gerente"<<endl;
			final = salario + (salario*0.10);
			cout<<"Seu salario antigo era de R$"<<salario<<endl;
			cout<<"Seu novo salario eh de R$"<<final;
			break;
		case 2:
			cout<<"Seu cargo eh Engenheiro"<<endl;
			final = salario + (salario*0.20);
			cout<<"Seu salario antigo era de R$"<<salario<<endl;
			cout<<"Seu novo salario eh de R$"<<final;
			break;
		case 3:
			cout<<"Seu cargo eh Tecnico"<<endl;
			final = salario + (salario*0.30);
			cout<<"Seu salario antigo era de R$"<<salario<<endl;
			cout<<"Seu novo salario eh de R$"<<final;
			break;
		case 4:
			cout<<"Seu cargo eh Funcionario"<<endl;
			final = salario + (salario*0.40);
			cout<<"Seu salario antigo era de R$"<<salario<<endl;
			cout<<"Seu novo salario eh de R$"<<final;
			break;
	}
	
	return 0;
	
}
