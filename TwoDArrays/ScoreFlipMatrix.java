package TwoDArrays;

public class ScoreFlipMatrix 
{
    public static void print(int [][] m)
    {
        for (int[] is : m) {
            for (int ele : is) {
                System.out.print(ele+" ");
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        int [][] matrix={{0,0,1,1},
                         {1,0,1,0},
                         {1,1,0,0}};
        print(matrix);
        System.out.println("----------------------");
        // for(int i=0;i<matrix[0].length;i++)    //col
        // {
        //     for(int j=0; j<matrix.length; j++)   //row
        //     {
        //         if(matrix[i][j]==0)
        //         {
        //             for(int k=0;k<matrix[0].length; k++)
        //             {
        //                 if(matrix[j][k]==0)
        //                     matrix[j][k]=1;
        //                 else
        //                     matrix[j][k]=0;
        //             }
        //         }
        //     }
        // }
        
/***********For column flip**********/
        for (int j = 0; j < 1; j++)   // j=col
        {
            for (int i = 0; i < matrix.length; i++) {   //i=row
                if(matrix[i][j] ==0)
                {
                    for (int k = 0; k < matrix[0].length; k++) {
                        if(matrix[i][k] ==0)
                            matrix[i][k] =1;
                        else
                            matrix[i][k] =0;

                    }
                }
            }            
        }
        
      /***********For row flip**********/
     for (int i = 0; i < 1; i++)   // j=col
     {
      for (int j = 0; j < matrix[i].length; j++)
       {   //i=row
        if(matrix[i][j] ==0)
         {
            for (int k = 0; k < matrix.length; k++) {
                if(matrix[k][j]==0)
                    matrix[k][j]=1;
                else
                    matrix[k][j]=0;             // if(matrix[i][k] ==0)
                                //     matrix[i][k] =1;
                                // else
                                //     matrix[i][k] =0;

            }
        }
      }            
     }


        print(matrix);

        // calculate score
        int score=0,x=1;
        // System.out.println("matrix.length-1 "+(matrix[0].length));
        for (int j =matrix[0].length-1 ; j >=0 ; j--) {   // col
           for (int i = 0; i < matrix.length; i++)   //row
           {
            score+=(matrix[i][j]*x);
           }
           x=x*2;
            
        }
        System.out.println("Score is "+score);


        
        
    }
    
}
