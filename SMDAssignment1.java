/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smd.assignment.pkg1;

import smd.assignment.pkg1.Bowler.UnderEighteen_Bowler;

/**
 *
 * @author Machine
 */
public class SMDAssignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try
        {
        Bowler Bowler1 = new Bowler("Ali", 18);
        Bowler1.GetDetails();
        Bowler1.Playing();
        Bowler1.Bowling();
        Bowler1.OutOrNotOut(1);
        
        
        Batsman Batsman1 = new Batsman("Omer", 19);
        Batsman1.GetDetails();
        Batsman1.Playing();
        Batsman1.Batting();
        Batsman1.OutOrNotOut(0);
        
        
        AllRounder AllRounder1 = new AllRounder ("Neha", 19);
        AllRounder1.GetDetails();
        AllRounder1.Playing();
        AllRounder1.Batting();
        AllRounder1.Bowling();
        AllRounder1.OutOrNotOut(1);
        
        
        
        
        Bowler.UnderEighteen_Bowler UnderEighteenBowler1 = new Bowler.UnderEighteen_Bowler("Abdullah", 17);
        UnderEighteenBowler1.GetDetails();
        UnderEighteenBowler1.Playing();
        UnderEighteenBowler1.Bowling();
        UnderEighteenBowler1.OutOrNotOut(0);
        
        
        Batsman.UnderEighteen_Batsman UnderEighteenBatsman1 = new Batsman.UnderEighteen_Batsman("Amna", 17);
        UnderEighteenBatsman1.GetDetails();
        UnderEighteenBatsman1.Playing();
        UnderEighteenBatsman1.Batting();
        UnderEighteenBatsman1.OutOrNotOut(0);
        
        
        AllRounder.UnderEighteen_AllRounder UnderEighteenAllRounder1 = new AllRounder.UnderEighteen_AllRounder("Muizz", 17);
        UnderEighteenAllRounder1.GetDetails();
        UnderEighteenAllRounder1.Playing();
        UnderEighteenAllRounder1.Batting();
        UnderEighteenAllRounder1.Bowling();
        UnderEighteenAllRounder1.OutOrNotOut(0);
        
        
        
        
        
        Bowler.Bowler_Additional_Info  Bowler1_Additional_Info = Bowler1.new Bowler_Additional_Info(1,2,3,4, "Pakistani");     
        Bowler1_Additional_Info.Show_All_Description();
        
        
        Batsman.Batsman_Additional_Info  Batsman1_Additional_Info = Batsman1.new Batsman_Additional_Info(1,2,3,4, "Indian");     
        Batsman1_Additional_Info.Show_All_Description();
        
        
        AllRounder.AllRounder_Additional_Info  AllRounder1_Additional_Info = AllRounder1.new AllRounder_Additional_Info(1,2,6,3,4, "Pakistani");     
        AllRounder1_Additional_Info.Show_All_Description();
        }
        
        catch(Exception e)
        {
           System.out.print( e.getMessage());
            
        }
       
    }
    
}
