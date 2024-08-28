package strings;
// create user define indexOf() method in java
public class Userindex
{
    public static int indexOf( String str,char ch)
    {
        int i=0;
        while (i<str.length())
        {
            if(ch == str.charAt(i) )
            {
                return i;
            }
         i++;    
        }
        return -1;

    }
    public static void main(String[] args) 
    {
        // Predefine indeOf(ch)
        String str="Nikhil is a mca student at zeal institute";
        char ch='o';
        // System.out.println("character ai index ",str.indexOf(ch));
        
        System.out.println("character ai index "+indexOf(str,ch));

        
    }
    
}
