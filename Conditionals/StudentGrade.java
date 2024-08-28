package Conditionals;

import java.util.Scanner;

// Take input percentage of a student and 
// print the grade according to marks
// 81-100 Very Good
// 61-80 Good
// 41-60 Average
// <=40 Fail

public class StudentGrade
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter mark of student : ");
        float marks=sc.nextFloat();

        if(marks>=81 && marks<=100)
            System.out.println("Very Good : "+marks);
        else if(marks>=61 && marks<=80)
            System.out.println("Good : "+marks);
        else if(marks>=41 && marks<=60)
            System.out.println("Average : "+marks);
        else if(marks>=0 && marks <=40)
            System.out.println("Fail");
        else
            System.out.println("Invalid marks");
        sc.close();
    }
    
}
