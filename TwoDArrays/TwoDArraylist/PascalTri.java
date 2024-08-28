package TwoDArrays.TwoDArraylist;
// package TwoDArrays.TwoDArraylist;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// generate pascal triangle [leetcode:118]  using 2D arraylist
// 1
// 11
// 121
// 1331
// 14641
public class PascalTri 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       

        // ArrayList <List<Integer>> al=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        
     
        System.out.print("Enter n : ");  
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        { ArrayList<Integer> al=new ArrayList<>();
            for(int j=0;j<i+1;j++)
            {
                if(j == 0 || j ==i)
                {
                    al.add(1);
                }   //k==i      //a=j
                else al.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));

            }
            ans.add(al);
        }
// Method => 01
        // for(int k=2;k<n;k++)   //row
        // {
        //     for(int a =1; a<k;a++) //col
        //     {
        //         // ans.set(k,j).add(null)
        //         ans.get(k).set(a,(ans.get(k-1).get(a-1)+ans.get(k-1).get(a)));
        //     }
        // }

        for (int i=0;i<ans.size();i++) 
        {
            for(int j=0;j<ans.get(i).size();j++)
            {
                System.out.print(ans.get(i).get(j));
            }
            System.out.println();
        }
        
        sc.close();
    }

    
}
