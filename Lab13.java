/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

/**
 *
 * @author ddemien
 */
import java.util.Random;
import java.util.Scanner;
public class Lab13 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
       Random randomObj = new Random();
       int randomNum = randomObj.nextInt(11);
       System.out.println(randomNum);
       Scanner answer=new Scanner(System.in);
       System.out.println("Would you like to play (Yes or No): ");
       String ans=answer.next();
       String anns = ans.toLowerCase();
       System.out.println(anns);
       int total=0;
       int host=0;
       int hand=0;
       int extra=0;
       int extra2=0;
       
       if (anns.equals("yes"))
       {
         while (total<4)
         {
            Random card = new Random();
            int card1 = card.nextInt(11);
            System.out.println(card1);
            
            if (total<=1)
                host+=card1;
            else
                hand+=card1;
            total++;
          }
         
         if (host<15)
            {
                while (extra<1)
                {
                    Random ext = new Random();
                    int card2 = ext.nextInt(11);
                    System.out.println(card2+" extra");
                    host+=card2;
                    extra++;
                }
            }
         
          if (host==21)
          {
              System.out.print("The host wins!! Their hand was 21! "+host);
              System.exit(0);
          }
              
         
          if (host>22)
            {
                System.out.println("Player wins because the Host busted! "+host);
                System.exit(0);
            }
          
          System.out.println(host);
          System.out.println(hand);
          
          System.out.println("break");
          if (host!=21)
          {
          System.out.println(" Your hand is "+hand);
          Scanner answer2=new Scanner(System.in);
          System.out.println(" Would you like to draw another card? (Yes or No): ");
          String ans2=answer2.next();
          String anns2 = ans2.toLowerCase();
          System.out.println(anns2);
          if (anns2.equals("yes"))
          {
             while (extra2<1)
             {
                 Random ext2 = new Random();
                 int card3 = ext2.nextInt(11);
                 System.out.println(card3+" extra for hand");
                 hand+=card3;
                 extra2++;
             }
          }
          
          if (hand==21)
          {
                 System.out.print(" You win!! You got 21!! "+hand);
                 System.exit(0);
          }  
          if (hand>22)
          {
                 System.out.println(" Game over!! \n Your hand was "+hand );
                 System.exit(0);
          }
          System.out.print(" Your hand is "+hand );
          
          if (hand>host)
          {
              System.out.println(" You win!! Your hand was better than the hosts'! "+host+" :Host"+"\n"+hand+" :Hand");
          }
          
         else if (hand<host)
          {
              System.out.println(" The host wins!! His hand was better than yours! "+host+" :Host"+"\n"+hand+" :Hand");
          } else {
          }
          }
          else
          {
               if (hand>host)
                {
                    System.out.println(" You win!! Your hand was better than the hosts'! "+host+" :Host"+"\n"+hand+" :Hand");
                }
          
               else if (host>hand)
                {
                    System.out.println(" The host wins!! His hand was better than yours! "+host+" :Host"+"\n"+hand+" :Hand");
                }
          }
       }
       else
         System.out.println("Thanks for the interest. ");    
    }
    
}