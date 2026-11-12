package com.orientacao_a_objetos.semana_3_6.roteiro_04.file.serializadores;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.orientacao_a_objetos.semana_3_6.roteiro_04.classes.Endereco;
import java.util.List;

public class SerializadorJSONEndereco {

    public String toJSON(List<Endereco> enderecos) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String jsonString = mapper.writeValueAsString(enderecos);

            return jsonString;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Endereco> fromJSON(String jsonString) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            List<Endereco> enderecos = mapper.readValue(jsonString,new TypeReference<List<Endereco>>() {});

            return enderecos;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}