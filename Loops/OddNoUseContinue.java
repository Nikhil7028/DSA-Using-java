package Loops;

// Print the odd number from 1 to 100 ::: using continue keyword

public class OddNoUseContinue
{
    public static void main(String[] args)
    {
        for(int i=0;i<=100;i++)
        {
            if (i%2==0) continue;
            System.out.print(i+" ");
        }

        
    }
    
}
