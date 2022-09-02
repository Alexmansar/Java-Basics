import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AreaShooting {
    public static void main(String[] args) {
        Random random = new Random();
        int row = random.nextInt(5);
        int col = random.nextInt(5);
        System.out.println("Enter the coordinates");
        boolean continueGuess = true;
        Scanner scanner = new Scanner(System.in);
        String[][] field = new String[5][5];
        for (int i = 0; i < field.length; i++) {
            Arrays.fill(field[i], "-");
        }
        int count = 0;
        while (continueGuess) {
            count++;
            int rowGuess = scanner.nextInt() - 1;
            int colGuess = scanner.nextInt() - 1;
            if (row == rowGuess && colGuess == col) {
                System.out.println("Congratulation, you have won!!");
                field[rowGuess][colGuess] = "X";
                continueGuess = false;
            } else {
                System.out.println("Try again");
                field[rowGuess][colGuess] = "*";
            }
            System.out.println("__|_1_|_2_|_3_|_4_|_5_|");
            for (int i = 0; i < field.length; i++) {
                System.out.print((i + 1) + " | ");
                for (int j = 0; j < field.length; j++) {
                    System.out.print(field[i][j] + " | ");
                }
                System.out.println();
            }
        }
        System.out.println(count);
    }
}