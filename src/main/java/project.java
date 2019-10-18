import java.util.Random;
import java.util.Scanner;



public class project {

    public static void main(String[] args){



        
        System.out.println("Enter your name");
 Scanner inputname = new Scanner(System.in); 
 String name;
 name = inputname.nextLine();
        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;
 System.out.println("Let the game begin!");
        while (win == false){  

           
            guess = input.nextInt();

            if (guess == number){
                win = true; 
            }

            else if(guess < number){
                System.out.println("Your number is too small. Please, try again.");
                
            }

            else if(guess > number){
                System.out.println("Your number is too big. Please, try again.");
                
            }

        }

        System.out.println("Congratulations," + name + "!");

    }
}
