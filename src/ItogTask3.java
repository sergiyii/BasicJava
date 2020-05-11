import java.util.Scanner;

public class ItogTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите курс доллара: ");
        double kurs = sc.nextDouble();
        System.out.print("Введите количество рублей: ");
        double rub = sc.nextDouble();
        double dol = (double)Math.round(rub / kurs * 100) / 100;

        System.out.printf("Итого: %.2f", dol);
    }
}
