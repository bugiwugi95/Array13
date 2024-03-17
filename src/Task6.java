
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //Пользователь вводит буквы. Пока не введёт букву ‘ю’, сохраняйте буквы в массив char(пусть в нем будет 100 элементов максимум).
        //  Потом создайте новый массив char размером столько, сколько букв ввел пользователь.
        // Скопируйте в него буквы из первого массива
        Scanner sc = new Scanner(System.in);
        char save = ' ';
        char[] arr = new char[100];
        for (int i = 0; i < arr.length; i++) {
            if (save != 'ю') {
                save = sc.next().charAt(0);
                arr[i] = save;
                System.out.println(arr[i] + " = " + i);
            }

        }


        char[] arr2 = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        System.out.println("Новый массив:");
        for (char ch : arr2) {
            System.out.print(ch + " ");
        }


    }


}
