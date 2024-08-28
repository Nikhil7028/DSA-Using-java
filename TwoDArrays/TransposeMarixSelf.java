package TwoDArrays;
/*
 * Write a program to change the given matrix with its transpose without 
 * using extra array (only possible if matrix are square) [leetcode 867]
 *  1,2,3
 *  4,5,6
 *  7,8,9
 */
public class TransposeMarixSelf {
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
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        print(arr);

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<=i;j++)      // condition is j<=i so it traverse onlyy triangle
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        
        print(arr);
        
    }
}
