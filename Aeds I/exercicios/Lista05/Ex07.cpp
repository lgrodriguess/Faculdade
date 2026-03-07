//Crie uma struct chamada "TimeFutebol" que armazene os seguintes dados: nome (string), cidade (string) e quantidade de títulos (int). Crie uma função para exibir as informações de um time de futebol.
#include<iostream>
using namespace std;

struct TimeFutebol{
    string nome;
    string cidade;
    int titulos;
    
};
void Preenche(TimeFutebol &T1){
    cout<<"Insira o Nome do time: "<<endl;
    cin>>T1.nome;
    cout<<"Insira a Cidade do time: "<<endl;
    cin>>T1.cidade;
    cout<<"Insira a quantidade de titulos do time: "<<endl;
    cin>>T1.titulos;
}
void Exibe(TimeFutebol &T1){
    cout<<"-------------------"<<endl;
    cout<<"Nome : "<<T1.nome<<endl;
    cout<<"Cidade : "<<T1.cidade<<endl;
    cout<<"Titulos : "<<T1.titulos<<endl;
}
int main(){
    TimeFutebol T1;
    Preenche(T1);
    Exibe(T1);
    return 0;
}
