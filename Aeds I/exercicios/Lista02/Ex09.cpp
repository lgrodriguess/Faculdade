#include <iostream>
using namespace std;

void notas(){
	float nota = 0;
	while(true){ // o "TRUE" faz com que o programa fica se repetindo infinitamente
		cout<<"Digite uma unica nota de 0 a 10"<<endl;
		cin>>nota;
		if (nota >= 0 and nota <= 10){ // se a nota for igual ou tiver entre 0 e 10 , o programa vai se encerrar!
			cout<< "Nota Inserida : "<< nota << endl;
			break;
		}else { // caso o valor inserido nao entrar nas condiçoes, o programa vai avisar e vai ficar se repetindo ate entrar nas condicoes
			cout<<"A nota inserida eh invalida!!"<<endl;
	
		}
	}
}

int main(){
	notas();	
	return 0;
}
