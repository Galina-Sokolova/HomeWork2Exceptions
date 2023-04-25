import java.util.Scanner;

public class Task4 {
        public static void main(String[] args) throws Exception{
//          Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//          Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите данные: ");
                String value = scanner.nextLine();
                if (value.isEmpty()){
                        throw new Exception("Пустые строки вводить нельзя");
                } else {
                        System.out.println("Данные приняты");
                }
                System.out.println(value);
        }

}
