package TwoDArrays;
// WAP to print matrix in waves form 
// 1-2-3|
// |4-5-6-
// -7-8-9
// output : 1 2 3  6 5 4  7 8 9

public class WavesFormMaatrix 
{
    public static void main(String[] args) 
    {
        int[][] arr= {{ 1, 2, 3, 4},
        { 5, 6, 7, 8},
        { 9, 10, 11, 12},
        {13, 14, 15, 16},
        {17, 18, 19, 20}};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
            
        }
        System.out.println("----- Waves form ------");
        
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<arr[0].length;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else
            {
                for(int j=arr[0].length-1;j>=0;j--)
                {
                    System.out.print(arr[i][j]+" ");
                }

            }
            System.out.print(" ");
        }
        
    }
    
}
