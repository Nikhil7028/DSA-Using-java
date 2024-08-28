package StringBuilder;

import java.util.Scanner;

/*
 * 
 * input a string and toggle all the characters of it.
 * (replace small with capital case and )
 */


public class ToggleChar {

    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter a string : ");
        StringBuilder  sb = new StringBuilder(sc.next());
        
        for (int i = 0; i < sb.length(); i++) 
        {
            char ch= sb.charAt(i);
            if(sb.charAt(i) >64 && sb.charAt(i) <91)
            {
                
                ch+=32;
                sb.setCharAt(i, ch);
            }
            else if(sb.charAt(i) >96 && sb.charAt(i) <123)
            {
                // char ch= sb.charAt(i);
                ch=(char) (ch-32);
                sb.setCharAt(i, ch);
            }
                        
        }
        System.out.println(sb);
        sc.close();
    }
    
}
