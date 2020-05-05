import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Признак конца ввода - строка 'стоп' ");

        try (FileWriter writer = new FileWriter("file.txt")) {
            do {
                System.out.print(": ");
                str = sc.nextLine();
                if(str.compareTo("стоп") == 0) break;
                str = str + "\r\n";
                writer.write(str);
            } while(str.compareTo("стоп") != 0);
        } catch (IOException ex) {
            System.out.println("Ошибка ввода-вывода: " + ex);
        }
    }
}
