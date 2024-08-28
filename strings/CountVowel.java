package strings;
//Ques: Counting ovwel in the string
public class CountVowel 
{
    public static void main(String[] args) {
        String str="Nikhil is a student";
        int i=0, count=0;
        while (i<str.length()) {
            char ch= str.charAt(i);
            if((ch=='a'  || ch=='e') || (ch=='i' || ch=='o'  || ch=='u'))
            {
                count++;
            }
         i++;    
        }
        System.out.print("Total number of ovwel is : "+count);

    }
    
}
