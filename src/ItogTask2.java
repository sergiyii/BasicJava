import java.util.Scanner;

public class ItogTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int ln = sc.nextInt();
        int[] arr = new int[ln];
        System.out.println("Заполните массив:");


        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите элемент " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, (arr.length-1));
        System.out.print("Отсортированный массив:");
        for (int i: arr) {
            System.out.print("  " +i);
        }
    }
    //Быстрая сортировка
    public static void quickSort(int[] source, int lBorder, int rBorder) {
        int lMarker = lBorder;
        int rMarker = rBorder;
        int pivot = source[(lMarker + rMarker) / 2];
        do {
            while (source[lMarker] < pivot) {
                lMarker++;
            }
            while (source[rMarker] > pivot) {
                rMarker--;
            }
            if (lMarker <= rMarker) {
                if (lMarker < rMarker) {
                    int tmp = source[lMarker];
                    source[lMarker] = source[rMarker];
                    source[rMarker] = tmp;
                }
                lMarker++;
                rMarker--;
            }
        } while (lMarker <= rMarker);

        if (lMarker < rBorder) {
            quickSort(source, lMarker, rBorder);
        }
        if (lBorder < rMarker) {
            quickSort(source, lBorder, rMarker);
        }
    }


}


