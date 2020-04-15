import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для вывода таблицы умножения:");
        int ch = sc.nextInt();
        System.out.printf("%d * 1 = %d \n", ch, ch*1);
        System.out.printf("%d * 2 = %d \n", ch, ch*2);
        System.out.printf("%d * 3 = %d \n", ch, ch*3);
        System.out.printf("%d * 4 = %d \n", ch, ch*4);
        System.out.printf("%d * 5 = %d \n", ch, ch*5);
        System.out.printf("%d * 6 = %d \n", ch, ch*6);
        System.out.printf("%d * 7 = %d \n", ch, ch*7);
        System.out.printf("%d * 8 = %d \n", ch, ch*8);
        System.out.printf("%d * 9 = %d \n", ch, ch*9);
        System.out.printf("%d * 10 = %d \n", ch, ch*10);
    }
}
