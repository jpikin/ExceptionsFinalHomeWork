package Main;

public class CheckData {
    public static void checkArrayLength(String[] strArray) {
        if (strArray.length < 6) {
            throw new RuntimeException("Количество введенных данных меньше, чем необходимо");
        } else if (strArray.length > 6) {
            throw new RuntimeException("Количество введенных данных больше, чем необходимо");
        }
    }
    public static void checkDateBirth(String date){

    }
    public static void checkGender(String c){
        if (!c.equals("m") && !c.equals("f"))
            throw new RuntimeException("Пол указан неверно");
    }
}
