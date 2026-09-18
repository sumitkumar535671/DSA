// import java.util.PriorityQueue;

// public class Heaps {
//     public static void main(String[] args) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         pq.add(9);
//         pq.add(4);
//         pq.add(8);
//         pq.add(5);
//         while (!pq.isEmpty()) {
//             System.out.println(pq.peek());
//             pq.remove();
//         }
//     }
// }


//--->object ko compare

// import java.util.Comparator;
// import java.util.PriorityQueue;

// public class Heaps {
//     static class Student implements Comparable<Student>{
//         String name;
//         int rank;
        
//         public Student(String name, int rank){
//             this.name = name;
//             this.rank = rank;
//         }
//         @Override
//         public int compareTo(Student s2){
//             return this.rank - s2.rank;
//         }
//     }
//     public static void main(String[] args) {
//         PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
//         pq.add(new Student("a", 4));
//         pq.add(new Student("b", 2));
//         pq.add(new Student("c", 9));
//         pq.add(new Student("d", 1));
//         while (!pq.isEmpty()) {
//             System.out.println(pq.peek().name + "->" + pq.peek().rank);
//             pq.remove();
//         }
//     }
// }


//---->Insert in heap
// import java.util.*;

// public class Heaps {

//     static class Heap {
    
//         ArrayList<Integer> arr = new ArrayList<>();
        
//         public void add(int data){
//             //add at last idx
//             arr.add(data);
//             //idx of child
//             int x = arr.size()-1;
//             //idx of parent
//             int par = (x-1)/2;
//             while (arr.get(x)<arr.get(par)) { //O(log(n))
//                 //swap
//                 int temp = arr.get(x);
//                 arr.set(x,arr.get(par));
//                 arr.set(par, temp);
//                 x = par;
//                 par = (x-1)/2;
//             }
//         }

//         //peek
//         public int peek(){
//             return arr.get(0);
//         }

//         private void heapify(int i){
//             int left = 2*i + 1;
//             int right = 2*i + 2;
//             int minIdx = i;

//             if (left<arr.size() && arr.get(left) < arr.get(minIdx)) {
//                 minIdx = left;
//             }

//             if (right<arr.size() && arr.get(right) < arr.get(minIdx)) {
//                 minIdx = right ;
//             }
//             if (minIdx != i) {
//                 //swap
//                 int temp = arr.get(i);
//                 arr.set(i, arr.get(minIdx));
//                 arr.set(minIdx, temp);
//                 heapify(minIdx);
//             }
//         }

//         //Delete
//         public int remove(){  //O(log(n))
//             int data = arr.get(0);

//             //step1 - swap first & last
//             int temp = arr.get(0);
//             arr.set(0,arr.get(arr.size()-1));
//             arr.set(arr.size()-1, temp);

//             //step2 - delete last
//             arr.remove(arr.size()-1);

//             //step3 - heapify
//             heapify(0);
    
//             return data;
//         }

//         public boolean isEmpty(){
//             return arr.size() == 0;
//         }
//     }
//     public static void main(String[] args) {
//         Heap h = new Heap();
//         h.add(3);
//         h.add(4);
//         h.add(1);
//         h.add(5);

//         while (!h.isEmpty()) {
//             System.out.println(h.peek());
//             h.remove();
//         }
//     }
// }


//----->Heap sort
// import java.util.*;

// public class Heaps {
//     public static void heapify(int arr[],int i, int size){
//         int maxIdx = i;
//         int left = 2*i + 1;
//         int right = 2*i + 2;

//         if (left<size && arr[left]> arr[maxIdx]) {
//             maxIdx = left;
//         }

//         if (right<size && arr[right]> arr[maxIdx]) {
//             maxIdx = right;
//         }

//         if (maxIdx != i) {
//             //swap
//             int temp = arr[i];
//             arr[i] = arr[maxIdx];
//             arr[maxIdx] = temp;
//             heapify(arr, maxIdx, size);
//         }
//     }
//     public static void heapSort(int arr[]){
//         //step1 - build maxHeap
//         int n = arr.length;
//         for(int i=n/2; i>=0; i--){  //O(nlog(n))
//             heapify(arr,i, n);
//         }

//         //step2 - push largest at end
//         for(int i=n-1; i>0; i--){  //O(nlog(n))
//             //swap (first with last)
//             int temp = arr[0];
//             arr[0] = arr[i];
//             arr[i] = temp;
//             heapify(arr, 0, i);
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = {1,2,4,5,3};
//         heapSort(arr);
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }