package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        List<List<String>> personLst = getPersonInfo();
        System.out.println(personLst);
    }

    public static List<List<String>> getPersonInfo() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        return getSortedList(makeListData(str));
    }

    public static List<String> makeListData(String str) {
        CheckData checkData = new CheckData();
        String[] strArray = str.split(" ");
        checkData.checkArrayLength(strArray);
        List<String> lst = new ArrayList<>();
        lst.addAll(Arrays.asList(strArray));
        return lst;
    }

    public static List<List<String>> getSortedList(List<String> mainList) {
        boolean flagNum = false;
        boolean flagDot = false;
        List<List<String>> sortedList = new ArrayList<List<String>>();
        List<String> nameList = new ArrayList<>();
        List<String> dateList = new ArrayList<>();
        List<String> genderList = new ArrayList<>();
        List<String> phoneList = new ArrayList<>();
        for (String s : mainList) {
            if (s.length() == 1) {
                genderList.add(s);
            } else {
                for (char ch : s.toCharArray()) {
                    if (Character.isDigit(ch)) flagNum = true;
                    if (s.contains(".")) flagDot = true;
                }
                if (flagDot && flagNum) dateList.add(s);
                if (!flagDot && flagNum) phoneList.add(s);
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