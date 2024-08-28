package TwoDArrays;

import java.util.Scanner;

// WAP to print the transpose of matrix entered by user and store it in new 
// array
public class TransposeMatrix {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter number of rows: ");   
        // int r=sc.nextInt();
        // System.out.print("Enter number of columns: ");   
        // int c=sc.nextInt();
        int [][] arr={{1,2,3},{4,5,6}};
        int r=2,c=3;

        // int[][] arr=new int[r][c];
        // for(int i=0;i<r;i++)
        // {
        //     for(int j=0;j<c;j++)
        //     {
        //         arr[i][j]=sc.nextInt();
        //     }
        // }
        // sc.close();

        int[][] res=new int[c][r];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                res[j][i]=arr[i][j];
            }
        }

        for (int[] is : res) {
            for (int ele : is) {
                System.out.print(ele+" ");
                
            }
            System.out.println();
            
        }
    }
}
