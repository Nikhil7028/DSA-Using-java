package Recusion;

import java.util.Scanner;

// ques: calculate factorial of number using recusion
public class Factorial {
    public static int fact(int num){
        if(num<=0) return 0;
        if (num==1) return 1;
        return num*fact(num-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("Factorial: "+fact(num));
        sc.close();
    }
    
}
