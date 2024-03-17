import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args)  {
        //Поле чудес. Игрок один пишет слово.
        // Выводится: ##### (по количеству букв) Игрок два пытается угадать буквы.
        // Если угадал, буква открывается: #а#а#, ба#а#, ... банан
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player1 вводит слово ");
        String player1 = scanner.nextLine();
        char[] ch = new char[player1.length()];
        char player2;
        System.out.println("Угадайте слово ");
        for (int i = 0; i < player1.length(); i++) {
            ch[i] = '#';
            System.out.print(ch[i]);

        }
        System.out.println();
        int attempts = 0;
        while (Arrays.toString(ch).contains("#")) {
            player2 = scanner.next().charAt(0);
            attempts++;
            for (int i = 0; i < player1.length(); i++) {
                if (player1.charAt(i) == player2) {
                    ch[i] = player2;
                }
            }
            System.out.println(ch);
        }
        System.out.println("Вы угадали слово за " + attempts + " опыток");


    }


}
