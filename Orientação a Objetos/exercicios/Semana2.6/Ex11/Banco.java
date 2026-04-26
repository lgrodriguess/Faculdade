package com.github.lgrodriguess.ex11;
import java.util.List;
public class Banco {
    private String nome;
    private GerenciadorDeContas contas;
    private GerenciadorDeTransacoes transacoes;
    
    Banco(String nome){
        this.nome = nome;
        this.contas = new GerenciadorDeContas();
        this.transacoes = new GerenciadorDeTransacoes();
    }
    
    public void listarContas(){
        contas.listarContas();
    }
    public void listarTransacoes(){
        transacoes.listarTransacoes();
    }
    public void adicionarConta(Conta conta){
        contas.add(conta);
    }
    public void adicionarTransacao(Transacao transacao){
        transacoes.add(transacao);
    }
    public void removerConta(String titular){
        contas.remove(titular);
    }
    public void removerTransacao(String ID){
        transacoes.remove(ID);
    }
    public Conta contaMaiorSaldo(){
        return contas.maiorSaldo();
    }
    public Conta contaMenorSaldo(){
        return contas.menorSaldo();
    }
    public int totalDevedores(){
        return contas.totalDevedores();
    }
    public int totalCredores(){
        return contas.totalCredores();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Conta> getListaContas() {
        return contas.getContas();
    }
    public void setContas(GerenciadorDeContas contas) {
        this.contas = contas;
    }
    public List<Transacao> getListaTransacoes() {
        return transacoes.getTransacoes();
    }
    public void setTransacoes(GerenciadorDeTransacoes transacoes) {
        this.transacoes = transacoes;
    }
}
