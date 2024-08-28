package Arrays_;

//Array with deep copy
public class CopyArrayDeep
{
    public static void main(String[] args)
    {
        int []a={10,20,30,40,50,60,70,80,90};

        int[] num=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            num[i]=a[i];
        }

        num[1]=55555;

        System.out.println("copy array");
        for (int i : num)
        {
            System.out.print(i+" ");            
        }
        System.out.println();
        

        System.out.println("Original array");
        for (int i : a)
        {
            System.out.print(i+" ");            
        }
        System.out.println();

        
    }
    
}
