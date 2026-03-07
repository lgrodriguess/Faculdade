#include<iostream>
#include<math.h>
using namespace std;

struct Vetor{
    float x;
    float y;
    float z;

    float calculo(Vetor &B){
        return x * B.x + y * B.y + z * B.z;
    }

};
void preencher(Vetor &V,char nome){
    cout<<"Insira o valor de x do vetor "<<nome<<endl;
    cin>>V.x;
    cout<<"Insira o valor de y do vetor "<<nome<<endl;
    cin>>V.y;
    cout<<"Insira o valor de z do vetor "<<nome<<endl;
    cin>>V.z;
}

int main(){
    Vetor A;
    Vetor B;
    preencher(A, 'A');
    preencher(B, 'B');
    float resultado = A.calculo(B);
    cout << "Produto escalar: " << resultado << endl;

    return 0;
}
