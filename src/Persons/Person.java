package Persons;

import java.util.List;

public class Person {
    private String name;
    private String lastName;
    private String patronymic;
    private String date;
    private Long phone;
    private char gender;

    public Person(List<List> inputString){
        name = (String) inputString.get(0).get(0);
        lastName = (String) inputString.get(0).get(1);
        patronymic = (String) inputString.get(0).get(2);
        date = (String) inputString.get(1).get(0);
        phone = (Long) inputString.get(2).get(0);
        String given = (String) inputString.get(3).get(0);;
        char[] chars = given.toCharArray();
        gender = chars[0];
    }
    public String getLastName(){
        return lastName;
    }
}
