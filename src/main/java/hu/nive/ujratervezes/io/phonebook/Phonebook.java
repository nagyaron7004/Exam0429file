package hu.nive.ujratervezes.io.phonebook;

import java.io.File;
import java.io.FileWriter;
import java.util.Map;
import java.io.IOException;

public class Phonebook {
    void exportPhonebook(Map<String, String> contacts, String output) {
        if(contacts == null || output == null) {
            throw new IllegalArgumentException();
        }
        File outputFile = new File(output);

        try (FileWriter fileWriter = new FileWriter(outputFile,true)) {
            for (Map.Entry<String,String> entry : contacts.entrySet()) {
                fileWriter.write(entry.getKey()+": "+entry.getValue() + System.lineSeparator());
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}