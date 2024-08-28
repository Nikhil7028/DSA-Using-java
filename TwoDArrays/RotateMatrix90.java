package TwoDArrays;

//Hint
// 1 2 3   transpose matrix     1 4 7   reverse row     7 4 1
// 4 5 6           =>           2 5 8       =>          8 5 2
// 7 8 9                        3 6 9                   9 6 3

// WAP to rotate the matrix by 90 degrees [leetcode 48]
public class RotateMatrix90 
{
    public static void print(int[][] a)
    {
        int r=a.length,c=a[0].length;
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j]+" ");
                
            }
            System.out.println();
            
        }
        System.out.println("-------");
    }
     
    public static void main(String[] args) 
    {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        print(arr);

        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j <=i; j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;                
            }
            
        }
        System.out.println("Transpose matrix: ");
        print(arr);

        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=arr.length-1;j>i;j--)
        //     {
        //         int temp=arr[i][j];
        //         arr[i][j]=arr[j][i];
        //         arr[j][i]=temp;
        //     }
        // }
        
        

        for(int i=0;i<arr.length;i++)
        {
            int a=0,b=arr.length-1;
            
            while (a<b)
            {
                int temp=arr[i][a];
                arr[i][a]=arr[i][b]; // in=je;
                arr[i][b]=temp;
                a++;b--;            
            }
        }

        System.out.println("Rotated array : ");
        print(arr);


        
    }
    
}
