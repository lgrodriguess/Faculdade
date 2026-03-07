#include<iostream>
using namespace std;

struct contato{
    string nome;
    string numero;
};
struct Agenda{
    contato *contatos;
    int tam;
    int numctt;

    void addctt(contato novo){
        if (numctt < tam){
            contatos[numctt] = novo;

            numctt ++;
            cout<<"Contato adicionado com sucesso!"<<endl;
        } else {
            cout << "A agenda está cheia. Não é possível adicionar mais contatos." << std::endl;
        }
    }

    void criarctt(){
        contato novo;
        int x;
        do{
            cout<<"Quantos contatos deseja adicionar?"<<endl;
        cin>>x;
        
        if (x + numctt > tam){
            cout<<"Numero excedido, por favor tente novamente"<<endl;
        }
    }while (x + numctt > tam);

        for(int i = 0; i < x; i++){
        cout<<"Informe o nome do contato!"<<endl;
        cin>>novo.nome;
        cout<<"Informe o numero do contato!"<<endl;
        cin>>novo.numero;
    
        addctt(novo);
        }
    }
    
    void excluirContato(string nome) {
        bool contatoEncontrado = false;
        for (int i = 0; i < numctt; i++) {
            if (contatos[i].nome == nome) {
                for (int j = i; j < numctt - 1; j++) {
                    contatos[j] = contatos[j + 1];
                }
                numctt--;
                contatoEncontrado = true;
                cout << "Contato excluido com sucesso!" << endl;
                break;
            }
        }
        if (!contatoEncontrado) {
            cout << "Contato não encontrado na agenda." << endl;
        }
    }
    void exibirctt(){
        cout<<"Lista de contatos : "<<endl;
        for (int i = 0; i < numctt; i++){
            cout<<"Nome : "<<contatos[i].nome<<" Numero : "<<contatos[i].numero;
        }
    }
    
};

int main(){
    char x;
   Agenda agenda;
   agenda.numctt = 0;

   cout<<"Informe o tamanho da sua agenda!"<<endl;
   cin>>agenda.tam;
   agenda.contatos = new contato[agenda.tam];

   agenda.criarctt();
    cout<<"Deseja excluir algum contato? Responda com 's' ou 'n' "<<endl;
    cin>>x;
    switch (x) {
    case 's': {
        string nome;
        cout << "Digite o nome" << endl;
        cin >> nome;
        agenda.excluirContato(nome);
        break;
    }
    case 'n': {
        cout << "Nenhum contato foi excluido!" << endl;
        break;
    }
}
    agenda.exibirctt();
    return 0;
}
