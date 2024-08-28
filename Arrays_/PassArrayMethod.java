package Arrays_;

//Passing array to method

public class PassArrayMethod 
{
    static void fun(int[] a)
    {
        a[0]=11;
//**Note:**  When we pass array to method it will be 
// pass by reference
    }

    public static void main(String[] args)
    {
        int []arr={10,20,30,40,50};
        fun(arr);
        for (int i : arr) 
        {
            System.out.print(i+" ");
            
        }
    }
    
}
