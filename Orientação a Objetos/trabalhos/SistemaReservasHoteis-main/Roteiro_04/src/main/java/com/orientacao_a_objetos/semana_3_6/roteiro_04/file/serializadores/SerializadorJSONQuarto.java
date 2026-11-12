package com.orientacao_a_objetos.semana_3_6.roteiro_04.file.serializadores;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.orientacao_a_objetos.semana_3_6.roteiro_04.classes.Quarto;
import java.util.List;

public class SerializadorJSONQuarto {

    public String toJSON(List<Quarto> quartos) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String jsonString = mapper.writeValueAsString(quartos);

            return jsonString;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<Quarto> fromJSON(String jsonString) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            List<Quarto> quartos = mapper.readValue(jsonString, new TypeReference<List<Quarto>>(){});

            return quartos;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}