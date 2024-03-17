import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Пользователь вводит 10 чисел, сохраните их в массив
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            int save = sc.nextInt();
            arr[i] = save;


        }
        System.out.println(Arrays.toString(arr));
    }
}