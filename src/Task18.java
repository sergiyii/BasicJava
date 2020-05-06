import java.io.*;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ln = 0;
        System.out.println("Введите путь к текстовому файлу (например: C:\\documents\\file.txt): ");
        String fileName = sc.nextLine();
        String str;
        //Вывод строк из файла
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while((str = reader.readLine()) != null) {
                System.out.println(str);
                ln++;
            }
        } catch (IOException ex) {
            System.out.println("Ошибка ввода-вывода: " + ex);
        }

        //Замена строк в файле
        System.out.println("Введите отредактированные строки: ");
        str = null;
        try (FileWriter writer = new FileWriter(fileName)) {
            while(ln > 0){
                System.out.print(": ");
                str = sc.nextLine();
                str = str + "\r\n";
                writer.write(str);
                ln--;
            }
        } catch (IOException ex) {
            System.out.println("Ошибка ввода-вывода: " + ex);
        }
    }
}
