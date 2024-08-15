import java.util.*;
public class Main {
    public static void guessNumber(){
        Scanner sc=new Scanner(System.in);
        int number= 1 + (int)(100*Math.random());
        int guess,k=5,i;
        int score = 10;
        int rem=4;
        for(i=0;i<k;i++){
            System.out.println("Enter your Guess: ");
            guess=sc.nextInt();
            if(guess==number){
                System.out.println("Congratulations you Guessed the Number");
                System.out.println("You're Score "+score);
                break;
            }
            else if(guess>number && i!=k - 1 ){
                System.out.println("Your guess is higher");

                System.out.println("Remaining guess "+rem);
                rem=rem- 1;
                score=score - 2;
            }
            else if(guess<number && i != k - 1){
                System.out.println("Your guess is Lower");
                System.out.println("Remaining guess "+rem);
                rem=rem- 1;
                score=score - 2;
            }
        }
        if(i==k){
            System.out.println("You're exhausted");
            System.out.println("The random number is "+number);
            System.out.println("The Score is 0");
        }
    }
    public static void main(String[]args){
        System.out.println("Number Guessing Game");
        System.out.println("Instructions: You have only 5 attempts to guess the Number");
        guessNumber();

    }

}