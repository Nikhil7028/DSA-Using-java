package StringBuilder;

import java.util.*;

// Given ttwo string s and t, return true if t is an angram of s otherwise false
// e.g., s=anagram, t=nagaram

public class Anagram 
{
    public static boolean check(char sch[], char tch[])
    {
        if(sch.length != tch.length) return false;
        for (int i = 0; i < tch.length; i++) 
        {
            if(sch[i] != tch[i])
            return false;            
        }
        return true;

    }
    public static void main(String[] args) {
        String s="anagram", t="nagaram";
        char sch[]= s.toCharArray();
        char tch[]= t.toCharArray();
        Arrays.sort(sch);
        Arrays.sort(tch);
        
        if(check(sch,tch))
        {
            System.out.println("Given string is anagram");

        }
        else{
            System.out.println("Given string is NOT anagram");

        }
    }
    
}
