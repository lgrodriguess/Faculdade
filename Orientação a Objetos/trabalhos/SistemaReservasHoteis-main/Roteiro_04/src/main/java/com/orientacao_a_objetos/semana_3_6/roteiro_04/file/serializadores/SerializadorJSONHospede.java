package com.orientacao_a_objetos.semana_3_6.roteiro_04.file.serializadores;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.orientacao_a_objetos.semana_3_6.roteiro_04.classes.Hospede;
import java.util.List;

public class SerializadorJSONHospede {

    public String toJSON(List<Hospede> hospedes){
        try{
            ObjectMapper mapper = new ObjectMapper();
            String jsonString = mapper.writeValueAsString(hospedes);

            return jsonString;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public List<Hospede> fromJSON(String jsonString){
        try{
            ObjectMapper mapper = new ObjectMapper();

            List<Hospede> hospedes = mapper.readValue(
                jsonString,
                new TypeReference<List<Hospede>>(){}
            );

            return hospedes;

        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}