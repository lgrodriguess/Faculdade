package com.orientacao_a_objetos.semana_3_6.roteiro_04.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FilePersistence {

    public void saveToFile(String texto, String fileName) {
        try {
            File file = new File(fileName);

            FileWriter arq = new FileWriter(file);
            PrintWriter gravarArq = new PrintWriter(arq);

            gravarArq.print(texto);

            gravarArq.close();
            arq.close();

            System.out.println("Arquivo salvo em: " + file.getAbsolutePath());

        } catch (IOException ex) {
            Logger.getLogger(FilePersistence.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
    }

    public String loadToFile(String fileName) {
        String conteudoLido = "";

        try {
            File file = new File(fileName);

            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("\\Z");

            while (scanner.hasNext()) {
                conteudoLido += scanner.next();
            }

            scanner.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FilePersistence.class.getName())
                    .log(Level.SEVERE, null, ex);
        }

        return conteudoLido;
    }
}
