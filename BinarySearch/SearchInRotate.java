// package BinarySearch;
/*
 * NOT solved 
 */
// import java.util.Arrays;


// /*
//  * Search an element in rotated array
//  */

// public class SearchInRotate {
//     public static int BinarySea(int[] arr,int key,int low,int high )
//     {
//         while (low<=high) {
//             int mid=(low+high)/2;
//             if (arr[mid]==key) 
//                 return mid;
//             else if(arr[mid]<key)
//                 low=mid+1;
//             else
//                 high=mid-1;                
//         }
//         return -1;

//     }
//     public static int rotSearch(int[] arr,int key){
//         // int low=1, high=arr.length-2;
//         // int pivt=-1;

//         // // pivote element present or not
//         // while (low<=high) {
//         //     int mid=(low+high)/2;
//         //     if (arr[mid]==key)
//         //         return mid;
//         //     else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1])
//         //         low=mid+1;
//         //     else if(arr[mid]<arr[mid-1] && arr[mid] <arr[mid+1]){
//         //         pivt=mid-1;
//         //         break;
//         //     }
//         //     else if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {
//         //         pivt=mid;
//         //         break;
//         //     } 
//         //     else {
//         //         high=mid-1;
//         //     }
            
//         // }
//         // System.out.println("Pivate: "+pivt);
//         // if (pivt != -1) { // ratated array
//         //     low=0;high=pivt;
//         //     // for left sorted array
//         //     int idx=BinarySea(arr,key,low,high);
//         //     if (idx == -1) {
//         //         //for right sorted array
//         //     low=pivt+1;high=arr.length-1;
//         //     idx=BinarySea(arr, key, low, high);
//         //     return idx; 
//         //     }
//         //     else
//         //         return idx;   
//         // }
//         // else
//         //     return BinarySea(arr, key, low=0, high=arr.length-1);
            
//         Arrays.sort(arr);
//         for (int i : arr) {
//             System.out.print(i+" ");
            
//         }
//         return BinarySea(arr,key,0,arr.length-1);
    
//     }
    
//     public static void main(String[] args) {
//         //        0 1 hi 3 4 5 6 7
//     //    int[] arr={4,5,6,7,8,9,0,1,2,3};
        


//     //    int key=6;
//         // int key=5; 
//         // int key=3; 

//         // int[] arr={1};
//         // int key=1;

//         int[] arr={3,1};
//         int key=1;
        
//         int pos= rotSearch(arr, key);
//         System.out.println("The position of element in array "+pos);
        





//     }         
// }