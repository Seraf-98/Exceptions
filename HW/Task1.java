import java.util.Scanner;

//    1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//        и возвращает введенное значение.
//        Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо
//        повторно запросить у пользователя ввод данных.

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Все хорошо, введенное число:  " + numRequest());
    }

    public static double numRequest() {
        float number = 0;
        boolean getOut = false;
        while (!getOut) {
            System.out.print("Введите дробное число (тип Float): ");
            Scanner scanner = new Scanner(System.in);
            try {
                number = Float.parseFloat(scanner.next());
                System.out.println();
                getOut = true;
            } catch (NumberFormatException e) {
                System.out.println("Попробуйте еще раз!");
                getOut = false;
                number = 0;
            }

        }
        return number;
    }


}