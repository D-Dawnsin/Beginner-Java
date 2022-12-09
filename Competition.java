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
public class Competition {
    
    private String nameofCompetition;
    private String nameofwinningTeam;
    private String nameofRunnerup;
    private int year;
    
    //////////////////////////////////////////////////////////////////////////////////////////Constructors
    public Competition (String nameComp, String nameofTeam, String nameofRunner, int y)
    {
       nameofCompetition = nameComp;
       nameofwinningTeam = nameofTeam;
       nameofRunnerup = nameofRunner;
       year = y;
    }
    
    public Competition()
    {
        nameofCompetition = "E-Sports";
        nameofwinningTeam = "Valp";
        nameofRunnerup = "IU";
        year = 2019;
    }
    //////////////////////////////////////////////////////////////////////////////////////////Constructors
    
    //////////////////////////////////////////////////////////////////////////////////////////Accessors
    public String getComp()
    { //is not void because accessing in order to use it in main
        return nameofCompetition;
    }
    
    public String getwinTeam()
    {
        return nameofwinningTeam;
    }
    
    public String runnerUp()
    {
        return nameofRunnerup;
    }
    //////////////////////////////////////////////////////////////////////////////////////////Accessors
    
    //////////////////////////////////////////////////////////////////////////////////////////Mutators
    public void nameofCompetition(String name)
    {//is a void because user is just changing an existing object and doesn't need it for main method 
        nameofCompetition=name;
    }
    
    public void nameofwinningTeam(String team)
    {
        nameofwinningTeam=team;
    }
    
    public void nameofRunnerup(String ru)
    {
        nameofRunnerup=ru;
    }
    
    public void year(int y)
    {
        year=y;
    }
    //////////////////////////////////////////////////////////////////////////////////////////Mutators
    
    public String toString()
    {
        return nameofCompetition + ", " + year + "\nWinner: " + nameofwinningTeam + "\nRunner Up: " + nameofRunnerup;
    }
    
}
