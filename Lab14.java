/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author dawso
 */
public class Lab14 {

    public static void main(final String[] args)
    {
        int playerScore=0;
        int playerTotal=0;
        int compScore=0;
        int compTotal=0;
        int dice;
        boolean gameover=false;
        boolean turnOver=false;
        char repeat;
        String input;
        final Scanner keyboard=new Scanner(System.in);
        final Random rand=new Random();
        
        System.out.println("Wlecome to the game of pig \n");
        
        while (gameover==false)
        {
            do
            {
                dice=rand.nextInt(6)+1;
                System.out.println("You rolled a "+dice);
                if (dice==1)
                {
                    playerScore=0;
                    System.out.println("You lose your turn");
                    System.out.println("Your total is "+ playerTotal);
                    turnOver=true;
                    while (playerTotal < 100);
                }
                else
                {
                    playerScore+=dice;
                    System.out.println("Your turn score is "+playerScore);
                    System.out.println("If you hold you will have "+playerScore+" points");
                    System.out.println("Enter 'r' to roll again and 'h' to hold");
                    input=keyboard.nextLine();
                    repeat=input.charAt(0);
                    
                    if (repeat == 'h')
                        break;
                }
            }
            while(turnOver==false || dice!=1);
            playerTotal+=playerScore;
            System.out.println("Your score is "+playerTotal);
            playerScore=0;
            if (playerTotal>=100)
            {
                System.out.println("You Win!!!");
                gameover=true;
                while (playerTotal >= 100) [b];
            }
            System.out.println();
            System.out.println("It is the computer's turn");
            do
            {
                dice=rand.nextInt(6)+1;
                System.out.println("The computer rolled "+dice);
                if (dice==1)
                {
                    compScore=0;
                    System.out.println("The computer lost their turn");
                    System.out.println("The computer's total is "+compTotal);
                    turnOver=true;
                    while (compTotal < 100);
                }
                else
                {
                    compScore+=dice;
                    if (compScore >=20 || (compScore + compTotal) >=100)
                    {
                        System.out.println("The computer holds");
                        turnOver=true;
                    }   
                }
            }
            while(dice!=1 || compScore<20);
            
            compTotal+=compScore;
            System.out.println("The computer's score is "+compTotal+"\n");
            compScore=0;
            if (compTotal>=100)
            {
                System.out.println("The computer wins! *_* ");
                gameover=true;
                while (compTotal >= 100);
            }
            if (keyboard!=null)
                keyboard.close();
        }
    }
    
}
