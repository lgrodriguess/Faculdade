//b)Faça um método que encontre todos os produtos que possuem estoque abaixo de 100, afinal quando o estoque abaixa de um certo valor é hora de comprar mais.

Produto* Lista::estoqueMenor(int valorRef){
  int * novoVetor = new int[tam]; //tam = o do vetor Lista;
  int j = 0;
  for(int i=0; i<=quant-1; i++){
      if(Lista[i].getEstoque() < valorRef){
          novoVetor[j].copiar(Lista[i]);
          j++;
      }
  }  
return novoVetor;
}    
    main.cpp

    ...
    ...
    int main(){

    Lista L;
    Produto* vet = L.estoqueMaior(100);
    for(int i=0;i<=vet.getQuant()-1;i++){
      vet[i].imprimir();
      }
