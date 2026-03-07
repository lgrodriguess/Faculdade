//a)Faça um método que calcule o preço médio de todos os produtos.

  float Lista::PrecoMedio(){
      float soma = 0;
      for(int i=0; i<=quant-1; i++){
        soma += Lista[i].getPreco();
    }
    float media = soma/quant;
    return media;
}
