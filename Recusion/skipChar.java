package Recusion;
// skip a character using recursion
public class skipChar {
    public static String skip(String str, String ans,int i){
        if(str.length()==i) return ans;
        if (str.charAt(i)!='i') 
            ans=ans+str.charAt(i);
        skip(str, ans, i+1);
        return "";
    }
    public static void main(String[] args) {
        String str="Nikhil is a good boy i like him";
        System.out.println("Aft a skipping char string look like"+skip(str,"",0));

    }
    
}
