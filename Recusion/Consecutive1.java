package Recusion;

import java.util.Scanner;

public class Consecutive1 {
    public static void print(int n,String ans){
        if(ans.length()==n){
            System.out.println(ans);
            return;
        }
        int m=ans.length();
        if(m==0 || ans.charAt(m-1)=='0'){
            print(n, ans+0);
            print(n, ans+1);
        }
        else
        print(n, ans+0);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n=sc.nextInt();
        sc.close();
        print(n,"");
    }
    
}
