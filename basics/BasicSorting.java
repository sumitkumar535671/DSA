//---->bubble sort code ---TC[worst--O(n**2),best--O(n**2)]

// import java.util.*;

// public class BasicSorting {
    


//     public static void bubbleSort(int arr[]){
//         for(int turn = 0;turn<arr.length-1;turn++){
//             int swap=0;
//             for(int j=0;j<arr.length-1-turn;j++){
//                 if(arr[j]>arr[j+1]){
//                     //swap
//                     int temp =arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                     swap++;
//                 }
//             }System.out.println(swap);

//         }

//     }

//     public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = {-8,-4,9,-6,7};
//         bubbleSort(arr);
//         printArr(arr);
        
//     }
// }
    

//----->optimised bubble sort TC[worst--O(n**2),best--O(n)]
// import java.util.*;

// public class BasicSorting {
    


//     public static void bubbleSort(int arr[]){
//         for(int turn = 0;turn<arr.length-1;turn++){
//             boolean swap =false;
//             for(int j=0;j<arr.length-1-turn;j++){
//                 if(arr[j]>arr[j+1]){
//                     //swap
//                     int temp =arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                     swap=true;
//                 }


//             }System.out.println(swap);
//             if (swap=false) {
//                 break;
//             }

//         }

//     }

//     public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = {-8,-4,9,-6,7};
//         bubbleSort(arr);
//         printArr(arr);
        
//     }
// }


//---->Selection Sort --TC[O(n**2)]
//:-pick the smallest (from unsorted),put it at the beginning.

// import java.util.*;
// public class BasicSorting {

//     public static void selectionSort(int arr[]){
//         for(int i=0;i<arr.length-1;i++){
//             int minPos = i;
//             System.out.print(minPos);
//             for(int j = i+1;j<arr.length;j++){
//                 if(arr[minPos]>arr[j]){
//                     minPos = j;
//                 }
//             }
//             //swap
//             int temp = arr[minPos];
//             arr[minPos] = arr[i];
//             arr[i]=temp;
//         }
//     }
//         public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr[]={5,1,3,2,4};
//         selectionSort(arr);
//         printArr(arr);
       
//     }
// }



//---->Insertion Sort TC[O(n**2)]
//:-pick an element (from unsorted part) & place in the right pos in sorted part.

// import java.util.*;
// public class BasicSorting {

//     public static void insertionSort(int arr[]){
//         for(int i=1;i<arr.length;i++){
//             int curr = arr[i];
//             int prev = i-1;
//             //finding out the correct pos to insert
//             while (prev>=0 && arr[prev]>curr) {
//                 arr[prev+1] = arr[prev];
//                 prev--;
//             }
//             //insertion
//             arr[prev+1]=curr;
//         }
//     }

//      public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//         }
//     public static void main(String[] args) {
//         int arr[]={3,7,5,6,1,2,-9};
//         insertionSort(arr);
       
//         printArr(arr);
//     }
// }




// import java.util.Arrays;
// public class BasicSorting {

//     public static void insertionSort(int arr[]){
//         for(int i=0;i<arr.length-1;i++){
//             int curr = arr[i];
//             int prev = i-1;
//             //finding out the correct pos to insert
//             while (prev>=0 && arr[prev]>curr) {
//                 arr[prev+1] = arr[prev];
//                 prev--;
//             }
//             //insertion
//             arr[prev+1]=curr;
//         }
//     }

//      public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//         }
//     public static void main(String[] args) {
//         int arr[]={3,7,5,6,1,2,9};
//      //   insertionSort(arr);
//          Arrays.sort(arr,0,6);
//         printArr(arr);
//     }



//---->Counting Sort

// import java.util.*;
// public class BasicSorting {
//     public static void countingSort(int arr[]){
//         int largest = Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             largest = Math.max(largest,arr[i]);
//         }

//         int count[] = new int[largest+1];
//         for(int i=0;i<arr.length;i++){
//             count[arr[i]]++;
//         }

//         //sorting
//         int j=0;
//         for(int i=0;i<count.length;i++){
//             while (count[i]>0) {
//                 arr[j] = i;
//                 j++;
//                 count[i]--;
//             }
//         }
//     }

//     public static void print(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,4,1,3,2,4,3,7};
//         countingSort(arr);
//         print(arr);
//     }
// }

