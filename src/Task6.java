import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x:");
        double x = sc.nextDouble();
        System.out.println("Введите y:");
        double y = sc.nextDouble();
        System.out.println("Введите z:");
        double z = sc.nextDouble();

        double srAr = (x + y + z) / 3;
        System.out.printf("Среднее арифметическое x, y, z: %f\n", srAr);

        int srArMod = (int)srAr / 2;
        if(srArMod > 3){
            System.out.println("Программа выполнена корректно");
        }
    }
}
