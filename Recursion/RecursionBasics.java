// public class RecursionBasics {
//     public static void printDec(int n){
//         if (n==1) {
//             System.out.println(n);
//             return;
//         }
        
//         System.out.print(n + " ");
//         printDec(n-1);
//     }
//     public static void main(String[] args) {
//         int n = 10;
//         printDec(n);
//     }
// }


//Q:- print numbers from n to 1(increasing order)
// public class RecursionBasics {
//     public static void printInc(int n){
//         if (n==1) {
//             System.out.print(n+" ");
//             return;
//         }

//        printInc(n-1);
//        System.out.print(n +" ");
//     }

//     public static void main(String[] args) {
//         int n = 10;
//         printInc(n);
//     }
// }



//Q:- print factorial of a number n.

// public class RecursionBasics {
//     public static int factorial(int n){

//         if (n==0) {
            
//             return 1;
//         }
//         int fnm1 = factorial(n-1);
//         int fn = n*fnm1;
//         return fn;

        
        
//     }

//     public static void main(String[] args) {
//         int n=6;
//         System.out.println(factorial(n));
//     }
// }


//Q:-print sum of first n natural numbers.
// public class RecursionBasics {
//     public static int sum(int n){
//         if (n==1) {
//             return 1;
//         }
//         int sum1 = sum(n-1);
//         int tosum = n+sum1;
//         return tosum;
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         System.out.print(sum(n));
//     }
// }



//Q:----Fibonnacci numbers.
//space complexity---O(n)
//Time complexity---O(2^n)
// public class RecursionBasics {
//     public static int fib(int n){
//         if (n==0||n==1) {
//             return n;
//         }
//         int fnm1 = fib(n-1);
//         int fnm2 = fib(n-2);
//         int fn = fnm1+fnm2;
//         return fn;


//     }

//     public static void main(String[] args) {
//         int n=6;
//         System.out.println(fib(n));
        
//     }
// }



//Q:--check if a given array is sorted or not.

// public class RecursionBasics {
//     public static boolean isSorted(int arr[],int i){
//         if (i==arr.length-1) {
//             return true;
//         }

//         if (arr[i]>arr[i+1]) {
//             return false;
//         }

//         return isSorted(arr, i+1);
//     }

//     public static void main(String[] args) {
//         int arr[] = {4,5,8};
//         System.out.print(isSorted(arr, 0));
//     }
// }




//Q:--WAF to find the first occurence of an element in an array.
// public class RecursionBasics {
//     public static int firstOccurence(int arr[],int key,int i){
//         if (i==arr.length) {
//             return -1;
//         }
//         if (arr[i]==key) {
//             return i;
//         }
        
//        int n=firstOccurence(arr, key, i+1);

//         return n;
//     }

//     public static void main(String[] args) {
//         int arr[] = {8,5,4,6,9,7};
//         System.out.println(firstOccurence(arr, 6, 0));

//     }
// }




//Q:-WAF to find the last occurence of an element in an array.
// public class RecursionBasics {
//     public static int lastOccurence(int arr[],int key,int i){
//         if (i==arr.length) {
//             return -1;
//         }
//         int isFound = lastOccurence(arr, key, i+1);
//         if (isFound==-1&&arr[i]==key) {
//             return i;
//         }
//         return isFound;
//     }

//     public static void main(String[] args) {
//         int arr[]={4,2,5,7,6,6,3,8};
//         System.out.println(lastOccurence(arr, 1, 0));
//     }
// }




//print x to the power n.---->TC[O(n)]
// public class RecursionBasics {
//     public static int power(int x,int n){
//         if (n==0) {
//             return 1;
//         }
//         int xnm1 = power(x, n-1);
//         int xn = x*xnm1;
//         return xn;

//     }

//     public static void main(String[] args) {
//         System.out.println(power(2, 4));
//     }
// }


//----> optimised ---->TC[O(log(n))]
// public class RecursionBasics {

//     public static int optimizedPower(int a,int n){
//         if (n==0) {
//             return 1;
//         }
//         int halfPower = optimizedPower(a, n/2);
//         int halfPowerSq = halfPower*halfPower;

//         //n is odd
//         if (n%2!=0) {
//             halfPowerSq = a*halfPowerSq;
//         }
//         return halfPowerSq;
//     }
//     public static void main(String[] args) {
//         int a = 2;
//         int n = 5;
//         System.out.println(optimizedPower(a, n));
//     }
// }


//---->Tiling Problem.

//Q:-Given a "2*n" board and tiles of size "2*1",count the number of ways
// to tile the given board using the 2*1 tiles.
//(Atile can either be placed horizontally or vertically.)


// public class RecursionBasics {
//     public static int tilingProblem(int n){
//         //base case
//         if (n==0||n==1) {
//             return 1;
//         }
//         //kaam
//         //vertical choice
//         int fnm1 = tilingProblem(n-1);
//         //horizontal choice
//         int fnm2 = tilingProblem(n-2);

//         int totWays = fnm1 + fnm2;
//         return totWays;
//     }

//     public static void main(String[] args) {
//         System.out.println(tilingProblem(4));
//     }
// }


//---->Remove Duplicates in a String.


