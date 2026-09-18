// import java.util.*;

// public class ArraysCC {

//     public static void main(String[] args) {
//         int marks[]=new int[100];
//         Scanner sc = new Scanner(System.in);

//         marks[0] = sc.nextInt();
//         marks[1] = sc.nextInt();
//         marks[2] = sc.nextInt();

//         System.out.println("phy : "+marks[0]);
//         System.out.println("chem : "+marks[1]);
//         System.out.println("maths : "+marks[2]);

//         marks[2] =marks[2]+5;
//         System.out.println("maths : "+marks[2]);
//     }
// }



// import java.util.*;

// public class ArraysCC {

//     public static void update(int marks[]){
//         for(int i=0;i<marks.length;i++){
//             marks[i]=marks[i]+1;
//         }

//     }
//     public static void main(String[] args) {
//         int marks[]={97,98,99};
//         update(marks);
//         for(int i=0;i<marks.length;i++){
//             System.out.println(marks[i]);
//         }
        
//         }
//     }



    
//--->linear search

// import java.util.*;

// public class ArraysCC {

//     public static int linearSearch(int numbers[],int key){
//         for(int i=0;i<numbers.length;i++){
//             if(numbers[i]==key){
//                return i;
//             }
//         }
//         return -1;
        
        

//     }
//     public static void main(String args[]) {
//         int numbers[]={2,4,6,8,10,12,14,16};
//         int key =2;

//         int index = linearSearch(numbers, key);
//         if(index==-1){
//             System.out.println("not found");
//         }else{
//             System.out.println("key is at index: "+index);
//         }
        
        
//     }
// }




//--->largest Number

// import java.util.*;

// public class ArraysCC {

//     public static int largestNum(int arr[],int max){
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max=arr[i];
              
//             }
//         }
//         return max;
            
//     }

//     public static void main(String[] args) {
//         int arr[]={1,3,5,7,8,2};
//         int max=70;
//         int x =largestNum(arr, max);
//         System.out.println("largest number is :"+ x);
//     }
// }



//--->largest numbers by mam
// import java.util.*;
// public class ArraysCC {

//     public static int getLargest(int numbers[]){
//         int largest = Integer.MIN_VALUE;

//         for(int i=0;i<numbers.length;i++){
//             if(largest<numbers[i]){
//                 largest=numbers[i];
//             }
//         }
//         return largest;
//     }
//     public static void main(String[] args) {
//         int numbers[]={4,6,7,3,8,2,9};
//         int largest = getLargest(numbers);
//         System.out.println("largest number is : " +largest);
//     }
// }


//---->Binary search[TC=O(log(n)) & SC=O(1)]
// import java.util.*;
// public class ArraysCC {
//     public static int binarySearch(int numbers[],int key){
//         int start = 0,end = numbers.length-1;
//         while (start<=end) {
//             int mid = start+(end-start)/2;
//             //comparision
//             if(numbers[mid]==key){
//                 return mid;
//             }
//             if(numbers[mid]<key){//right
//                 start=mid+1;
//             }else{//left
//                 end=mid-1;
//             }
//         }
//         return -1;
         
//     }

//     public static void main(String[] args) {
//         int numbers[]={2,4,6,8,10,12,14};
//         int key = 12;
//         System.out.println("index for key is : "+binarySearch(numbers, key));
//     }
// }



//---->swaping the array{TC=O(n) & SC=O(1)}

// import java.util.*;
// public class ArraysCC {

//     public static void reverse(int numbers[]){
//         int first=0,last=numbers.length-1;
//         while(first<last){
//             int temp=numbers[last];
//             numbers[last]=numbers[first];
//             numbers[first]=temp;
//             first++;
//             last--;
           
//         }
//     }
//     public static void main(String args[]) {
//       int numbers[]={2,4,6,8,10};
//         reverse(numbers);
//         for(int i=0;i<numbers.length;i++){
//             System.out.print(numbers[i]+" ");
//         }
        
//     }
// }



//---->Pairs in an array
// import java.util.*;
// public class ArraysCC {

//     public static void pairs(int arr[]){
//         int tp=0;
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 System.out.print("("+(arr[i]+","+arr[i+j+1])+")");
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.println("total number of pairs: "+tp);
//     }
//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         pairs(arr);
//     }
// }



//---->Print Subarrays
// import java.util.*;
// public class ArraysCC {

//     public static void printSubarrays(int numbers[]){
//             int tp=0;
//             for(int i=0;i<numbers.length;i++){
//                 for(int j=i;j<numbers.length;j++){
//                     for(int k=i;k<=j;k++){
//                         System.out.print(numbers[k]+" ");
                        
//                     }tp++;
                    
//                     System.out.println();
//                     }
//                     System.out.println();
//                 }System.out.println("Total numbers of subarrays is : "+tp);
//             }

    
//     public static void main(String[] args) {
//         int numbers[]={2,4,6,8,10};
//         printSubarrays(numbers);
        
//     }
// }




//---->Sum of the Subarray is 
// import java.util.*;
// public class ArraysCC {

//     public static void printSubarrays(int numbers[]){
//             int sum=0;
//             int tp=0;
//             for(int i=0;i<numbers.length;i++){
//                 sum=0;
//                 for(int j=i;j<numbers.length;j++){
                    
//                     for(int k=i;k<=j;k++){
//                         System.out.print(numbers[k]+" ");
//                         sum = sum+numbers[k];
                        
//                     }tp++;
                    
//                     System.out.println();
//                     }System.out.print("The sum of the subarray is : "+sum);
//                     System.out.println();
//                 }
//                 System.out.println("Total numbers of subarrays is : "+tp);
//             }
        

    
//     public static void main(String[] args) {
//         int numbers[]={2,4,6,8,10};
//         printSubarrays(numbers);
        
