/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movies;

import bridges.base.SLelement;
import bridges.connect.Bridges;
import bridges.validation.RateLimitException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author dawso
 */
public class Movies {

    /**
     * @param args the command line arguments
     */
       
    public static String getName(String str)
    {
        Scanner name = new Scanner(str);
        return name.next();
   }
    
    public static String getMovie(String s)
    {
        Scanner movie = new Scanner(s);
        String answer = "";
        while(movie.hasNext())
        {
            answer = movie.next();
        }
        return answer;
    }
    
    public static void main(String[] args) throws IOException, RateLimitException {
      /*
        Bridges bridges = new Bridges(0, "DDemien", "769929726938");
        
        SLList list = new SLList();
        
        Actor a1 = new Actor("Jonny Depp");
        Actor a2 = new Actor("Hugh Jackman");
        Actor a3 = new Actor("Orlando Bloom");
        
        a1.setMovie("Pirates of the Caribean");
        a2.setMovie("The Greatest Showman");
        a3.setMovie("The Hobbit");
        
        SLelement<Actor> act1 = new SLelement(a1.getMovie() , a1);
        SLelement<Actor> act2 = new SLelement(a2.getMovie() , a2);
        SLelement<Actor> act3 = new SLelement(a3.getMovie() , a3);
        
        act1.setLabel(a1.getActor() + " : " + a1.getMovie());
        act2.setLabel(a2.getActor() + " : " + a2.getMovie());
        act3.setLabel(a3.getActor() + " : " + a3.getMovie());
        
        act1.getVisualizer().setColor("green");
        act2.getVisualizer().setColor("green");
        act3.getVisualizer().setColor("green");
   
        list.getHead().setNext(act1);
        act1.setNext(act2);
        act2.setNext(act3);
        act3.setNext(list.getTail());
        
        SLelement<Actor> mov1 = new SLelement();
        
        bridges.setDataStructure(list.getHead());
        bridges.visualize();
        */
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Bridges bridges = new Bridges(0, "DDemien", "769929726938");
        FileReader actors = new FileReader("C:\\Users\\dawso\\Desktop\\Code\\Actors.txt");
        BufferedReader br = new BufferedReader(actors);
        
        String str = br.readLine();
        System.out.print(str + "\n");
        
        
        String name = getName(str);
        System.out.println(name);
        String movie = getMovie(str);
        System.out.println(movie);
        // make another method for second part of string
        // make a while loop for each actor and in each while loop add the movies they are in with "getMovie" method to a String variable that is specific to them.
        //make string1 equal to name when the file has a control break
        
        
        String m1 = "";
        SLList realActors = new SLList();
        while(str != null)
        {
            System.out.println(str); 
            String str1 = "";
            str1 += br.readLine();
            /*
            if(getName(str).equals(getName(str1)))
            {
                m1 += getMovie(str1);
                Actor a = new Actor(getName(str));
                a.setMovie(getName(m1));
             
                SLelement<Actor> act1 = new SLelement(m1 , a);
                realActors.getHead().setNext(act1);
                
                if(!getName(str).equals(getName(str1)))
                {
                    str = br.readLine();
                    str1 += br.readLine();
                    m1 = "";
                    
                }
                break;
            }
*/
        }
        bridges.setDataStructure(realActors.getHead());
        bridges.visualize();
        
        
    }
    
}
        
    

