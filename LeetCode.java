// public class LeetCode {

//     public static void rotate(int nums[]){
//         int arr[] =new int[nums.length];
//         int k=3;
//         int j=3;
//         for(int i=0;i<nums.length;i++){
//             if (k>0) {
//                 arr[i]=nums[nums.length -k];
//                 k--;
//             }
//             else{
//                 arr[i]=nums[i-j];
//             }
//         }

//         for(int i=0;i<arr.length;i++){
//             nums[i]=arr[i];
//             System.out.print( nums[i] + " ");
//         }
//}

   
        
//     // public void rotate(int[] nums, int k) {
//     //     int n = nums.length;
//     //     k=k%n;
//     //     int arr[]=new int[n];
//     //     for(int i=0;i<n;i++){
//     //         arr[(i+k)%n] =nums[i];
//     //     }
//     //     for(int i=0;i<n;i++){
//     //         nums[i]=arr[i];
//     //     }
//     // }
//     public static void main(String[] args) {
//         int nums[]={1,2,3,4,5,6,7};
//         rotate(nums);
//         rotate(nums);
        
//     }
// }


//---->Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// import java.util.*;
// public class LeetCode {
//     public static void moveZero(int nums[]){
//         int arr[]=new int[nums.length];
//         int j=0;
//         for(int i=0;i<nums.length;i++){
//             if (nums[i]!=0) {
//                 arr[j]=nums[i];
//                 j++;
//             }
//         }
//         for(int i=0;i<arr.length;i++){
//             nums[i]=arr[i];
//         }

//     }

//     public static void main(String[] args) {
//         int nums[]={0,1,0,3,12};
//         moveZero(nums);
//         for(int i=0;i<nums.length;i++){
//             System.out.print(nums[i] + " ");
//         }
//     }
// }