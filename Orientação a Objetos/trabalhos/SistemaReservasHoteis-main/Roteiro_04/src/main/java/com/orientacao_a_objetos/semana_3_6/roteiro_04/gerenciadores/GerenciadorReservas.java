package com.orientacao_a_objetos.semana_3_6.roteiro_04.gerenciadores;

import com.orientacao_a_objetos.semana_3_6.roteiro_04.classes.Reserva;
import com.orientacao_a_objetos.semana_3_6.roteiro_04.file.FilePersistence;
import com.orientacao_a_objetos.semana_3_6.roteiro_04.file.serializadores.SerializadorJSONReserva;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorReservas {
    private List<Reserva> reservas;
    
    public GerenciadorReservas(){
        this.reservas = new ArrayList<>();
    }
    public void add(Reserva reserva){
        reservas.add(reserva);
    }
    public void remove(Reserva reserva){
        reservas.remove(reserva);
    }
    public List<Reserva> getReservas() {
        return reservas;
    }
    public void listar(){
        for(Reserva r : reservas){
            System.out.println(r);
        }
    }
    public void setReservas(List<Reserva> reservas) {
        if(reservas == null){
            this.reservas = new ArrayList<>();
        }else{
            this.reservas = reservas;
        }
    }
    public void gravarNoArquivo(String pathFile) throws IOException{
        SerializadorJSONReserva serializadorJSON = new SerializadorJSONReserva();
        String jsonData = serializadorJSON.toJSON(this.reservas);
        
        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(jsonData, pathFile);
        
        System.out.println("Reservas salvas em: " + pathFile);
    }
    public void carregarDoArquivo(String pathFile){
        FilePersistence filePersistence = new FilePersistence();
        String jsonData = filePersistence.loadToFile(pathFile);
        
        if (jsonData == null || jsonData.isBlank()) {
            this.reservas = new ArrayList<>();
            System.out.println("Arquivo vazio ou não encontrado. Lista de reservas iniciada vazia.");
            return;
        }
        
        SerializadorJSONReserva serializadorJSON = new SerializadorJSONReserva();
        setReservas(serializadorJSON.fromJSON(jsonData));
        
        System.out.println("Reservas carregadas com sucesso de: " + pathFile);
    }
}
