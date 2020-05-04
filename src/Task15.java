import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значения массива через пробел: ");
        String str = sc.nextLine();
        String[] myArrStr = str.split(" ");
        int[] myArrInt = new int[myArrStr.length];
        for (int i = 0; i < myArrStr.length; i++) {
            myArrInt[i] = Integer.parseInt(myArrStr[i]);
        }

        for (int i = myArrInt.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if (myArrInt[j] > myArrInt[j+1]) {
                    int tmp = myArrInt[j];
                    myArrInt[j] = myArrInt[j+1];
                    myArrInt[j+1] = tmp;
                }
            }
        }

        for (int i:myArrInt) {
            System.out.println(i);
        }
    }
}