//     }
// }




//---->max sub array sum(Brute Force)

// import java.util.*;
// public class ArraysCC {

//     public static void printSubarrays(int numbers[]){
//             int currSum=0;
//             int max=Integer.MIN_VALUE;

//             for(int i=0;i<numbers.length;i++){
//                 for(int j=i;j<numbers.length;j++){
//                     currSum=0;
//                     for(int k=i;k<=j;k++){
//                         System.out.print(numbers[k] +" ");
//                         currSum+=numbers[k];
                        
//                     }
//                     System.out.println();
//                     if(max<currSum){
//                         max=currSum;
//                     }
                    
                    
//                     }
                    
//                 }
//                 System.out.println("max sum = "+max);
                
//             }

    
//     public static void main(String[] args) {
//         int numbers[]={-5,-7,-9,-7};
//         printSubarrays(numbers);
        
//     }
// }



//---->max sub array sum(prefix sum)

// import java.util.*;
// public class ArraysCC {

//     public static void maxSubarraysSum(int numbers[]){
//         int currSum=0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[]= new int[numbers.length];

//         prefix[0]=numbers[0];
//         //calculate prefix array 
//         for(int i=1;i<prefix.length;i++){
//             prefix[i]=prefix[i-1]+numbers[i];
//         }
//         for(int i=0;i<numbers.length;i++){
//             int start=i;
//             for(int j=i;j<numbers.length;j++){
//                 int end =j;
//                 currSum = start==0 ? prefix[end]:prefix[end]-prefix[start-1];
//                 if(maxSum<currSum){
//                     maxSum=currSum; 
//                 }
//             }
//         }
//         System.out.println("max sum = " +maxSum);
//     }
//     public static void main(String[] args) {
//         int numbers[]={-5,-7,-9,-7,-1};
//         maxSubarraysSum(numbers);
//     }
// }




//---->max sub array sum(kadanes algorithm)

// import java.util.*;

// public class ArraysCC {

//     public static void kadanes(int numbers[]){
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;

//         for(int i=0;i<numbers.length;i++){
//             cs+=numbers[i];
            
//             if(cs<0){
//                 cs=0;
//             }
//             ms = Math.max(cs,ms);
//         }
//         System.out.println("our max subarray sum is : " +ms);
   
//     }
//     public static void main(String[] args) {
//         int numbers[] = {-6,-4,-5};
//         kadanes(numbers);
//     }
// }

//---->for all negative 
// import java.util.*;
// public class ArraysCC {
//     public static void kadanes(int arr[]){
//         int ms=arr[0];
//         int cs =arr[0];
//         for(int i=0;i<arr.length;i++){
//             cs=Math.max(arr[i], cs+arr[i]);
//             ms=Math.max(cs, ms);
//         }
//         System.out.println("the maximum subarray sum is :"+ms);
//     }

//     public static void main(String[] args) {
//         int arr[]={-5,-8,-4};
//         kadanes(arr);
//     }
// }


//----> trappedRainwater
// import java.util.*;
// public class ArraysCC {
//     public static int trappedRainwater(int height[]){
//         int n=height.length;
//         //calculate left max boundary - array
//         int leftMax[] = new int[n];
//         leftMax[0] = height[0];
//         for(int i=1;i<n;i++){
//             leftMax[i] = Math.max(height[i], leftMax[i-1]);
//         }
//         //calculate right max boundary - array
//         int rightMax[] = new int[n];
//         rightMax[n-1] = height[n-1];
//         for(int i=n-2; i>=0;i--){
//             rightMax[i] = Math.max(height[i],rightMax[i+1]);
//         }

//         int trappedWater =0;
//         //loop
//         for(int i=0;i<n;i++){
//             //waterlevel =min(leftmax,rightmax)
//             int waterLevel = Math.min(leftMax[i], rightMax[i]);

//             //trapped water = waterlevel - hight[i]
//             trappedWater += waterLevel - height[i];
//         }
//         return trappedWater;
//     }

//     public static void main(String[] args) {
//         int height[]={3,1,2,4,0,0,5};
//         System.out.println(trappedRainwater(height));
// }}


//---->buy & sell stock

// import java.util.*;

// public class ArraysCC {

//     public static int buyAndSellStock(int prices[]){
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for(int i=0;i<prices.length;i++){
//             if(buyPrice<prices[i]){//profit
//                 int profit = prices[i] -buyPrice;//todays profit
//                 maxProfit = Math.max(maxProfit, profit);

//             }else{
//                 buyPrice = prices[i];
//             }
//         }
//         return maxProfit;
//     }

//     public static void main(String[] args) {
//         int prices[] = {7,1,5,3,6,4};
//         System.out.println(buyAndSellStock(prices));
//     }
// }



//3 topic to revise-->(1)prefix,(2)trappedRainwater,(3)stock


//---->PRACTICE
//---->Second largest element in an array 
// import java.util.*;
// public class ArraysCC {
//     public static int secLargest(int arr[]){
//         int max1 = 0;
//         int max2 = 0;
//         if (arr[0]>arr[1]) {
//             max1 = arr[0];
//             max2 = arr[1];
//         }
//         else{
//             max1 =arr[1];
//             max2 = arr[0];
//         }
//         for(int i=2;i<arr.length;i++){
//             if (arr[i]>max1) {
//                 max2=max1;
//                 max1=arr[i];
//             }else if (arr[i]>max2) {
//                 max2 = arr[i];
                
//             }
                
            
//         }return max2;

//     }

//     public static void main(String[] args) {
//         int arr[] = {3,5,54,6,76,9};
//         System.out.println(secLargest(arr));
//     }  
