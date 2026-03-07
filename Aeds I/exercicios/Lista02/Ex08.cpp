#include <iostream>
using namespace std;

void notas(){
	float nota = 0;
	while(true){ // o "TRUE" faz com que o programa fica se repetindo infinitamente
		cout<<"Digite uma nota de 0 a 10"<<endl;
		cin>>nota;
		if (nota < 0){ //Caso a noota for negativa, o programa vai parar
			break;
		}
		if (nota >= 0 and nota <= 10){ // se a nota for igual ou tiver entre 0 e 10 , o programa vai rodar e ficar se repetindo.
			cout<< "Nota Inserida : "<< nota << endl;
		}else { // caso o valor inserido nao entrar nas condiçoes, o programa vai parar
			cout<<"A nota inserida eh invalida!!"<<endl;
			break;
		}
	}
}

int main(){
	notas();
	
	return 0;
}
