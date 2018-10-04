import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[]args){




        Scanner keyboard;
        int pickednumber;
        int guessednumber;
        int maxattempt = 10;
        int attempt = 1;
        boolean correct;

        pickednumber = (int)(Math.random()*100);
        keyboard = new Scanner(System.in);
        correct = false;


        //System.out.println(pickednumber);
        System.out.println("start guessing a number, you have 10 tries or you die.");
        //guessednumber = keyboard.nextInt();

        while(!correct&&attempt<=maxattempt) {
            System.out.println("you shall guess again");
            guessednumber = keyboard.nextInt();
            attempt++;
            if (guessednumber < pickednumber) {
                System.out.println("your number is too low");

            } else if (guessednumber > pickednumber) {
                System.out.println("your number is too high");

            } else if (guessednumber == pickednumber) {
                System.out.println("you are correct");
                System.out.println("GAME OVER");

                correct = true;
                break;
            }




        }

        System.out.println("outside of while loop");











    }

}