// public class RecursionBasics {
//     public static void removeDuplicates(String str, int idx,StringBuilder newStr,boolean map[]){
//         if (idx==str.length()) {
//             System.out.println(newStr);
//             return;
//         }

//         //kaam
//         char currChar = str.charAt(idx);
//         if (map[currChar-'a']==true) {
//             //duplicate
//             removeDuplicates(str, idx+1, newStr, map);
//         }else{
//             map[currChar - 'a']=true;
//             removeDuplicates(str, idx+1, newStr.append(currChar), map);
//         }
//     }

//     public static void main(String[] args) {
//         String str = "appnacollege";
//         removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
//     }
// }




//----->Friends Pairing Problem.

//Q:-Given n friends, each one can remain single or can be paired up with 
//some other friend. Each friend can be paired only once. Find out the 
//total number of ways in which friends can remain single or can be paired up.



// public class RecursionBasics {
//     public static int friendsPairing(int n){
//         if (n==1||n==2) {
//             return n;
//         }
//         //choice 
//         //single
//         int fnm1 = friendsPairing(n-1);

//         //pair
//         int fnm2 = friendsPairing(n-2);
//         int pairWays = (n-1)*fnm2;

//         //totWays
//         int totWays = fnm1 + pairWays;
//         return totWays;
//     }

//     public static void main(String[] args) {
//         System.out.println(friendsPairing(3));
//     }
// }



//------>Binary Strings Problems
// Q:-print all binary strings of size N without consecutive ones.
// public class RecursionBasics {
//     public static void printBinStrings(int n, int lastPlace,String str){
//         //Base case
//         if (n==0) {
//             System.out.println(str);
//             return;
//         }

//         //kaam
//         printBinStrings(n-1, 0, str+"0");
//         if (lastPlace==0) {
//             printBinStrings(n-1, 1, str+"1");
//         }
//     }

//     public static void main(String[] args) {
//         printBinStrings(3, 0,"");
        
//     }
// }


//Q:-Question1:For a given integer array of size N.
//You have to find all the occurrences(indices) of a given element(Key)
//and print them.Use a recursive function to solve this problem. 
//Sample Input: arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},key = 2 Sample Output: 1 5 7 8

// public class RecursionBasics {
//     public static void indices(int arr[],int key,int idx){
//         if (idx ==arr.length) {
//             return;
//         }
//         if (arr[idx]==key) {
//             System.out.println(idx);
            
//         }indices(arr, key, idx+1);
        
//     }

//     public static void main(String[] args) {
//         int arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
       
//         indices(arr, 2,0);
//     }
// }


//Question 2 :You are given a number (eg -  2019), convert it into a 
//String of english like“two zero one nine”.  Use a recursive function 
//to solve this problem.
//NOTE-The digits of the number will only be in the range 0-9 and 
//the last digit of a number can’t be 0.

// public class RecursionBasics {
//     public static void convert(int n){
//         String arr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
//         if (n==0) {
//             return;
//         }
//         int lastDigit = n%10;
//         convert(n/10);
//         System.out.print(arr[lastDigit] +" ");

//     }
    

//     public static void main(String[] args) {
//         convert(7778);
//     } 
// }


// public class RecursionBasics {
//     public static void convert(int n,String arr[]){
        
//         if (n==0) {
//             return;
//         }
//         int lastDigit = n%10;
//         convert(n/10,arr);
//         System.out.print(arr[lastDigit] +" ");

//     }
    

//     public static void main(String[] args) {
//         String arr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
//         convert(7778,arr);
//     } 
// }



//Question 3 :Write a program to find Length of a Stringusing Recursion
// public class RecursionBasics {
//     public static int length(String str){
//         if (str.length()==0) {
//             return 0;
//         }

//         return length(str.substring(1))+1;
//     }

//     public static void main(String[] args) {
//         String str = "jdhhjfdgvhjdg";
//         System.out.println(length(str));
//     }
// }



//------->Question 1:For a given integer array of size N.You have to find all the occurrences(indices) 
//        of a given element (Key) and print them.Use a recursive function to solve this problem.

// import java.util.*;
// public class RecursionBasics {
//     public static void allOccurrences(int arr[],int i,int key){
//         if (i==arr.length) {
//             return;
//         }

//         if (arr[i]==key) {
//             System.out.print(i+" ");
            
//         }allOccurrences(arr, i+1, key);

//     }

//     public static void main(String[] args) {
//         int arr[]={2,4,3,5,6,7,2,4,5,2,2,2,2,2};
//         int key =2;
//         allOccurrences(arr,0,4);
//     }
// }



//Question 2 :You are given a number (eg -  2019), convert it into a String of english like“two zero one nine”. 
// Use a recursive function to solve this problem.
//NOTE-The digits of the number will only be in the range 0-9 and the last digit of a number can’t be 0.
//Sample Input: 1947 Sample Output: “one nine four seven

// import java.util.*;
// public class RecursionBasics {
//     public static void print(String str[],int number){
//         if (number==0) {
//             return;
//         }
//         int lastDigit=number%10;
//         print(str,number/10);

//         System.out.print(str[lastDigit]+" ");
//     }

//     public static void main(String[] args) {
//         String str[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
//         int number=1230;
//         print(str, number);
//     }
// }

