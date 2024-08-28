package StringBuilder;
/*
 * reverse the character array
 */
public class ReverseCharArray {
    public static void main(String[] args) {
        char ch[]={'N','i','k','h','i','l'};

        int i=0,j=ch.length-1;
        while (i<j) 
        {
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;    
            i++;
            j--;        
        }
        for(char ele:ch)
        {
            System.out.print(ele);
        }
    }
    
}
