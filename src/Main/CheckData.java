package Main;

public class CheckData {
    /**
     * Провеяем правильное количество введенных данных
     * @param strArray Массив из строки, введенной в консоль.
     */
    public static void checkArrayLength(String[] strArray) {
        if (strArray.length < 6) {
            throw new RuntimeException("Количество введенных данных меньше, чем необходимо");
        } else if (strArray.length > 6) {
            throw new RuntimeException("Количество введенных данных больше, чем необходимо");
        }
    }
    public static void checkDateBirth(String date){

    }

    /**
     * Проверям на правильность введение пола(M/Ж)
     */
    public static void checkGender(String c){
        if (!c.equals("m") && !c.equals("f"))
            throw new RuntimeException("Пол указан неверно");
    }
}
