package com.mycompany.ex1s1;

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
    
}
