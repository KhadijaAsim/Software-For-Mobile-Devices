/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smd.assignment.pkg1;

/**
 *
 * @author Machine
 */
public abstract class CricketPlayer
{
    String name;
    int age;
    
    CricketPlayer(String n, int a)
    {
        name = n;
        age = a;
    }
    
    public abstract void Playing();                        // abstract method
    public abstract void OutOrNotOut(int x);               //abstract method
    public void GetDetails()                               //non abstract method
    {
        System.out.print("\n");
        System.out.print("Player Details:");
        System.out.print("\n");
        System.out.print("Name: " + name );
        System.out.print("\n");
        System.out.print("Age: " + age );
        System.out.print("\n");
    }
    
}
