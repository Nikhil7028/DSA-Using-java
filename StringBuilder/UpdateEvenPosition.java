package StringBuilder;
/*
 * Input a string and update all the even position in string
 */

public class UpdateEvenPosition {
    public static void main(String[] args) {
        String str="i am Nikhil choudhari";
        String update="";
        for (int i = 0; i < str.length(); i++) 
        {
            if(i%2 ==0)
            {
                update+="a";               
            }            
            else
            {
                update+=str.charAt(i);
            }
        }
        System.out.println(update);
    }
    
}
