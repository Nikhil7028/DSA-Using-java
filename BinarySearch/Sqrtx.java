package BinarySearch;
/*
 *  square root of given number()
 */
public class Sqrtx {
    public static void main(String[] args) {
        // int x=6513233;
// int sqrt= (int)(Math.sqrt(x)); //this is the fastest method to it uses newton rapson method
        // int x=8;
        // int x=2147395599;
        // int x=0;
        int x=2;
        int sqrt=0;

        if(x==0){ sqrt=0;
        }
        else if (x==1)  sqrt=1;
        else
        {
            int low=0, high=x;
            while (low<=high) {
                int mid=(high+low)/2;
                if (mid == x/mid) {
                    sqrt=mid;
                    break;                
                }
                else if(mid >x/mid)
                {
                    high=mid-1;
                }
                else
                    low=mid+1;
                sqrt=high;

                
            }
        }
        

        System.out.println("Square root of "+x+" is: "+sqrt);

        
    }
    
}
