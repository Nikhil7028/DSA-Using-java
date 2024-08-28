package StringBuilder;
// Determine if string are isomophic
// e.g. s=egg t=add  output: true
//  e.g., s=fee t=bar  output: false
public class Isomorphic 
{
    public static boolean check(String s, String t, char[] arr)
    {

        if (s.length() != t.length() ) return false;

        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            int index=ch-97;
            if(arr[index] =='\0')
            {
                arr[index]=t.charAt(i);
            }
            else if(arr[index] != t.charAt(i)) 
                return false;           
        }

        //make array null
        for (int i = 0; i < arr.length; i++) 
            arr[i]='\0';

        // swap the value
        String temp=s;
        s=t;
        t=temp;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            int index=ch-97;
            if(arr[index] =='\0')
            {
                arr[index]=t.charAt(i);
            }
            else if(arr[index] != t.charAt(i)) 
                return false;           
        }

        return true;
    }
    public static void main(String[] args) {
        // String s="egg";
        // String t="add";

        String s="race";
        String t="mood";


        // String s="title";
        // String t="paper";
        char[] arr=new char[26]; 

        boolean flag=check(s, t, arr);
        if (flag) 
            System.out.println("String are isomorphic");
        else
            System.out.println("given strings are not isomorphic");

        // for(int i=0;i<s.length();i++)
        // {
        //     char ele=s.charAt(i);
        //     int x=ele-97;   //5
        //     if (arr[x] == '\0')
        //     {
        //         arr[x]=t.charAt(i);
        //     }
        // }
        // // char[] arr=new char[26];
        // for (char c : arr) {
        //     System.out.println("_"+c+"_");
        // } 

    }
    
}
