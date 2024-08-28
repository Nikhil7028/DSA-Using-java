package Arrays_;

// Given a a array of marks of students. if the marks of any student is less than 35 print it's
// roll Number [roll number refer to the index of array]

public class RollNumber 
{
    public static void main(String[] args)
    {
        int[] marks={81,17,45,36,31,100,60,12};
        
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]<35)
                System.out.println("Roll no : "+i);
                         
        }
    }
    
}
