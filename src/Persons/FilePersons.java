package Persons;

import java.io.*;
import java.util.List;

public class FilePersons {
    private List listPersons;

    public FilePersons() throws IOException {
        listPersons = readListPersons();
    }
    public List getListPersons(){
        return listPersons;
    }

    public List readListPersons() throws IOException {
        try(FileReader reader = new FileReader("listPersons.txt"))
        {
            int c;
            while((c=reader.read())!=-1){
                listPersons.add((char)c);
            }
        } catch (FileNotFoundException ex){
            throw new FileNotFoundException("Файл не найден");
        }
        return listPersons;
    }

    public void checkListPersons(List personLst, Person person){
        String name = person.getLastName();
        boolean flag = false;
        for (Object s: listPersons) {
            if (s.equals(name)) flag = true;
            if(flag) addNewPersonToFile(personLst, person);
            else createNewFilePerson(personLst, person);
        }
    }
    public void createNewFilePerson(List<List> personLst, Person person) {

        try(FileWriter writer = new FileWriter((String) personLst.get(0).get(0), false))
        {
            // запись всей строки
            String text = "Hello Gold!";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
    public void addNewPersonToFile(List<List> personLst, Person person){

    }
}
