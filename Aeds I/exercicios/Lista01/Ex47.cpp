#include <iostream>
#include <math.h>
using namespace std;

//Sua tarefa é desenvolver um programa em C++ que possa ler o índice de poluição atual e, com base nesses critérios, determinar quais grupos de indústrias devem ser notificados para suspender suas atividades. Esse programa ajudará o departamento a agir rapidamente, garantindo a tomada de decisões eficazes para proteger o meio ambiente.
//Aluno: Luan Rodrigues
//Instituição: If Sudeste MG - Rp
//Período: Primeiro Período

		void Dados(float d){
			
			if (d > 0.05 and d < 0.3){
			cout<<"First Group - Ambiente Seguro"<<endl;
			cout<<"Second Group - Ambiente Seguro"<<endl;
			cout<<"Third Group - Ambiente Seguro"<<endl;
		}else if (d >= 0.3 and d <0.4){
			cout<<"First Group - Estado De Alerta!!"<<endl;
			cout<<"Second Group - Ambiente Seguro"<<endl;
			cout<<"Third Group - Ambiente Seguro"<<endl;
		}else if (d >= 0.4  and d < 0.5){
			cout<<"First Group - Estado De Alerta!!"<<endl;
			cout<<"Second Group - Estado De Alerta!!"<<endl;
			cout<<"Third Group - Ambiente Seguro"<<endl;
		}else if (0.5 <= d ){
			cout<<"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"<<endl;
			cout<<"First Group - Estado Critico!!"<<endl;
			cout<<"Second Group - Estado Critico!!"<<endl;
			cout<<"Third Group - Estado Critico!!"<<endl;
			cout<<"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"<<endl;
			cout<<" "<<endl;
			cout<<"Parem Todas as Atividades!!!"<<endl;
		}
		}
		int main (){
		cout<<"-----------------------------------------------"<<endl;
		cout<<"Estado Atual De Acordo Com o indice de Poluicao"<<endl;
		cout<<"-----------------------------------------------"<<endl;
		cout<<"First Group - Estado Normal"<<endl;
		cout<<"Second Group - Estado Normal"<<endl;
		cout<<"Tird Group - Estado Normal"<<endl;
		
		
		cout<<"---------------------------------"<<endl;
		cout<<"Insira o Indice de Poluicao Atual"<<endl;
		cout<<"---------------------------------"<<endl;
		float d;
		cin >> d;
		 Dados(d);
		 
		return 0;	
	}
