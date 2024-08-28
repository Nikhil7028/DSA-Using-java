package Recusion;

import java.util.Scanner;

//Ques: print sum from 1 to n
public class sum1toN {
    public static int print(int num){
        if (num==0) return 0;

        return num+print(num-1);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("Sum is : "+ print(num));
        sc.close();
    }
    
}
