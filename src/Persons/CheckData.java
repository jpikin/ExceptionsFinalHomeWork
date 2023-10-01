package Persons;

public class CheckData {
    public static void checkArrayLength(String[] strArray) {
        if (strArray.length < 6) {
            throw new RuntimeException("Количество введенных данных меньше, чем необходимо");
        } else if (strArray.length > 6) {
            throw new RuntimeException("Количество введенных данных больше, чем необходимо");
        }
    }
    public static void checkDateBirth(String date) {
        String[] dateArray = date.split("\\.");
        if (dateArray[2].length() != 4)
            throw new RuntimeException("Некорректный ввод года");
        int day = Integer.parseInt(dateArray[0]);
        int month = Integer.parseInt(dateArray[1]);
        if (day < 1 || day > 31 || month < 1 || month > 12) {
            throw new RuntimeException("Некорректный ввод даты");

        }
    }
    /**
     * Проверям на правильность введение пола(M/Ж)
     */
    public static void checkGender(String c) {
        if (!c.equals("m") && !c.equals("f"))
            throw new RuntimeException("Пол указан неверно");
    }

    /**
     * @apiNote Проверяем на корректность ввода номера телефона
     */
    public static void checkPhone(String num){
        try {
            Long phone = Long.parseLong(num);
        } catch (NumberFormatException ex){
            throw new NumberFormatException("Некорректный ввод номера телефона");
        }
    }
}
