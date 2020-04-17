import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int l = sc.nextInt();
        int[] myArr = new int[l];

        for(int i = 0; i < myArr.length; i++){
            System.out.print("Введите элемент массива " + (i+1) + ":");
            myArr[i] = sc.nextInt();
        }
        System.out.println("Значения элементов массива, умноженных на 2:");

        for(int i = 0; i < myArr.length; i++){
            System.out.println("Элемент массива " + (i+1) + ": " + myArr[i]*2);
        }
    }
}