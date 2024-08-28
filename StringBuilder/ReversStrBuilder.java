package StringBuilder;
/*
 * take input a stringbuilder and reverse it without using built in method
 */
public class ReversStrBuilder 
{
    public static void main(String[] args) 
    {
        StringBuilder sb=new StringBuilder("Nikhil Choudhari");

        int i=0,j=sb.length()-1;
        while (i<j) 
        {
            char temp=sb.charAt(i);
            char temp2=sb.charAt(j);
            
            sb.setCharAt(i, temp2);
            
            sb.setCharAt(j, temp);
            // ch[j]=temp;    
            i++;
            j--;
        }
        System.out.println(sb);
        System.out.println(sb.reverse());  // reverse the string

                        
    }
    
}
