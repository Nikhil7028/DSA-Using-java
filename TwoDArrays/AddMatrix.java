package TwoDArrays;
//Program to add two matrices
public class AddMatrix
{
    public static void main(String[] args)
    {
        int[][] num1={ {1,9,2},
                      {3,7,4},
                      {8,5,6}
                    };

        int[][] num2={ {9,3,7},
                      {8,6,5},
                      {2,4,1}
                    };
        int size=num1.length;

        int[][] res=new int[size][size];

        for (int i = 0; i < num1.length; i++) 
        {
            for (int j = 0; j < num1[0].length; j++) 
            {
                res[i][j]=num1[i][j]+num2[i][j];               
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
