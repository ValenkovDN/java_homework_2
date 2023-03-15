/*
Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
результат после каждой итерации запишите в лог-файл.
 */
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task_1 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Task_1.class.getName());
        FileHandler fh = new FileHandler("logTask_1.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
//        fh.setFormatter(sFormat);
//        logger.info("Сортировка массива");

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Укажите размер массива: ");
        int n = iScanner.nextInt();

        int[] array = new int[n];

        System.out.println("Заполните массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = iScanner.nextInt();
        }
        iScanner.close();

        System.out.print("Наш массив до сортировки: ");
        System.out.println(Arrays.toString(array));
        System.out.println(" ");

        //Сортируем массив
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j +1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    //logger.addHandler(fh);
                    //SimpleFormatter sFormat = new SimpleFormatter();
                    fh.setFormatter(sFormat);
                    logger.info("Начало итерации");
                    logger.info("Число " + array[j] + " переместилось на позицию числа " + array[j + 1]);
                    logger.info("Число " + array[j + 1] + " переместилось на позицию числа " + array[j]);
                    logger.info("Конец итерации");
                }
            }
        }

        System.out.print("Наш массив после сортировки: ");
        System.out.println(Arrays.toString(array));
    }
}