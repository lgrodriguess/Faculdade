/*encontre o elemento majoritário de
um vetor de tamanho n e verifique a
complexidade do algoritmo.
O elemento majoritário é o elemento que
aparece mais de ⌊
n
2
⌋ vezes, e portanto só existe
um elemento deste tipo por vetor. Você pode
assumir que o vetor não está vazio e o elemento
majoritário sempre existe dentro do vetor.
Entrada: Vetor de inteiros e tamanho.
Saída: O elemento majoritário no vetor.*/

#include <iostream>
using namespace std;

int elementoMajoritario(int v[], int n) {
    int candidato = v[0];
    int contador = 1;

    for(int i = 1; i < n; i++) {
        if(contador == 0) {
            candidato = v[i];
            contador = 1;
        }
        else if(v[i] == candidato) {
            contador++;
        }
        else {
            contador--;
        }
    }

    return candidato;
}

int main() {
    int n;
    
    cout << "Digite o tamanho do vetor: ";
    cin >> n;

    int v[n];

    cout << "Digite os elementos do vetor:\n";
    for(int i = 0; i < n; i++) {
        cin >> v[i];
    }

    int resultado = elementoMajoritario(v, n);

    cout << "Elemento majoritario: " << resultado << endl;

    return 0;
}
