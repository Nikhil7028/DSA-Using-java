package Conditionals;
/*
 * Write a program to create a calculator that perform basic arithmatic operations
 * (add, sum, mul, div) using switch case. The calculator should input two numbers and operator from user. 
 */

import java.util.Scanner;

public class CalculatorSwitch
{
   // public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number operation number format: ");
        float num1=sc.nextFloat();
        char operation=sc.next().charAt(0);
        float num2=sc.nextFloat();

        switch (operation) {
            case '+':
                System.out.println("Addition : "+(num1+num2));
                break;
            case '-':
                System.out.println("Subtraction : "+(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication : "+(num1*num2));
                break;
            case '/':
                System.out.println("Division : "+(num1/num2));
                break;
            case '%':
                System.out.println("Reminder : "+(num1%num2));
                break;        
            default:
                System.out.println("Invalid operation");
                break;
        }


     sc.close();   
    }

    
    public static void main(String[] args) {
        int a = 10, b = 5, c = 8;
        if (a <= b) 
        {
          if (a <= c)
          {
            System.out.println(a);
          } else {
            System.out.println(c);
            }

        } else {
             if (b <= c)
            {
                System.out.println(b);
            } else {
                        System.out.println(c);
                    }

          }
    }
    
}
