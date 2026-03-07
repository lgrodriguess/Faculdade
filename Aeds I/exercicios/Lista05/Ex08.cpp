//Crie uma struct chamada "Ponto2D" que armazene as coordenadas x e y. Adicione um método para calcular a distância entre dois pontos. Adicionar um método significa colocar a função dentro da struct
#include<iostream>
#include<cmath>
using namespace std;

struct Ponto2D{
    int x;
    int y;
    float result;

     void imprimeR(){
        cout<<"A Distancia entre os dois pontos eh: "<<result;
    }

    void Distancia(Ponto2D &B){
         result = sqrt((B.x - x)*(B.x - x) + (B.y - y)*(B.y - y));

    }
 
};


int main(){
    Ponto2D A;
    Ponto2D B;
    cout<<"Insira o valor de x do primeiro ponto"<<endl;
    cin>>A.x;
    cout<<"Insira o valor de y do primeiro ponto"<<endl;
    cin>>A.y;

    cout<<endl<<"Insira o valor de x do segundo ponto"<<endl;
    cin>>B.x;
    cout<<"Insira o valor de y do segundo ponto"<<endl;
    cin>>B.y;

    A.Distancia(B);
    A.imprimeR();


    return 0;
}
