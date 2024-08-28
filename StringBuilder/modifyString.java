package StringBuilder;

// String is imutable we can't change it::
class modifyString
{
    public static void main(String[] args) 
    {
        String str="Nikhil";
        
        str=str.substring(0,5)+"_XYZABCDEF_"+str.substring(5);
        System.out.println(str);
    }

}

/* this is wrong way to chane the string
 * we can't change individual character in string. We can but we will waste lot 
 * of time and space
 */