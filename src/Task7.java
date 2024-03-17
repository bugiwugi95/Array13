import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) throws IOException {
        //Есть 2 файла по 5 строк в каждом. Сохраните их в 2 массива.
        // Создайте третий массив из 10 строк, скопируйте в него строки из первых двух массивов.
        String myFile = "file1";
        InputStream stream = Files.newInputStream(Paths.get(myFile));
        Scanner sc = new Scanner(stream);
        String[] arr = new String[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
            System.out.println(arr[i]);
        }
        System.out.print("Array1: ");
        System.out.println(Arrays.toString(arr));
        String myFile2 = "file2";
        InputStream stream2 = Files.newInputStream(Paths.get(myFile2));
        Scanner sc2 = new Scanner(stream2);
        String[] arr2 = new String[5];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc2.next();
            System.out.println(arr2[i]);
        }
        System.out.print("Array2: ");
        System.out.println(Arrays.toString(arr2));
        int sizeArr1to2 = arr.length + arr2.length;
        String[] arr3 = new String[sizeArr1to2];
        for (int i = 0; i < arr.length; i++) {
            arr3[i] = arr[i];
            for (int j = 0; j < arr2.length; j++) {
                arr3[arr.length + j] = arr2[j];
            }
        }
        System.out.println("3 массив: ");
        System.out.println(Arrays.toString(arr3));


    }


}
