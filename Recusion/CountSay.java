package Recusion;
// Count and say 3332221   => 133211
public class CountSay {
    public static String csay(int i, int j, String s, String ans){
        if (j==s.length()) {
            ans+=(j-i)+""+s.charAt(i);
            return ans;            
        }
        if (s.charAt(i) ==s.charAt(j)) {
            return csay(i, j+1, s, ans);            
        }
        else{
            ans+=(j-i)+""+s.charAt(i);
            i=j;
            return csay(i, j+1, s, ans);   
        }

    }
    public static void main(String[] args) {
        String s="3334+2221";

        String result = csay(0, 0, s, "");
        System.out.println(result);
        
    }
    
}
