package TwoDArrays;

public class MultiplicationArr 
{
    public static void main(String[] args)
    {
        // int [][] a={{3,4},{2,1}};
        // int [][] b={{1,5},{3,7}};
        int [][] a={{1,2,1},
                    {2,1,2}};

        int [][] b={{1,0,1,2},
                    {2,1,0,0},
                    {0,3,1,1}};

        int [][] res=new int[a.length][b[0].length];
+
        for(int i=0;i<res.length;i++)
        {
            
            for(int j=0;j<res[0].length;j++)
            {
                int sum=0;
                for(int k=0;k<b.length;k++)
                {
                 int mul=a[i][k]*b[k][j];
                 sum+=mul;
                }
             res[i][j]=sum;
            }
            
        }
        for (int[] is : res) {
            for(int ele : is)
                System.out.print(ele+" ");
            System.out.println();
        }
    }
}

