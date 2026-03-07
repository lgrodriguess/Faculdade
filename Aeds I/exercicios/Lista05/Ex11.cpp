#include<iostream>
using namespace std;

struct ContaBancaria{
    string NumeroC;
    float Saldo;

    void preencher(){
        cout<<"Informe o numero da conta!"<<endl;
        cin>>NumeroC;
        cout<<"Informe o saldo atual!"<<endl;
        cin>>Saldo;
    }
    void imprimir(){
        cout<<"-----------------"<<endl;
        cout<<" Conta : "<<NumeroC<<endl;
        cout<<" Saldo : "<<Saldo<<endl;
        cout<<"-----------------"<<endl;
    }
    void menu(){
        int choose;
        float deposito;
        float saque;
        cout<<"---------------------"<<endl;
        cout<<" Depositos Digite 1"<<endl;
        cout<<" Saques Digite 2"<<endl;
        cout<<" Finalizar Digite 3"<<endl;
        cout<<"---------------------"<<endl;
        cin>>choose;
        switch (choose){
            case 1:
                cout<<"Digite a quantidade desejada para depositar."<<endl;
                cin>>deposito;
                Saldo = Saldo + deposito;
                cout<<"O saldo final eh : "<<Saldo;
                break;
            case 2:
                cout<<"Digite a quantidade desejada para sacar."<<endl;
                cin>>saque;
                Saldo = Saldo - saque;
                cout<<"O saldo final eh : "<<Saldo;
                break;
            case 3:
                cout<<"Voce finalizou a operacao!"<<endl;
                cout<<"Seu saldo eh de "<<Saldo<<" reais."<<endl;
                break;
        }

    }
};

int main(){
    ContaBancaria A;
    A.preencher();
    A.imprimir();
    A.menu();
    return 0;
}
