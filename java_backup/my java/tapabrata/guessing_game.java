import java.util.Random;
import java.util.Scanner;
class guessing_game
{public static void main(String[] args)
{Random rand=new Random();
int numberToGuess=rand.nextInt(100);
int numberofTries=0;
Scanner input=new Scanner(System.in);
int guess;
boolean win=false;
while(win==false)
{System.out.println("Guess a number between 1 and 100 ");
guess=input.nextInt();
if(guess==numberToGuess)
{win=true;
System.out.println("Bulls eye.You have got it right. ");
}

else if(guess<(numberToGuess))
System.out.println("Your guess is  low ");

else if(guess>(numberToGuess))
System.out.println("Your guess is  high");

numberofTries++;
if(numberofTries>4)
break;
}
System.out.println("The number was " +numberToGuess);
}
}