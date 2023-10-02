package Persons;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FilePersons {
    private List listPersons = new ArrayList();

    public FilePersons() throws IOException {
        listPersons = readListPersons();
    }

    public List getListPersons() {
        return listPersons;
    }

    public List readListPersons() throws IOException {
        try (FileReader reader = new FileReader("listPersons.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                listPersons.add((char) c);
            }
        } catch (FileNotFoundException ex) {
            throw new FileNotFoundException("Файл не найден");
        }
        return listPersons;
    }

    public void checkListPersons(Person person) {
        String name = person.getLastName();
        boolean flag = false;
        if (listPersons != null) {
            for (Object s : listPersons) {
                if (s.equals(name)) flag = true;
            }
            if (flag) addNewPersonToFile(person);
            else createNewFilePerson(person);

        } else {
            createNewFilePerson(person);
            try (FileWriter writer = new FileWriter("listPersons.txt", true)) {
                String text = person.getLastName()+"\n";
                writer.write(text);
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
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

    public void addNewPersonToFile(Person person) {
        try (FileWriter writer = new FileWriter(person.getLastName() + ".txt", false)) {
            String text = person.getAllPersonInfo()+"\n";
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
