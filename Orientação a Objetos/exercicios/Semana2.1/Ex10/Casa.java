
package com.github.lgrodriguess.ex9;
import java.util.Scanner;

public class Casa {
    private String endereco;
    private double area;
    private int quartos;
    private double preco;
    
    Casa(){
        this.endereco = "";
        this.area = 0.0;
        this.quartos = 0;
        this.preco = 0.0;
    }
    Casa(String endereco, double area, int quartos, double preco){
        this.endereco = endereco;
        this.area = area;
        this.quartos = quartos;
        this.preco = preco;
    }
    
   //Copiar
    void Casa(Casa other){
        this.endereco = other.getEndereco();
        this.area = other.getArea();
        this.quartos = other.getQuartos();
        this.preco = other.getPreco();
    }
    
    //Getters
    public String getEndereco(){
        return this.endereco;
    }
    private double getArea(){
        return this.area;
    }
    private int getQuartos(){
        return this.quartos;
    }
    private double getPreco(){
        return this.preco;
    }
    
    //Setters
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setArea(double area){
        this.area = area;
    }
    public void setQuartos(int quartos){
        this.quartos = quartos;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    //Preencher
    public void fill(){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Endereco:");
        this.endereco = ler.nextLine();
        System.out.println("Area:");
        this.area = ler.nextDouble(); ler.nextLine();
        System.out.println("Quartos:");
        this.quartos = ler.nextInt(); ler.nextLine();
        System.out.println("Preco:");
        this.preco = ler.nextDouble(); ler.nextLine();
    }
    
    //Imprimir
    @Override
    public String toString(){
        return "Casa{ \n" +
                "Endereco='" + this.endereco + "'\n" +
                "Area='" + this.area + "'\n" +
                "Numero Quartos='" + this.quartos + "'\n" +
                "Preco='" + this.preco +
                "'}";
    }
    
    public double calcularPrecoPorM2(){
    return getPreco() / getArea();
}
    
    public String exibirResumo(){
        return this.endereco + "|" + this.area + "m² |" + this.quartos + " quartos |" + "R$" + this.preco + "|" + "R$" + calcularPrecoPorM2();
    }
}
