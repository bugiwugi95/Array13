import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws IOException {
        //В файле 10 дробных чисел. Считайте в массив, выведите те, что больше числа пи
        String myFile = "arrayDouble";
        InputStream stream = Files.newInputStream(Paths.get(myFile));
        Scanner sc = new Scanner(stream);
        String[] arr = new String[10];
        System.out.println("Считание массива: ");
        for (int i = 0; i < arr.length; i++) {
            double strToDouble = Double.parseDouble(sc.next());
            arr[i] = String.valueOf(strToDouble);

            if (strToDouble > Math.PI) {
                System.out.println("Те что больше числа Пи: ");
                System.out.println(arr[i]);
            }
        }


    }


}
