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
public class Team {
    
    private final int TEAMSIZE=4;
    private String nameofTeam;
    private String[] members;
    private Competition c1;
    private Competition c2;
    
    //////////////////////////////////////////////////////////////////////////////////////////Constructors
    public Team (String nt , String[] nm , Competition comp1 , Competition comp2)
    {
        nameofTeam = nt;
        members = new String[TEAMSIZE];
        for (int n=0 ; n<TEAMSIZE ; n++)
        {
            members[n] = nm[n];
        }
        c1 = comp1;
        c2 = comp2;
    }
    
    public Team()
    {
        nameofTeam = "Valpo";
        members = new String[TEAMSIZE];
        for (int n=0 ; n<TEAMSIZE ; n++)
        {
            members[n] = "Memebr " + n;
        }
        c1 = new Competition(); //is new because you need "new" whenever not a basic variable type (instantiate) 
        c2 = new Competition();
    }
    //////////////////////////////////////////////////////////////////////////////////////////Constructors
    
    //////////////////////////////////////////////////////////////////////////////////////////Accessors
    public String getnameofTeam()
    {//is not void because accessing in order to use it in main
        return nameofTeam;
    }
    
    public String[] getMembers()
    {
        return members;
    }
    
    public Competition getComp1()
    {
        return c1;
    }
    
    public Competition getComp2()
    {
        return c2;
    }
    //////////////////////////////////////////////////////////////////////////////////////////Accessors
    
    //////////////////////////////////////////////////////////////////////////////////////////Mutators
    public void nameofTeam(String team)
    {//is a void because user is just changing an existing object and doesn't need it for main method 
        nameofTeam=team;
    }
    
    public void members(String[] mem)
    {
        members = new String[TEAMSIZE];
        for (int n=0 ; n<TEAMSIZE ; n++)
        {
            members[n] = mem[n];
        }  
    }
    
    public void  c1(Competition comp1)
    {
        c1=comp1;
    }
    
    public void  c2(Competition comp2)
    {
        c2=comp2;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////Mutators
    
    public String toString()
    {
        String memberList= " ";
        for(int i=0 ; i<TEAMSIZE ; i++)
        {
            memberList += "\n" + members[i];
        }
        return "Team Name : " + nameofTeam  + memberList + "\n" + c1.toString() + "\n" + c2.toString();
    }
    
}
