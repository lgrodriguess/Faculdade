package com.github.lgrodriguess.ex5;
import java.util.Scanner;

public class AnimalEst {
        private String especie;
        private String raca;
        private int idade;
        private double peso;
        
        
        AnimalEst(){
            this.especie = "";
            this.raca = "";
            this.idade = 0;
            this.peso = 0.0;
        }
        AnimalEst(String especie, String raca, int idade, double peso){
            this.especie = especie;
            this.raca = raca;
            this.idade = idade;
            this.peso = peso;
        }
        //Copiar
        void Copy(AnimalEst other){
            this.especie = other.getEspecie();
            this.raca = other.getRaca();
            this.idade = other.getIdade();
            this.peso = other.getPeso();
        }
        //Setters
        public void setEspecie(String especie){
            this.especie = especie;
        }
        public void setRaca(String raca){
            this.raca = raca;
        }
        public void setIdade(int idade){
            this.idade = idade;
        }
        public void setPeso(double peso){
            this.peso = peso;
        }
        //Getters
        public String getEspecie(){
            return this.especie;
        }
        public String getRaca(){
            return this.raca;
        }
        public int getIdade(){
            return this.idade;
        }
        public double getPeso(){
            return this.peso;
        }
        //Preencher
        public void fill(){
            Scanner ler = new Scanner(System.in);
            
            System.out.println("Especie:");
            this.especie = ler.nextLine();
            System.out.println("Raca:");
            this.raca = ler.nextLine();
            System.out.println("Idade");
            this.idade = ler.nextInt(); ler.nextLine();
            System.out.println("Peso:");
            this.peso = ler.nextDouble();
        }
        //Imprimir
        @Override
        public String toString(){
            return "Animal De Estimacao{\n " +
                   "Especie= '" + this.especie + "'\n" +
                   "Raca= '" + this.raca + "'\n" +
                   "Idade= '" + this.idade + "'\n" +
                   "Peso= '" + this.peso + "'\n" +
                   "}";          
        }
}
