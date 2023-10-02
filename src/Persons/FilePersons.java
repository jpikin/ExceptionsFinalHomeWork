package Persons;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FilePersons {


    public FilePersons() throws IOException {

    }


    public void createNewFilePerson(Person person) {

        try (FileWriter writer = new FileWriter(person.getLastName() + ".txt", true)) {
            String text = person.getAllPersonInfo()+"\n";
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


}
