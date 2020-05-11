import java.util.Scanner;

public class ItogTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите двоичное число: ");
        String str = new String(sc.nextLine()).trim();
        int znDec = 0;
        int mn = 1;

        for (int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) == '1'){
                znDec = znDec + mn;
            }
            mn = mn * 2;
        }
        System.out.println(str + " = " + znDec);
    }
}
