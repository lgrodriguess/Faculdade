//Crie uma struct chamada "Triângulo" que armazene as coordenadas de três pontos: A, B e C. Adicione um método para calcular a área do triângulo. Adicionar um método significa colocar a função dentro da struct
#include<iostream>
#include<cmath>
using namespace std;

struct Cordenadas{
    float x;
    float y;
};

struct Triangulo{
    Cordenadas A;
    Cordenadas B;
    Cordenadas C;

    float calcularArea(){
        return 0.5 * abs(A.x*(B.y - C.y) + B.x*(C.y - A.y) + C.x*(A.y - B.y));
    }

};

int main(){
    Triangulo T;

    cout<<"Insira o valor de x do ponto A"<<endl;
    cin>>T.A.x;
    cout<<"Insira o valor de y do ponto A"<<endl;
    cin>>T.A.y;

    cout<<"Insira o valor de x do ponto B"<<endl;
    cin>>T.B.x;
    cout<<"Insira o valor de y do ponto B"<<endl;
    cin>>T.B.y;

    cout<<"Insira o valor de x do ponto C"<<endl;
    cin>>T.C.x;
    cout<<"Insira o valor de y do ponto C"<<endl;
    cin>>T.C.y;

    float area = T.calcularArea();
    cout<<"A area do Triangulo eh: "<<area<<endl;

        return 0;
}
