import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        String S = sc.nextLine();
        int X = (int)Double.parseDouble(S);
        double Y = X;
        System.out.println(S);
        System.out.println(X);
        System.out.println(Y);
    }
}
