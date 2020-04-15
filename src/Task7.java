import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        final int X = 15;
        final int Y = 18;
        final int Z = 20;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение для переменной number:");
        int number = 0;
        if (sc.hasNextInt()) {
            number = sc.nextInt();
        }

        switch (number) {
            case X:
            case Y:
            case Z:
                System.out.println("Данное значение имеется в константах");
                break;
            default:
                System.out.println("Такой константы нет!");
                break;
        }
    }
}
