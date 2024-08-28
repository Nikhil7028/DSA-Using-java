package TwoDArrays.TwoDArraylist;

import java.util.*;
public class Print2DArrayList 
{
    public static void main(String[] args) {
        // List<Integer> al=new ArrayList<>();      1D array
        List<List<Integer>> al=new ArrayList<>();      // 2 D array

        List<Integer> a=new ArrayList<>();
        a.add(4);a.add(8);a.add(7);a.add(9);
        List<Integer> b=new ArrayList<>();
        b.add(45);b.add(87);

        List<Integer> c=new ArrayList<>();
        List<Integer> x=new ArrayList<>();
        x.add(10);

        List<Integer> d=new ArrayList<>();
        d.add(12);

        al.add(a);al.add(b);al.add(c);al.add(d);     // add list into 2d list
        al.add(x);


// Way:01 : take one by one array and print it. it will print array by array
        // for (int i = 0; i < al.size(); i++)      
        // {
        //     System.out.print(al.get(i));
        //     System.out.println();
  
        // }

//  Way:02 : take one by one element and print it. it will print element by element
        for(int i=0;i<al.size();i++)
        {
            for (int j = 0; j < al.get(i).size(); j++) {
                System.out.print(al.get(i).get(j)+" ");
                
            }
            System.out.println();
        }
        
    }
    
}
