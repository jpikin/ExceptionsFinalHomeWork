package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        List<List> personLst = getPersonInfo();


    }

    public static <T> List<List> getPersonInfo() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        return getSortedList(makeListData(str));
    }

    public static List<String> makeListData(String str) {
        String[] strArray = str.split(" ");
        CheckData.checkArrayLength(strArray);
        List<String> lst = new ArrayList<>();
        lst.addAll(Arrays.asList(strArray));
        return lst;
    }

    public static List<List> getSortedList(List<String> mainList) {
        boolean flagNum = false;
        boolean flagDot = false;
        List<List> sortedList = new ArrayList<List>();
        List nameList = new ArrayList<>();
        List dateList = new ArrayList<>();
        List genderList = new ArrayList<>();
        List phoneList = new ArrayList<>();
        for (String s : mainList) {
            if (s.length() == 1) {
                CheckData.checkGender(s.toLowerCase());
                genderList.add(s);
            } else {
                for (char ch : s.toCharArray()) {
                    if (Character.isDigit(ch)) flagNum = true;
                    if (s.contains(".")) flagDot = true;
                }
                if (flagDot && flagNum) {
                    CheckData.checkDateBirth(s);
                    dateList.add(s);
                }
                if (!flagDot && flagNum) phoneList.add(Integer.parseInt(s));
                if (!flagDot && !flagNum) nameList.add(s);
            }
        }
        sortedList.add(nameList);
        sortedList.add(dateList);
        sortedList.add(phoneList);
        sortedList.add(genderList);

        return sortedList;
    }



}