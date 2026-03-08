
package com.mycompany.ex2semana1;

public class Roda {
    private double raio;
    private String material;
    private double peso;
    private double maxPeso;
    
    public Roda(){
        this.raio = 0.0;
        this.material = "";
        this.peso = 0.0;
        this.maxPeso = 0.0;
    }
    
    public Roda(double raio, String material, double peso, double maxPeso){
        this.raio = raio;
        this.material = material;
        this.peso = peso;
        this.maxPeso = maxPeso;
    }
    
    //Setters
    public void setRaio(double raio){
        this.raio = raio;
    }
    public void setMaterial(String material){
        this.material = material;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public void setMaxPeso(double maxPeso){
        this.maxPeso = maxPeso;
    }
    //Getters
    public double getRaio(){
        return this.raio;
    }
    public String getMaterial(){
        return this.material;
    }
    public double getPeso(){
        return this.peso;
    }
    public double getMaxPeso(){
        return this.maxPeso;
    }
    
    
}
