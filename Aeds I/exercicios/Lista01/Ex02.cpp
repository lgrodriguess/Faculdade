//Faça um programa que leia N números e informe o maior número.
//Aluno: Luan Rodrigues
//Instituição: If Sudeste MG - Rp
//Período: Primeiro Período
#include <iostream>
using namespace std;

int main() {
    int n, num, maior;

    cout << "Quantos numeros voce deseja digitar? ";
    cin >> n;

    if (n <= 0) {
        cout << "Quantidade invalida!" << endl;
        return 1;
    }

    cout << "Digite o número 1: ";
    cin >> num;
    maior = num;

    for (int i = 2; i <= n; i++) {
        cout << "Digite o número " << i << ": ";
        cin >> num;

        if (num > maior) {
            maior = num;
        }
    }

    cout << "O maior número digitado foi: " << maior << endl;

    return 0;
}
