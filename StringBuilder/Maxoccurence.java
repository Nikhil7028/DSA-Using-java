package StringBuilder;
// Given a string consisting of lowercase english alphabets . print the character that is 
// occuring most number of times
public class Maxoccurence {
    public static void main(String[] args) {
        String str="kjhsfsfoifnnnnnwreufnjknsdiuweirewurbkjksaz";
        int[] alph =new int[26];
        
        for (int i=0;i<str.length(); i++)
        {
            int ntch=str.charAt(i);
            ntch=ntch-97;
            alph[ntch]++;
        }
        int mx=0, position=0;
        for (int i = 0; i < alph.length; i++) {
            if(mx<alph[i])
            {
                mx=alph[i];
                position=i;
            }
        } 
        System.out.println(mx);
        position=position+97;

        char ch=(char)position;
        System.out.println("character that is occuring most number of times "+ch);


    }
    
}
