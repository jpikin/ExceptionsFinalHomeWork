package Main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String str = getInfo();
        checkStringLength(str);
    }

    public static String getInfo() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        return str;
    }

    public static boolean checkStringLength(String str) {
        String[] strArray = str.split(" ");
        if (strArray.length < 6) {
            throw new RuntimeException("Количество введенных данных меньше, чем необходимо");
        } else if (strArray.length > 6) {
            throw new RuntimeException("Количество введенных данных больше, чем необходимо");
        }
        return true;
    }
}