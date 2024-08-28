package Recusion;
// calculate the way in Maze path using recursion

import java.util.Scanner;

public class MazePath {
    public static int ways(int row, int col, int m, int n){
        if (row==m || col==n)   return 1;
        int rightway=ways(row, col+1, m, n);
        int downway=ways(row+1, col, m, n);
        return rightway+downway;
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the maize size m X n: ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        sc.close();
        System.out.println("Numbers of ways: "+ways(1,1,m,n));

        
        
    }
    
}
