package Main;

public class CheckData {
    public void checkArrayLength(String[] strArray) {
        if (strArray.length < 6) {
            throw new RuntimeException("Количество введенных данных меньше, чем необходимо");
        } else if (strArray.length > 6) {
            throw new RuntimeException("Количество введенных данных больше, чем необходимо");
        }
    }
}
