package StringBuilder;

import java.util.Arrays;

public class sortString 
{
    public static void main(String[] args) {
        String str="agbfcjte";
        char ch[]= str.toCharArray(); // convert to char array
        Arrays.sort(ch);            // sort the char array
        for (char c : ch) {
            System.out.print(c);
            
        }
        

    }
    
}
