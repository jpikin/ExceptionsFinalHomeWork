package Persons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class FilePersons {
    private List listPersons;
    public void readListPersons() throws FileNotFoundException {
        File newFile = new File("listPersons.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(newFile);
        } catch (FileNotFoundException ex){
            throw new FileNotFoundException("Файл не найден");
        }
        byte [] buffer = new byte[1024];


    }
    public void checkListPersons(List<List> personLst){
        String name = (String) personLst.get(0).get(0);
        for (Object s: listPersons) {
            if (s.equals(name))addNewPersonToFile(personLst);
            else createNewFilePerson(personLst);
        }
    }
    public void createNewFilePerson(List<List> personLst) {

    }
    public void addNewPersonToFile(List<List> personLst){

    }
}
