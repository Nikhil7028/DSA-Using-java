package Arrays_;

import java.util.*;
public class arraylist
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<3;i++)
        {
            // n=sc.nextInt()
            al.add(sc.nextInt());

        }
        al.add(20);
        al.add(30);
        al.add(40);
        Collections.sort(al);

        System.out.println(al);

        // for (Integer i : al)

        // {
        //     System.out.print(i+" "); 
        // }
        
        // al.sort(null);
    //it will return the 2nd element, because index starts from 0  
    
    System.out.println("Returning element: "+al.get(1));
    }        
}
