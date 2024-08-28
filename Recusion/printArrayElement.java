package Recusion;

public class printArrayElement {
    public static void print(int len,int[] arr){
        if (len<0)  return;
        print(len-1, arr);
        System.out.print(arr[len]+" ");
        
    }
    public static void print2(int i,int[] arr){
        if (i==arr.length)  return;
        System.out.print(arr[i]+" ");
        print2(i+1, arr);
        
    }
    public static void main(String[] args) {
        int[] arr={10,50,80,7,05,06,0,5,04,52,35,3,56,35};
        print(arr.length-1,arr);
        System.out.println();
        print2(0, arr);
    }
    
}
