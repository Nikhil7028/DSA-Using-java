
public class inverseCount02 {    
    static int count=0;
    public static void inverseCount(int[] a, int[] b) {
        int i=0, j=0;
        while (i<a.length && j<b.length) {
            if (a[i]>b[j]) {
                count+=a.length-i;
                j++;                
            }
            else{
                i++;
            }
            
        }

        
    }
    public static void merage(int[] a, int[] b, int[] arr) {
        int i=0,j=0,k=0;
    
        while (i< a.length && j<b.length) {
        if (a[i]<b[j]) 
            arr[k++]=a[i++];
        else
            arr[k++]=b[j++];
        }

        while (i<a.length) 
            arr[k++]=a[i++];      

        while (j<b.length) 
            arr[k++]=b[j++];
    }
    public static void merageSort(int[] x) {
        int len=x.length;
        if (len==1)  return;
        int []a=new int[len/2];
        int []b=new int[len-(len/2)];

        for (int i = 0; i < a.length; i++) {
            a[i]=x[i];            
        }
        for (int i = 0; i < b.length; i++) {
            b[i]=x[i+(len/2)];            
        }
        merageSort(a);
        merageSort(b);
        inverseCount(a,b);
        merage(a,b,x);
    }
    public static void main(String[] args) {
        int[] arr={8,2,5,3,1,4};
        
        merageSort(arr);
        System.out.println(count);

    }
    
}
