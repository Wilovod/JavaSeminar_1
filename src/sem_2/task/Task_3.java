package sem_2.task;

import java.io.FileWriter;
import java.io.IOException;

//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST
// и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
public class Task_3 {
    private static String creatTestString(String argument){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append(argument);
        }
        return sb.toString();
    }
    public static void Write(String argument){
        String str = creatTestString(argument);
        try (FileWriter in = new FileWriter("test.txt")){
            in.append(str);
            System.out.println("Recorded");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

//Можно свернуть метод: return String.valueOf(argument).repeat(100);