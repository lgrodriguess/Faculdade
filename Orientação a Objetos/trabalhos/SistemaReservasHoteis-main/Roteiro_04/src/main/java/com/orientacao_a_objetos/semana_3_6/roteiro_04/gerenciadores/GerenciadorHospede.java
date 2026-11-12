package com.orientacao_a_objetos.semana_3_6.roteiro_04.gerenciadores;

import com.orientacao_a_objetos.semana_3_6.roteiro_04.classes.Hospede;
import com.orientacao_a_objetos.semana_3_6.roteiro_04.file.FilePersistence;
import com.orientacao_a_objetos.semana_3_6.roteiro_04.file.serializadores.SerializadorJSONHospede;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorHospede {
    private List<Hospede> hospedes;
    
    public GerenciadorHospede(){
        this.hospedes = new ArrayList<>(); 
    }
    
    public List<Hospede> getHospedes(){
        return hospedes;
    }
    public void setHospedes(List<Hospede> hospedes){
        if (hospedes == null) {
            this.hospedes = new ArrayList<>();
        } else {
            this.hospedes = hospedes;
        }    
    }
    public int getNumHospedes(){
        return hospedes.size();
    }
    public void add(Hospede hospede){
        this.hospedes.add(hospede);
    }
    public void remove(Hospede hospede){
        if(hospedes.contains(hospede)){
            this.hospedes.remove(hospede);
            System.out.println("Hospede removido");
        }
        else {
            System.out.println("Hospede não encontrado");
        }
    }
    public void listar(){
        for(Hospede h : hospedes){
            System.out.println(h);
        }
    }
    public Hospede findById(String id){
        for(Hospede h : hospedes){
            if(h.getID().equals(id)){
                return h;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return "GerenciadorHospede{" + "hospedes=" + hospedes + '}';
    }
 
    public void gravarNoArquivo(String pathFile) throws IOException{
        SerializadorJSONHospede serializadorJSON = new SerializadorJSONHospede();
        String jsonData = serializadorJSON.toJSON(this.hospedes);
        
        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(jsonData, pathFile);
        
        System.out.println("Hospedes salvos em: " + pathFile);
    }
    public void carregarDoArquivo(String pathFile){
        FilePersistence filePersistence = new FilePersistence();
        String jsonData = filePersistence.loadToFile(pathFile);
        
        if (jsonData == null || jsonData.isBlank()) {
            this.hospedes = new ArrayList<>();
            System.out.println("Arquivo vazio ou não encontrado. Lista de hóspedes iniciada vazia.");
            return;
        }
        
        SerializadorJSONHospede serializadorJSON = new SerializadorJSONHospede();
        setHospedes(serializadorJSON.fromJSON(jsonData));
        
        System.out.println("Hospedes carregados com sucesso de: " + pathFile);
    }
    
}
