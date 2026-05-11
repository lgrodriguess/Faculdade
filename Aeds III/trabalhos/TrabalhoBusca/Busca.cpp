#include <iostream>
#include <stdio.h>
#include <iomanip>

//Vitor Pereira dos Reis e Luan Gabriel Rodrigues Longo

using namespace std;

float funcao(float x){
    return ((x*x*x)-(x) - 2);
}
bool calculaRaiz(float x) {
    if (0.00005 > funcao(x) && funcao(x) > -0.00005) {
        return true;
    }
    return false;
}
float binary_search(float low, float high)
{
    float middle; /* índice do elemento central */

    if (low > high) return (-1); /* chave não encontrada */

    middle = (low+high)/2;
    if ((0.00005 > funcao(middle) && funcao(middle) > -0.00005)) return(middle);

    if (funcao(middle)*funcao(low) < 0) {
        high = middle;
        return(binary_search(low, high));
    }   else {
        low = middle;
        return(binary_search(low, high));
    }
}




int main() {

    float pos = binary_search(-20, 20);

    cout<< "A raiz eh " <<setprecision(4) << pos << endl;

    return 0;
}