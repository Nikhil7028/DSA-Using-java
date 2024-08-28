package Arrays_;

public class MerageArray 
{
    public static void main(String[] args)
    {
        int a[]={11,33,45};      //i
        int b[]={26,54};      // j
        int sumLength=a.length+b.length;

        int c[]=new int[sumLength];     //k

        int j=0,i=0,k=0;
        // for(int k=0;k<sumLength;k++)

        while (i<a.length && j< b.length) 
        // for(int k=0;k<sumLength;k++)
        {
            if ( a[i]<=b[j]  )
            {
                c[k]=a[i];
                // if(i<a.length-1)
                i++;                                
            }  
            else 
            {
                c[k]=b[j];
                // if(j<a.length-1)
                j++;
            } 
            k++;         
        }
        System.out.println(i+" "+j+" "+k);      //  2 1 3
        while (i<a.length)
        {
            c[k]=a[i];
            k++;i++;            
        }

        while (j<b.length)
        {
            c[k]=b[j];
            k++;j++;            
        }

        for (int iterater : c) {
            System.out.print(iterater+" ");
        }
        // k++;
    }
    
}
