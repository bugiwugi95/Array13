import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        //Сохраните 10 строк в массив, выведите с конца каждую вторую
        String[] arr = new String[]{"Зенит", "Питер", "Москва", "Самара", "Крылья", "Россия", "США", "Java", "Kotlin", "Android"};
        for (int i = arr.length - 1; i >= 0; i = i - 2) {
            System.out.println(arr[i]);
        }


    }

//В файле 10 дробных чисел. Считайте в массив, выведите те, что больше числа пи
}
