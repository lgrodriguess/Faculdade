package com.orientacao_a_objetos.semana_3_6.roteiro_04.gerenciadores;

import com.orientacao_a_objetos.semana_3_6.roteiro_04.classes.Quarto;
import com.orientacao_a_objetos.semana_3_6.roteiro_04.file.FilePersistence;
import com.orientacao_a_objetos.semana_3_6.roteiro_04.file.serializadores.SerializadorJSONQuarto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorQuartos {

    private List<Quarto> quartos;

    public GerenciadorQuartos() {
        quartos = new ArrayList<>();
    }

    public void add(Quarto quarto) {
        quartos.add(quarto);
    }

    public void remove(Quarto quarto) {
        quartos.remove(quarto);
    }

    public void listar() {
        for (Quarto q : quartos) {
            System.out.println(q);
        }
    }

    public Quarto buscarNumero(int numero) {
        for (Quarto q : quartos) {
            if (q.getNum() == numero) {
                return q;
            }
        }

        return null;
    }
    public List<Quarto> getQuartos() {
    return quartos;
    }

    public void setQuartos(List<Quarto> quartos) {
        if(quartos == null){
            this.quartos = new ArrayList<>();
        } else {
            this.quartos = quartos;
        }
    }
    public void gravarNoArquivo(String pathFile) throws IOException{
        SerializadorJSONQuarto serializadorJSON = new SerializadorJSONQuarto();
        String jsonData = serializadorJSON.toJSON(this.quartos);
        
        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(jsonData, pathFile);
        
        System.out.println("Quartos salvos em: " + pathFile);
    }
    public void carregarDoArquivo(String pathFile){
        FilePersistence filePersistence = new FilePersistence();
        String jsonData = filePersistence.loadToFile(pathFile);
        
        if (jsonData == null || jsonData.isBlank()) {
            this.quartos = new ArrayList<>();
            System.out.println("Arquivo vazio ou não encontrado. Lista de quartos iniciada vazia.");
            return;
        }
        
        SerializadorJSONQuarto serializadorJSON = new SerializadorJSONQuarto();
        setQuartos(serializadorJSON.fromJSON(jsonData));
        
        System.out.println("Quartos carregados com sucesso de: " + pathFile);
    }
}