package TwoDArrays;
import java.util.Scanner;
// video-98: Program to store roll number and marks obtain by student 
// in 2D array
public class RollMarks 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of student : ");
        int n=sc.nextInt();
        int [][] rec=new int[n][2];
        
        System.out.println("enter student roll number and marks in format");
        for (int i = 0; i < rec.length; i++)
        {
            for(int j=0;j<2;j++)
            {
                rec[i][j]=sc.nextInt();                
            }            
        }
        System.out.println("student roll number and marks:");

        for (int[] is : rec) 
        {
            for (int ele : is)
            {
                System.out.print(ele+" ");
                
            }
            System.out.println();            
        }
    }
    
}
