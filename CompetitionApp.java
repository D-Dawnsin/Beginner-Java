/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitionapp;

/**
 *
 * @author dawso
 */
public class CompetitionApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final int TEAMSIZE = 4;
        Competition ca1 = new Competition("World Series" , "Cubs" , "Dodgers" , 2017);
        Competition ca2 = new Competition("Super Bowl" , "Bears" , "Packers" , 2033);
        System.out.println(ca1);
        System.out.print("\n");
        System.out.println(ca2);
        System.out.print("\n");
        
        
        String Team1[]= new String[TEAMSIZE];
        for(int i = 0 ; i<TEAMSIZE ; i++)
        {
            Team1[i] = "member " + i;
        }
         
        String Team2[] = new String[TEAMSIZE];
        for(int n = 0 ; n<TEAMSIZE ; n++)
        {
            Team2[n] = "member " + n;
        }
        
        
        Team t1 = new Team("Bears" , Team1 , ca1 , ca2);
        Team t2 = new Team("Cubs" , Team2 , ca1 , ca2);
        
        System.out.println(t1);
        System.out.print("\n");
        System.out.println(t2);
        
        
       Competition Default1 = new Competition();
       Team Default2 = new Team();
       
       System.out.print(Default1);
       System.out.println(Default2);
       
       String Name = ca1.getComp(); //getting name of Competition (Example of using Accessor)
       
       t1.nameofTeam("Ballers");//Example of using Mutator to change info
       
       System.out.print(t1);
    }
    
}
