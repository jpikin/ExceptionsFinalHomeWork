package Main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String str = getInfo();

    }

    public static String getInfo() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        checkStringLength(str);
        return str;
    }

    public static void checkStringLength(String str) {
        String[] strArray = str.split(" ");
        if (strArray.length < 6) {
            throw new RuntimeException("Количество введенных данных меньше, чем необходимо");
        } else if (strArray.length > 6) {
            throw new RuntimeException("Количество введенных данных больше, чем необходимо");
        }

    }
}