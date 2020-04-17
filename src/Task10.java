import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество столбцов матрицы:");
        int x = sc.nextInt();
        System.out.println("Введите количество строк матрицы:");
        int y = sc.nextInt();

        int[][] myArr = new int[y][x];
        for(int i = 0; i < y; i++){
            for(int k = 0; k < x; k++){
                System.out.print("Введите элемент массива [" + (i+1) + "][" + (k+1) + "]: ");
                myArr[i][k] = sc.nextInt();
            }

        }
        System.out.println("Значения элементов первой строки матрицы, умноженные на 3:");
        for(int k = 0; k < x; k++){
            System.out.println("Элемент матрицы [1][" + (k+1) + "]: " + (myArr[0][k] * 3));
        }
    }
}