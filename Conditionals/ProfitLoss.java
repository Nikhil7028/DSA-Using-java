package Conditionals;

import java.util.Scanner;

// If cost price and selling price of an item is input through the keyboard, write a program to determine 
// whether the seller has made profit or incurred loss or no profit no loss. Also 
// Determine how much profit he made or loss he incurred
public class ProfitLoss 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter cost and selling price of item : ");        
        short cp=sc.nextShort();
        short sp=sc.nextShort();
        if(cp>sp)
            System.out.println("Loss : "+(cp-sp));
        else if (sp>cp)
            System.out.println("Profit : "+(sp-cp));
        else
            System.out.println("NO profit No loss");
        sc.close();
    }
    
}
