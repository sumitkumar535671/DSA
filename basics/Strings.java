// import java.util.*;
// public class Strings {
//     public static void printLetters(String str,char arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.println(arr[i]);
//         }
//     }
//     public static void main(String[] args) {
//         char arr[] = {'a','b','c','d'};
//         String str = "abcd";
//         printLetters(str,arr);
//     }
    
// }


//---->Question 1 check if a string is a palindrome

// import java.util.*;
// public class Strings {
//     public static boolean palindrome(String str){
//         int n=str.length();
//         for(int i=0;i<(n/2);i++){
//             if(str.charAt(i)==str.charAt(n-i-1)){
              
//                 return true;

//             }
            
//         }return false;
//     }

//     public static void main(String[] args) {
//         String str ="kaka";
//         System.out.println(palindrome(str));
//     }
// }



//---->Given a route containing 4 directions (E,W,N,S) find the shortest path to reach destination.
// import java.util.*;
// public class Strings {
//     public static float getShortestPath(String path){
//         int x=0,y=0;
//         for(int i=0;i<path.length();i++){
//             char dir = path.charAt(i);
//             //South
//             if (dir=='S') {
//                 y--;
//             }
//             //North
//             else if (dir=='N') {
//                 y++;
//             }
//             //West
//             else if (dir=='W') {
//                 x--;
//             }
//             //East
//             else{
//                 x++;
//             }
//         }
//         int X2=x*x;
//         int Y2=y*y;
//         return (float)Math.sqrt(X2+Y2);

//     }


//     public static void main(String[] args) {
//         String path = "WNEENESENNN";
//         System.out.println(getShortestPath(path));
//     }
// }



// import java.util.*;
// public class Strings {

//     public static void main(String[] args) {
//         String s1="sumit";
//         String s2=new String("sumit");
//         if (s1.equals(s2)) {
//             //---->(interning)equals function sirf value ko check krta hai
//             System.out.println("Strings are equal");
//         }else{
//             System.out.println("Strings are not equal");
//         }
//     }
// }




//---->Substrings
// import java.util.*;
// public class Strings {
//     public static String substring(String str,int si,int ei){
//         String substr ="";
//         for(int i=si;i<ei;i++){
//             substr+=str.charAt(i);
//         }
//         return substr;
//     }

//     public static void main(String[] args) {
//         String str = "HelloWorld";
//         System.out.println(str.substring(0,4));
//          //System.out.println(substring(str,0,5));
//     }
// }

//---->lexicographic compare:-abc<abd
//-->Question :-for a given set of strings print the largest string.
// import java.util.*;
// public class Strings {

//     public static void main(String[] args) {
//         String fruits[] = {"apple","mango","banana"};
//         String largest = fruits[0];
//         for(int i=1;i<fruits.length;i++){
//             if (largest.compareTo(fruits[i])<0) {
//                 largest = fruits[i];
//             }
//         }
//         System.out.println(largest);
//     }
// }


//----> StringBuilder
// import java.util.*;
// public class Strings {

//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("");
//         for(char ch='a';ch<='z';ch++){
//             sb.append(ch);
            
//         }
//         System.out.println(sb);
//     }
// }

//---->Question :-for a given string convert each the letter of each word to uppercase.
// import java.util.*;
// public class Strings {
//     public static String toUpperCase(String str){
//         StringBuilder sb = new StringBuilder("");

//         char ch = Character.toUpperCase(str.charAt(0));
//         sb.append(ch);

//         for(int i=1;i<str.length();i++){
//             if (str.charAt(i)==' '&&i<str.length()-1) {
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));
//             }else{
//                 sb.append(str.charAt(i));
//             }
//         }
//         return sb.toString();
//     }

//     public static void main(String[] args) {
//         String str ="hi, i am shradha";
//         System.out.println(toUpperCase(str));
//     }
// }



//---->String Compression  home work:-esh q ko StringBuilder se krna hai.
// import java.util.*;
// public class Strings {

//     public static String compress(String str){
//         String newStr = "";
//         for(int i=0;i<str.length();i++){//O(n)
//             Integer count = 1;
//             while (i<str.length()-1&&str.charAt(i)==str.charAt(i+1)) {
//                 count++;
//                 i++;
//             }
//             newStr += str.charAt(i);
//             if (count>1) {
//                 newStr += count.toString();
//             }
//         }
//         return newStr;
//     }
//     public static void main(String[] args) {
//         String str = "abbbbbbccbccccc";
//         System.out.println(compress(str));
//     }
// }


// import java.util.*;
// public class Strings {
//     public static void compress(String str ){
        
//         StringBuilder sb = new StringBuilder();
//         for(int i=0;i<str.length();i++){
//             Integer count =1;
//             while (i<str.length()-1&&str.charAt(i)==str.charAt(i+1)) {
//                 count++;
//                 i++;
            
//             }
//             sb.append(str.charAt(i));
//             if (count>1) {
//                 sb.append(count.toString());
//             }
//         }
//         System.out.println(sb);
//     }

//     public static void main(String[] args) {
//         String str = "aabaaccccbbbb";
//         compress(str);
//     }
// }