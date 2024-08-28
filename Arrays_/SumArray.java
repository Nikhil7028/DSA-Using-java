package Arrays_;
// calculate the sum of array

public class SumArray
{
    public static void main(String[] args)
    {
        int[] arr={81,17,45,36,31,100,60};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("sum of array "+sum);
    }
}
