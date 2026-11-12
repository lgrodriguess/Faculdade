package com.orientacao_a_objetos.semana_3_6.roteiro_04.file.serializadores;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.orientacao_a_objetos.semana_3_6.roteiro_04.classes.Hospedagem;
import java.util.List;

/**
 *
 * @author Vitor
 */
public class SerializadorJSONHospedagem {

    public String toJSON(List<Hospedagem> hospedagens) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String jsonString = mapper.writeValueAsString(hospedagens);

            return jsonString;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<Hospedagem> fromJSON(String jsonString) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            List<Hospedagem> hospedagens = mapper.readValue(jsonString,new TypeReference<List<Hospedagem>>(){});

            return hospedagens;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}