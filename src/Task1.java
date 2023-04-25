import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает
        введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо
        этого, необходимо повторно запросить у пользователя ввод данных.*/

public class Task1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        float number = task1.numberEntry();
        System.out.println("Число " + number + " успешно введено!");
    }
    public static float numberEntry() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введите дробное число: ");
                float number = sc.nextFloat();
                if( number == Float.POSITIVE_INFINITY ){
                    throw new InputMismatchException();
                }
                return number;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода! Попробуйте снова!");
                sc.nextLine();
            }
        }

    }
}

