package com.orientacao_a_objetos.semana_3_6.roteiro_04.file.serializadores;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.orientacao_a_objetos.semana_3_6.roteiro_04.classes.Reserva;
import java.util.List;

public class SerializadorJSONReserva {

    public String toJSON(List<Reserva> reservas){
        try{
            ObjectMapper mapper = new ObjectMapper();
            mapper.findAndRegisterModules();
            String jsonString = mapper.writeValueAsString(reservas);

            return jsonString;

        } catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public List<Reserva> fromJSON(String jsonString){
        try{
            ObjectMapper mapper = new ObjectMapper();
            mapper.findAndRegisterModules();

            List<Reserva> reservas =
                    mapper.readValue(
                            jsonString,
                            new TypeReference<List<Reserva>>(){}
                    );

            return reservas;

        } catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }
}