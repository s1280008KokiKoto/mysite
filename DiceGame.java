import java.util.Random;
import java.util.Scanner;

class DiceGame{
    public static void main(String args[]){
        Random rand = new Random();
        System.out.println("What is your name?");

        Scanner scan = new Scanner(System.in);
 
        String str = scan.next();
        System.out.println("Hello, "+str+"!");

        System.out.println("Rolling the dice...");
        int a = rand.nextInt(5) + 1;
        int b = rand.nextInt(5) + 1;
        System.out.println("Dice1:"+a);
        System.out.println("Dice2:"+b);
        System.out.println("Total value:"+(a+b));
    }
}