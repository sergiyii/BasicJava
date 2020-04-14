import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите двоичное число:");
        String s = scan.nextLine();
        try {
            int bin = Integer.parseInt(s, 2);
            System.out.println(bin);
        } catch (NumberFormatException ex) {
            System.out.println("Некорректный формат!");
            ex.printStackTrace();
        }
    }
}
