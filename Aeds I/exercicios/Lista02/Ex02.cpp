#include <iostream>
using namespace std;

int main() {
    int N;
    cout << "Digite a quantidade de numeros: ";
    cin >> N;

    if (N <= 0) {
        cout << "A quantidade de numeros deve ser maior que zero." << endl;
        return 1;
    }

    int numero, maior;

    cout << "Digite o primeiro numero: ";
    cin >> numero;
    maior = numero;

    for (int i = 2; i <= N; ++i) {
        cout << "Digite o " << i << "º numero: ";
        cin >> numero;
        if (numero > maior) {
            maior = numero;
        }
    }

    cout << "O maior numero digitado foi: " << maior << endl;

    return 0;
}
