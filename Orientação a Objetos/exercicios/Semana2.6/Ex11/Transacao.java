package com.github.lgrodriguess.ex11;
public class Transacao {
    private String ID;
    private String tipo;
    private double valor;
    private String data;
    private Conta contaAss;
    
    Transacao(String ID, String tipo, double valor, String data, Conta contaAss){
        this.ID = ID;
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
        this.contaAss = contaAss;
    }
    Transacao(){
        this.ID = "";
        this.tipo = "";
        this.valor = 0.0;
        this.data = "";
        this.contaAss = new Conta();
    }
    public void realizaTransacaoSimples(){
        if(tipo.equalsIgnoreCase("depositar")){
            contaAss.depositar(valor);
        } else if(tipo.equalsIgnoreCase("sacar")){
            contaAss.sacar(valor);
        } else {
            System.out.println("Tipo inválido para este método");
        }
    }
    public void realizaTransferencia(Conta outro){
        if(tipo.equalsIgnoreCase("transferencia")){
            contaAss.transferencia(valor, outro);
        } else {
            System.out.println("Tipo inválido para este método");
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transacao{ ");
        sb.append("Id: ").append(ID).append(", ");
        sb.append("Tipo: ").append(tipo).append(", ");
        sb.append("Valor: ").append(valor).append(", ");
        sb.append("Data: ").append(data).append(", ");
        sb.append("Conta associada: ").append(contaAss).append("}\n");
        return sb.toString();
    }
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public Conta getContaAss() {
        return contaAss;
    }
    public void setContaAss(Conta contaAss) {
        this.contaAss = contaAss;
    }
}
