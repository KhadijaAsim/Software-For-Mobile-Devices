/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smd.assignment.pkg1;

public class AllRounder extends CricketPlayer implements BowlerInterface, BatsmanInterface{

    String name;
    int age;
    final int age_limit = 18;
    final String type = "AllRounder";
    
    public AllRounder(String n, int a) {
        super(n, a);
         if(CheckEligibility(a))
        {
        name = n;
        age = a;
        }
         else
            throw new UnsupportedOperationException("This AllRounder falls under Under Eighteen category|"); //To change body of generated methods, choose Tools | Templates.
   
    }
    
    @Override
    public void OutOrNotOut(int x) {
        if (x==0)
        {
            System.out.print( "AllRounder " + name + " is" + " Out");
        System.out.print("\n");
        }
        else if (x==1)
        {
            System.out.print( "AllRounder " + name + " is" + " Not Out");
        System.out.print("\n");
        }
        else
        {
        throw new UnsupportedOperationException("Not a valid input"); //To change body of generated methods, choose Tools | Templates.
        }
    }

    @Override
    public void Playing() 
    {
        System.out.print( "AllRounder " + name + " is" + " Playing");
        System.out.print("\n");
        
    }

    @Override
    public final void Bowling() 
    {
        System.out.print( "AllRounder " + name + " is" + " Bowling");
        System.out.print("\n");
       
    }

    @Override
    public final void Batting()
    {
        System.out.print( "AllRounder " + name + " is" + " Batting");
        System.out.print("\n");
       
    }
    
    public static boolean CheckEligibility(int a)
    {
        if (a < 18)
        {
            return false;
        }
        return true;
    }
    
    
    public class AllRounder_Additional_Info
    {
        
        int best_score;
        int average_wickets;
        int average_score;
        String Nationality;
        int average_rating;
        int total_matches_played;
        

        public void Show_All_Description()
        {
          
         System.out.print("\n");
         
        
        System.out.print( "Player Type: " + type);
        System.out.print("\n"); 
            
        System.out.print( "Name: " + name);
        System.out.print("\n");
        
        System.out.print( "Age: " + age);
        System.out.print("\n");
        
        
        System.out.print( "Nationality: " + Nationality);
        System.out.print("\n");
       
        
        System.out.print( "Total Matches Played: " + total_matches_played);
        System.out.print("\n");
        
        System.out.print( "Best Score: " + best_score);
        System.out.print("\n");
        
        System.out.print( "Average Wickets: " + average_wickets);
        System.out.print("\n");
        
        System.out.print( "Average Score: " + average_score);
        System.out.print("\n");
        
        System.out.print( "Average Rating: " + average_rating);
        System.out.print("\n");
        }
        
        public AllRounder_Additional_Info(int best_score, int average_score, int average_wickets, int average_rating, int total_matches_played, String Nationality) {
            this.best_score = best_score;
            this.average_wickets = average_wickets;
            this.average_score = average_score;
            this.average_rating = average_rating;
            this.total_matches_played = total_matches_played;
            this.Nationality = Nationality;
        }

        public int getBest_score() {
            return best_score;
        }

        public void setBest_score(int best_score) {
            this.best_score = best_score;
        }

        public int getAverage_wickets() {
            return average_wickets;
        }

        public void setAverage_wickets(int average_wickets) {
            this.average_wickets = average_wickets;
        }
        
        
        public int getAverage_score() {
            return average_score;
        }

        public void setAverage_score(int average_score) {
            this.average_score = average_score;
        }
        

        public int getAverage_rating() {
            return average_rating;
        }

        public void setAverage_rating(int average_rating) {
            this.average_rating = average_rating;
        }

        public int getTotal_matches_played() {
            return total_matches_played;
        }

        public void setTotal_matches_played(int total_matches_played) {
            this.total_matches_played = total_matches_played;
        }    
    }
    
    public static class UnderEighteen_AllRounder extends CricketPlayer implements BowlerInterface, BatsmanInterface
    {
      
        public UnderEighteen_AllRounder(String n, int a) 
        {
            
            super(n, a);
            if (!CheckEligibility(a))
            {
            name = n;
            age = a;
            }
            
            else 
                 throw new UnsupportedOperationException("Age is over eighteen"); //To change body of generated methods, choose Tools | Templates.
    
        }

        @Override
    public void OutOrNotOut(int x) {
        if (x==0)
        {
            System.out.print( "AllRounder " + name + " is" + " Out");
        System.out.print("\n");
        }
        else if (x==1)
        {
            System.out.print( "AllRounder " + name + " is" + " Not Out");
        System.out.print("\n");
        }
        else
        {
        throw new UnsupportedOperationException("Not a valid input"); //To change body of generated methods, choose Tools | Templates.
        }
    }
        @Override
        public void Playing() {          
        System.out.print( "Under Eighteen AllRounder " + name + " is" + " Playing");
        System.out.print("\n");
        }

        @Override
        public final void Bowling() {
            System.out.print( "Under Eighteen AllRounder " + name + " is" + " Bowling");
        System.out.print("\n");
        }

        @Override
        public final void Batting() {
            
        System.out.print( "Under Eighteen AllRounder " + name + " is" + " Batting");
        System.out.print("\n");
        }

    }
    
    
}
