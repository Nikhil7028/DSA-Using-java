package Recusion;

import java.util.Scanner;
//
class StairPath {
    public static int path(int n){
        if (n==1) return 1;
        if (n==2) return 2;
        return path(n-1)+path(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total stair : ");    
        int n=sc.nextInt();
        System.out.println("path "+path(n));
        sc.close();

    }
}
