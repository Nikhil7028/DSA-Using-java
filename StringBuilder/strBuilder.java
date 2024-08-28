package StringBuilder;
/*
 *  string builder and it's method
 */
public class strBuilder 
{
    public static void main(String[] args)
    {
        StringBuilder sb=new StringBuilder("Dell Laptop");

        // append method is used to append the string at end of string
        sb.append(" model");
        System.out.println(sb);

        // length() method used to return length of string
        System.out.println(sb.length());

        // capacity(17) return the capacity of string builder
        System.out.println(sb.capacity());

        //reverse() method is used to reverse the string
        System.out.println("reverse string=> "+ sb.reverse());
        
        //insert function used to insert string at specified index
        sb.insert(5,"_");
        System.out.println("insert function : "+sb);

        //




    }
    
}
