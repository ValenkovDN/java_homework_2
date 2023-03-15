/*
Дана строка (получение через обычный текстовый файл!!!)

"фамилия":"Иванов","оценка":"5","предмет":"Математика"
"фамилия":"Петрова","оценка":"4","предмет":"Информатика"

Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

class Task_2
{
    public static void main(String[] args)
    {
        try(BufferedReader br = new BufferedReader (new FileReader("data.txt")))
        {
                String line;
                StringBuilder str = new StringBuilder();
                while((line = br.readLine()) != null){
                    for (int i = 0; i < line.length(); i++) {
                        line = line.replace(":", ",").replace("\"", "");
//                        String[] result = new String[line.length()];
//                        result = line.split(",");
//                        System.out.println(Arrays.toString(result));
                    }
                    String[] result = new String[line.length()];
                    result = line.split(",");
                    System.out.println("Студент " +  result[1] + " получил " + result[3] + " по предмету " + result[5] + ".");
                }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}