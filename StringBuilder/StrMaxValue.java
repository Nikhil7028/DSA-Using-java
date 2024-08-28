package StringBuilder;
/*
 * Given n string consisting of digit from 0 to 9
 * return the string which has maximum value
 */
public class StrMaxValue {
    public  static String purify(String s){
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) !='0')
             return s.substring(i);

        }
        return s;


    }

    public static void main(String[] args) {
        String str[] ={"0000005642102", "45245423", "56444"};
        int mx=0;
        String mxStr="";

        for (int i = 0; i < str.length; i++) {
           String s= purify(str[i]);
            if(mx<s.length())
            {
                mx=s.length();
                mxStr=s;
            }
        }

        System.out.println("The String with Maximum Value is : "+mxStr);

        

    }

}
