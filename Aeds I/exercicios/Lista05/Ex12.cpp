#include<iostream>
using namespace std;

struct carro{
    string marca;
    string modelo;
    int ano;

    void preencher(){
        cout<<"Seja Bem vindo à garagem virtual!"<<endl;
        cout<<"Por favor informe os dados do carro!"<<endl;
        cout<<"Informe a [MARCA] : ";
        cin>>marca;
        cout<<"Informe o [MODELO] : ";
        cin>>modelo;
        cout<<"Informe o [ANO] : ";
        cin>>ano;
    }
    void imprimir(){
        cout<<"----GARAGEM VIRTUAL----"<<endl;
        cout<<"  Marca : "<<marca<<endl;
        cout<<"  Modelo : "<<modelo<<endl;
        cout<<"  Ano : "<<ano<<endl;
        cout<<"-----------------------"<<endl;
    }
};
int main(){
    carro a;
    a.preencher();
    a.imprimir();

    return 0;
}
