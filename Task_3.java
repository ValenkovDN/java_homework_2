/*
Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом
(возвращает boolean значение). Без встр. функций
 */
import java.util.Scanner;
class Task_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите строку, которую хотите проверить: ");
        String str = iScanner.nextLine();
        StringBuilder str_2 = new StringBuilder();
        iScanner.close();

        for (int i = str.length() -1; i >= 0; i--) {
            char c = str.charAt(i);
            str_2.append(c);
        }
        System.out.println(str_2);
        String result = str_2.toString();
        if (str.equals(result)){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
