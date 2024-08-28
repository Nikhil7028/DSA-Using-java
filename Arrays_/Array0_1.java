package Arrays_;

import java.util.Arrays;

// java.util.*;
public class Array0_1 
{
    public static void main(String[] args)
    {
        int a[]={1,0,0,1,1,1,0,1,0}; 
        // Arrays.sort(a);

        int i=0,j=a.length-1;
        while(j>i)
        {
            if (a[i] > a[j])
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;                                
            }
            i++;
            j--;           
        }

        for (int in : a)
        {
            System.out.print(in+" ");
        }

    }  
}
