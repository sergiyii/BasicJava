import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String textWithoutSp = text.replaceAll(" ", "");
        System.out.println(textWithoutSp);
    }
}