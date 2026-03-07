Float Lista::calculaLucro(){
  float lucroTotal = 0;
  for(int i=0; i<=quanti-1;i++){
    float dif = Lista[i].getPreco() - Lista[i].getCusto();
    float lucroUnitario = dif * Lista[i].getEstoque();
    lucroTotal += lucroUnitario;
    }
    return lucroTotal;
    }
