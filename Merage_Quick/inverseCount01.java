
// Inverse count by using bute force method  using simple method
public class inverseCount01 {
    public static void invercount(int[] arr) {
        int count=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]) {
                    count++;                    
                }
            }
            
        }
        System.out.println(count);
        
    }
    public static void main(String[] args) {
        int[] arr={8,2,5,3,1,4,0};
        
        invercount(arr);
    }
    
}
