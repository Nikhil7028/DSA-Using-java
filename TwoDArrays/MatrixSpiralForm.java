package TwoDArrays;
// matrix spiral form in
// 1-2-3|
// -4-5 6|
// |7-8-9-

public class MatrixSpiralForm 
{
    public static void main(String[] args) 
    {
        int[][] matrix={{10,20,30,40,50},
                        {60,70,80,90,11},
                        {22,33,44,55,66},
                        {77,88,99,21,22},
                        {23,24,25,26,27},
                        {28,29,30,34,35}};

        int minR=0,maxR=matrix.length-1,minC=0,maxC=matrix[0].length-1;

        do
        {
            // b=blue
            // System.out.println(" maxc="+maxC+" minc="+minC+" minr="+minR);
            for(int b=minC;b<=maxC;b++)
            {
                System.out.print(matrix[minR][b]+" ");
            }
            minR++;
            System.out.print(" _ ");

            // o= organe 
            for(int o=minR;o<=maxR;o++)
            {
                System.out.print(matrix[o][maxC]+" ");
            }
            maxC--;
            System.out.print(" _ ");

            // r=red
            for(int r=maxC ;r>=minC;r--)
            {
                System.out.print(matrix[maxR][r]+" ");
            }
            maxR--;
            System.out.print(" _ ");

            // g=green
            for(int g=maxR ;g>=minR;g--)
            {
                System.out.print(matrix[g][minC]+" ");
            }
            minC++;
            // System.out.println(" minimum column "+minC);
            System.out.print(" _ ");

        }
        while(minR <= maxR &&  minC <= maxC);

        

                
    }
    
}
