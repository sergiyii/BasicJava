import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку 1:");
        String str1 = sc.nextLine();
        System.out.println("Введите строку 2:");
        String str2 = sc.nextLine();

        if(str1.length() == str2.length()){
            System.out.println("Длина строк равна.");
        } else if(str1.length() > str2.length()){
            System.out.println("Строка с наибольшей длиной: " + str1);
        } else {
            System.out.println("Строка с наибольшей длиной: " + str2);
        }
    }
}
