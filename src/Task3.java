import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Сохраните 10 чисел в массив, выведите их с конца
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            int save = sc.nextInt();
            arr[i] = save;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(" " + arr[i] + ",");
        }


    }
}