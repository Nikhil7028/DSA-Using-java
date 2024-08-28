package Arrays_;

import java.util.Scanner;
// rotate array using extra array
public class RotateArray
{
    public static void main(String[] args)
    {
        int[] a={10,20,30,40,50,60,70};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rotation : ");
        int num=sc.nextInt();
        num=num%a.length;
        // System.out.println(" hi "+num);
        int j=a.length -1,i=0;               //   j=6   i=0
        int[] dami=new int[num];
        for( ;j>(a.length-num+1);j--)            //
        {
            dami[i]=a[j];
            i++;
        }

        for(int k=0;k<dami.length;k++)
        {
            a[k]=dami[k];
        }

        for (int k : a) {
            System.out.print(k+" ");
            
        }


        sc.close();        
    }
    
}
