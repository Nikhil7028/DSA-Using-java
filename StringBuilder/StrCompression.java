package StringBuilder;
/*
 * leet code 443: String compression
 * INPUT: aaabbbccff 
 * OUTPUT: a3b3c2f2 
 */

public class StrCompression {
    public static void main(String[] args) {
        String s = "aaabbbccff";
        String ans = "";
        int i = 0, j = 0;
        while (j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            } else {
                ans += s.charAt(i);
                if (j - i > 1) {
                    ans += (j - i);
                }
                i = j;
            }
        }
        ans += s.charAt(i); // Append the last character
        if (j - i > 1) {
            ans += (j - i);
        }
        System.out.println(ans);
    }
}
