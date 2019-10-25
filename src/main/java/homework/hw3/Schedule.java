package homework.hw3;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "go to courses;go to University";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "do home work;go to University";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "go to courses;go to University";
        schedule[5][0] = "Friday";
        schedule[5][1] = "do home work;go to University";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "do home work";
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(" "+schedule[i][j]);
            }System.out.println();
        }
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Please, input the day of the week:");
            String selectedDay = input.next().toUpperCase().replaceAll("\\s+", "");

            switch (selectedDay){
            case "SUNDAY":
               System.out.printf("Your tasks for Sunday: %s\n" , schedule[0][1]);
            continue;
            case "MONDAY":
            System.out.printf("Your tasks for Monday: %s\n", schedule[1][1]);
                continue;
            case "TUESDAY":
                System.out.printf("Your tasks for Tuesday: %s\n", schedule[2][1]);
           continue;
            case "WEDNESDAY":
                System.out.printf("Your tasks for Wednesday: %s\n", schedule[3][1]);
                continue;
            case "THURSDAY":
                System.out.printf("Your tasks for Thursday: %s\n", schedule[4][1]);
                continue;
            case "FRIDAY":
                System.out.printf("Your tasks for Friday: %s\n", schedule[5][1]);
        continue;
            case "SATURDAY":
           System.out.printf("Your tasks for Saturday: %s\n", schedule[6][1]);
             continue;
            case "EXIT":
                break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
                    continue;
            }break;

        }
    }
}