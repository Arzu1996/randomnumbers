package homework.hw2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) {
        char[][] area = new char[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                area[i][j] = '-';
            }
        }
        Random random = new Random();
        int row = random.nextInt(5);
        int column = random.nextInt(5);
        System.out.println("All set. Get ready to rumble!");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter row number (1-5):");
        while (true) {
            if (!input.hasNextInt()) {
                System.out.println("The input is not an integer");
                input.next();
            }
            int selectedRow = input.nextInt();
            while (true) {
                if (selectedRow < 0 || selectedRow > 5) {
                    System.out.println(" Entered number isn't in the range of playing field lines (1-5).");
                    System.out.println("Enter row number (1-5):");
                    selectedRow = input.nextInt();
                } else {
                    break;
                }
            }

            System.out.println("Enter column number (1-5):");
            int selectedColumn ;
            while (true) {
                if (!input.hasNextInt()) {
                    System.out.println("The input is not an integer");
                    input.next();
                }
                selectedColumn = input.nextInt();

                if (selectedColumn < 0 || selectedColumn > 5) {
                    System.out.println(" Entered number isn't in the range of playing field lines (1-5).");
                    System.out.println("Enter column number (1-5):");
                } else {
                    break;
                }
            }

            if (row == selectedRow - 1 && column == selectedColumn - 1) {
                System.out.println("You have won!");
                area[row][column] = 'X';
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print(area[i][j]);
                    }
                    System.out.println();
                }
                break;
            } else {
                System.out.println("You have missed the target!");
                area[selectedRow - 1][selectedColumn - 1] = '*';
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print(area[i][j]);
                    }
                    System.out.println();

                }
                System.out.println("Enter row number (1-5):");
            }

        }
    }
}



