package LeetCode;
class Solution {
    public static int[] plusOne(int[] digits) 
    {






        int camb = 0;
        for (int ele : digits) {
            camb = camb*10 + ele;
        }

        //camb=123
        camb+=1;        //camb=124




        int dami = camb, i = 0,revarr[],rem;
        if(digits.length == 1)  revarr=new int[digits.length +1];
        else         revarr=new int[digits.length];

        while (dami != 0) {
            rem = dami % 10;
            revarr[i]=rem;
            i++;
            


        }

        return digits;

    }
}

// int lastindex=digits.length;
// lastindex--;
// for(int i=0;i<digits.length;i++)
// {
// if (i==lastindex)
// digits[i]=digits[i]+1;
// }

public class Main
{
    public static void main(String[] args)
    {;Solution.plusOne(null);
        
    }
    
}
