import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите путь к текстовому файлу (например: C:\\documents\\file.txt): ");
        String fileName = sc.nextLine();
        String str;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while((str = reader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException ex) {
            System.out.println("Ошибка ввода-вывода: " + ex);
        }
    }
}
