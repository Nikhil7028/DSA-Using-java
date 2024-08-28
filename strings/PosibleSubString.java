package strings;
// Print all the possible substring of given string

public class PosibleSubString {
    public static void main(String[] args) {
        String str="Nikhil";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                System.out.print(str.substring(i, j)+" ");
                
            }
            System.out.println();
            
        }
    }
    
}
