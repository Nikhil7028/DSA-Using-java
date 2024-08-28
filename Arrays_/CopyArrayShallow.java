package Arrays_;

public class CopyArrayShallow
{
    public static void main(String[] args)
    {
        int []a={10,20,30,40,50,60,70,80,90};
        
        System.out.println("Original array");
        for (int i : a)
        {
            System.out.print(i+" ");            
        }
        System.out.println();
        
        System.out.println("Copy array");

        //Shallow copy will copy other array but as reference
        int num[]=a;      
        num[1]=456;
        for (int i : num)
        {
            System.out.print(i+" ");            
        }
        System.out.println("Original array");
        for (int i : a)
        {
            System.out.print(i+" ");            
        }
        
    }
    
}
