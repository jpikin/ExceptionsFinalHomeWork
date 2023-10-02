package Persons;

import java.io.*;

public class FilePersons {
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
