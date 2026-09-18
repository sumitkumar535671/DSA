// import java.util.ArrayList;
// public class ArraysList {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);//--O(1)
//         System.out.println(list);

//         list.add(1,19);//--O(n)
//         System.out.println(list);

//         //Get Operation - O(1)
//         int element = list.get(0);
//         System.out.println(element);

//         //Delete -O(n)
//         list.remove(2);
//         System.out.println(list);
        
//         //set  - O(n)
//         list.set(2,9);
//         System.out.println(list);

//         //contains - O(n)
//         System.out.println(list.contains(9));
//         System.out.println(list.contains(11));

//         //size of a list
//         System.out.println(list.size());

//         //print the arraylist
//         for(int i=0;i<list.size();i++){
//             System.out.print(list.get(i)+" ");
//         }System.out.println();
//     }
// }



//--->print reverse
// import java.util.ArrayList;
// public class ArraysList {

//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         for(int i=list.size()-1;i>=0;i--){
//             System.out.print(list.get(i)+" ");
//         }System.out.println();
//     }
// }



//---->find maximum 
// import java.util.ArrayList;
// public class ArraysList {

//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(9);
//         list.add(5);
//         list.add(8);
//         list.add(1);
//         list.add(12);

//         int max = Integer.MIN_VALUE;
//         for(int i=0;i<list.size();i++){
//             // if (max<list.get(i)) {
//             //     max=list.get(i);
//             // }

//              max =Math.max(max, list.get(i));
//         }System.out.println("max element = " + max);
        
//     }
// }


//---->swap a number
// import java.util.ArrayList;
// public class ArraysList {
//     public static void swap(ArrayList<Integer> list,int idx1,int idx2){
//         int temp = list.get(idx1);
//         list.set(idx1, list.get(idx2));
//         list.set(idx2, temp);
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);

//         int idx1=1,idx2=3;
//         System.out.println(list);
//         swap(list, idx1, idx2);
//         System.out.println(list);
//     }
// }



//----->sorting an arraylist
// import java.util.ArrayList;
// import java.util.Collections;
// public class ArraysList {

//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(8);
//         list.add(2);
//         list.add(9);
//         list.add(4);
//         list.add(0);
//         System.out.println(list);
//         Collections.sort(list);
//         System.out.println(list);
//         Collections.sort(list,Collections.reverseOrder());//Comparator --function hai jo logic define krta hai
//         System.out.println(list);
        
//     }
// }


//---->multiDiamensional arrayList
// import java.util.*;
// public class ArraysList {

//     public static void main(String[] args) {
//         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//         ArrayList<Integer> list1 =new ArrayList<>();
//         ArrayList<Integer> list2 =new ArrayList<>();
//         ArrayList<Integer> list3 =new ArrayList<>();
        
//         for(int i=1;i<=5;i++){
//             list1.add(i*1);
//             list2.add(i*2);
//             list3.add(i*3);
//         }
//         mainList.add(list1);
//         mainList.add(list2);
//         mainList.add(list3);
        
//         for(int i=0;i<mainList.size();i++){
//             ArrayList<Integer> currList = mainList.get(i);
//             for(int j=0;j<currList.size();j++){
//                 System.out.print(currList.get(j) + " ");
//             }
//             System.out.println();
//         }
//     }
// }


//---->container with most water (brute force)  TC[O(n^2)]
// import java.util.ArrayList;
// public class ArraysList {
//     public static int storeWater(ArrayList<Integer> height){
//         int maxWater = 0;
//         for(int i=0;i<height.size();i++){
//             for(int j=i+1;j<height.size();j++){
//                 int ht = Math.min(height.get(i),height.get(j));
//                 int width =j-i;
//                 int currWater = ht*width;
//                 maxWater = Math.max(maxWater, currWater);
//             }
//         } 
//         return maxWater;
//     }

    // public static void main(String[] args) {
    //     ArrayList<Integer> height = new ArrayList<>();
    //     height.add(1);
    //     height.add(8);
    //     height.add(6);
    //     height.add(2);
    //     height.add(5);
    //     height.add(4);
    //     height.add(8);
    //     height.add(3);
    //     height.add(7);
    //     System.out.println(storeWater(height));


    // }
// }


// //---->optimized  TC[O(n)]
// import java.util.ArrayList;
// public class ArraysList {
//     public static int storeWater(ArrayList<Integer> height){
//         int lp = 0;
//         int rp = height.size()-1;
//         int maxWater=0;
//         while (lp<rp) {
//            int ht = Math.min(height.get(lp), height.get(rp));
//            int width = rp-lp;
//            int currWater = ht*width;
//            maxWater = Math.max(maxWater, currWater);
            
//             if (height.get(lp)<height.get(rp)) {
//                 lp++;
//             }
//             else{
//                 rp--;
//             }
             
//         }
//         return maxWater;
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> height = new ArrayList<>();
//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);
//         System.out.println(storeWater(height));


//     }
// }



//---->pair sum (brute force)
// import java.util.ArrayList;
// public class ArraysList {

//     public static boolean pairSum1(ArrayList<Integer> list,int target){
//         for(int i=0;i<list.size();i++){
//             for(int j=i+1;j<list.size();j++){
//                 int p1 = list.get(i);
//                 int p2 = list.get(j);
//                 if (p1+p2==target) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
    // public static void main(String[] args) {
    //     ArrayList<Integer> list = new ArrayList<>();
    //     for(int i=1;i<=6;i++){
    //         list.add(i);
    //     }
    //     int target =5;
    //     System.out.println(pairSum1(list, target));
    // }
// }


//---->optimized TC[O(n)]
// import java.util.ArrayList;
// public class ArraysList {
//     public static boolean pairSum1(ArrayList<Integer> list,int target){
//         int lp=0;
//         int rp=list.size()-1;
//         while (lp!=rp) {
//             if (list.get(lp)+list.get(rp)==target) {
//                 return true;
//             }
//             else if (list.get(lp)+list.get(rp)>target) {
//                 rp--;

//             }
//             else{
//                 lp++;
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         for(int i=1;i<=6;i++){
//             list.add(i);
//         }
//         int target =51;
//         System.out.println(pairSum1(list, target));
//     }
// }


//---->pair sum 2 sorted and rotated  --TC[O(n)]
// import java.util.*;
// public class ArraysList {
//     public static boolean pairSum2(ArrayList<Integer> list,int target){
//         int bp = -1;
//         int n=list.size();
//         for(int i=0;i<list.size();i++){
//             if (list.get(i)>list.get(i+1)) {//breaking point
//                 bp=i;
//                 break;
//             }
//         }

//         int lp=bp+1;//smallest
//         int rp=bp;//largest

//         while (lp!=rp) {
//             //case1
//             if (list.get(lp)+list.get(rp)==target) {
//                 return true;
//             }
//             //case2
//             if (list.get(lp)+list.get(rp)<target) {
//                 lp=(lp+1)%n;
//             }

//             else{
//                 rp=(rp-1+n)%n;
//             }

//         }
//         return false;
        
                

//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(11);
//         list.add(15);
//         list.add(6);
//         list.add(7);
//         list.add(8);
//         list.add(9);
//         list.add(10);
//         int target=16;
//         System.out.println(pairSum2(list, target));
//     }
//}