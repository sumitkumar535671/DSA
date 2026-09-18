//Queue using Array

// public class QueueB {
//     static class Queue {
//         static int arr[];
//         static int size;
//         static int rear;

//         Queue(int n){
//             arr = new int[n];
//             size = n;
//             rear = -1;
//         }
//         public static boolean isEmpty(){
//             return rear==-1;
//         }

//         //add 
//         public static void add(int data){
//             if (rear == size-1) {
//                 System.out.println("queue is full");
//                 return;
//             }

//             rear = rear + 1;
//             arr[rear] = data;
//         }

//         //remove
//         public static int remove(){
//             if (isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }

//             int front = arr[0];
//             for(int i=0;i<rear;i++){
//                 arr[i]=arr[i+1];
//             }
//             rear = rear - 1;
//             return front;
//         }

//         //peek
//         public static int peek(){
//             if (isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }

//             return arr[0];
//         }
//     }

//     public static void main(String[] args) {
//         Queue q = new Queue(5);
//         q.add(4);
//         q.add(5);
//         q.add(6);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }



//--->Circular queue using arrays
// public class QueueB {
//     static class Queue {
//         static int arr[];
//         static int size;
//         static int rear;
//         static int front;


//         Queue(int n){
//             arr = new int[n];
//             size = n;
//             rear = -1;
//             front = -1; 
//         }
//         public static boolean isFull(){
//             return (rear+1)%size == front;
//         }
//         public static boolean isEmpty(){
//             return front ==-1;
//         }

//         //add 
//         public static void add(int data){
//             if (isFull()) {
//                 System.out.println("queue is full");
//                 return;
//             }
//             //add 1st element 
//             if (front==-1) {
//                 front=0;
//             }

//             rear = (rear + 1)%size;
//             arr[rear] = data;
//         }

//         //remove
//         public static int remove(){
//             if (isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }

//             int result = arr[front];
            
//             //last el delete
//             if (rear == front) {
//                 rear = front = -1;
//             }else{
//                 front = (front+1)%size;
//             }
//             return result;
//         }

//         //peek
//         public static int peek(){
//             if (isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }

//             return arr[front];
//         }
//     }

//     public static void main(String[] args) {
//         Queue q = new Queue(5);
//         q.add(4);
//         q.add(5);
//         q.add(6);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }



//------>Queue using LL
// public class QueueB {

//     static class Node{
//         int data ; 
//         Node next;

//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static class Queue{
//         static Node head = null;
//         static Node tail = null;

//         public static boolean isEmpty(){
//             return head == null && tail == null;
//         }

//         //add
//         public static void add(int data){
//             Node newNode = new Node(data);
//             if (head==null) {
//                 head=tail=newNode;
//                 return;

//             }

//             tail.next = newNode;
//             tail = newNode;
//         }

//         //remove
//         public static int remove(){
//             if (isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }

//             int front = head.data;
//             //single element
//             if (tail==head) {
//                 tail=head=null;
//             }else{
//                 head=head.next;
//             }

//             return front;
//         }

//         //peek
//         public static int peek(){
//             if (isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }

//             return head.data;
//         }

//     }

//     public static void main(String[] args) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(3);
//         q.add(4);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }



//----->Queue using jcf

// import java.util.LinkedList;
// import java.util.Queue;

// public class QueueB {

//     public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<>();//queue ak interface hai isliye queue ka object nhi bn skta
//         //linkedlist or ArrayDeque class hi queue ko implement krte hai

//         q.add(1);
//         q.add(3);
//         q.add(4);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }



//----->Queue using two stack==>push O(n)
// import java.util.*;

// public class QueueB {

//     static class Queue{
//         static Stack<Integer> s1 = new Stack<>();
//         static Stack<Integer> s2 = new Stack<>();

//         public static boolean isEmpty(){
//             return s1.isEmpty();
//         }

//         //add
//         public static void add(int data){
//             while (!s1.empty()) {
//                 s2.push(s1.pop());
//             }

//             s1.push(data);

//             while (!s2.isEmpty()) {
//                 s1.push(s2.pop());
//             }
//         }

//         //remove
//         public static int remove(){
//             if (isEmpty()) {
//                 System.out.println("queue empty");
//                 return -1;
//             }

//             return s1.pop();
//         }

//         //peek
//         public static int peek(){
//             if (isEmpty()) {
//                 System.out.println("queue empty");
//                 return -1;
//             }

//             return s1.peek();
//         }
//     }

//     public static void main(String[] args) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


//---->stack using queue ==>pop O(n)
// import java.util.*;
// import java.util.LinkedList;

// public class QueueB {

//     static class Stack {
//         static Queue<Integer> q1 = new LinkedList<>();
//         static Queue<Integer> q2 = new LinkedList<>();

//         public static boolean isEmpty(){
//             return q1.isEmpty() && q2.isEmpty();
//         }

//         //add
//         public static void push(int data){
//             if (!q1.isEmpty()) {
//                 q1.add(data);
//             }else{
//                 q2.add(data);
//             }
//         }

//         //remove
//         public static int pop(){
//             if (isEmpty()) {
//                 System.out.println("empty stack");
//                 return -1;
//             }
//             int top = -1;

//             if(!q1.isEmpty()) {
//                 while (!q1.isEmpty()) {
//                     top = q1.remove();
//                     if (q1.isEmpty()) {
//                         break;
//                     }
//                     q2.add(top);
//                 }
//             }else{

//                 while (!q2.isEmpty()) {
//                     top = q2.remove();
//                     if (q2.isEmpty()) {
//                         break;
//                     }
//                     q1.add(top);
//                 }     
//         }
//         return top;
//         }
//         public static int peek(){
//             if (isEmpty()) {
//                 System.out.println("empty stack");
//                 return -1;
//             }
//             int top = -1;

//             if(!q1.isEmpty()) {
//                 while (!q1.isEmpty()) {
//                     top = q1.remove();
                    
//                     q2.add(top);
//                 }
//             }else{

//                 while (!q2.isEmpty()) {
//                     top = q2.remove();
                    
//                     q1.add(top);
//                 }     
//         }
//         return top;
//         }
//     }

//     public static void main(String[] args) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }

// }


//----> First non repeating letter in a stream of characters. TC=O(n),SC=O(n)

// import java.util.*;
// import java.util.LinkedList;
//  public class QueueB {
//     public static void copy(String str){
//         Queue <Character> q = new LinkedList<>();
//         int freq[] = new int[26];
//         for(int i = 0; i<str.length();i++){
//             char ch = str.charAt(i);
//             q.add(ch);
//             freq[ch - 'a']++;

//             while (!q.isEmpty() && freq[q.peek()-'a'] > 1) {
//                 q.remove();
//             }
            
//             if (q.isEmpty()) {
//                 System.out.println("-1");
//             }
//             else{
//                 System.out.println( q.peek()+" ");
//             }
//         }
//     }
 
//     public static void main(String[] args) {
//         String str = "aabccxb";
//         copy(str);
//     }
//  }


//----->Interleave 2 Halves of a Queue (even length). TC=O(n),SC=O(n) 
// import java.util.*;
// import java.util.LinkedList;
// public class QueueB {
//     public static void halves(int arr[]){
//         Queue <Integer> q = new LinkedList<>();
//         Queue <Integer> q1 = new LinkedList<>();
//         Queue <Integer> q2 = new LinkedList<>();
//         int mid = arr.length / 2;

//         //fill first half
//         for(int i = 0;i<mid;i++){
//             q1.add(arr[i]);
//         }

//         //fill second half
//         for(int i = mid;i<arr.length;i++){
//             q2.add(arr[i]);
//         }

//         //Interleave
//         for(int i = 0;i<arr.length;i++){
//             if ((i%2)==0) {
//                 q.add(q1.remove());
//             }
//             else{
//                 q.add(q2.remove());
//             }
//         }

//         System.out.println(q+" ");
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5,6,7,8,9,10};
//         halves(arr);
//     }
// }

//----->Interleave 2 Halves of a Queue (even length). TC=O(n),SC=O(n) 
//import java.util.*;
// import java.util.LinkedList;
// public class QueueB {
//     public static void interLeave(Queue<Integer> q){
//         if (q.size() % 2 != 0) {
//         System.out.println("Queue size must be even");
//         return;
//         }
//         Queue <Integer> firstHalf = new LinkedList<>();
//         int size = q.size();
//         for(int i=0;i<size/2;i++){
//             firstHalf.add(q.remove());
//         }

//         while (!firstHalf.isEmpty()) {
//             q.add(firstHalf.remove());
//             q.add(q.remove());
//         }

        
//     }

//     public static void main(String[] args) {
//         Queue <Integer> q = new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         q.add(6);
//         q.add(7);
//         q.add(8);
//         q.add(9);
//         q.add(10);
//         interLeave(q);
//         //print
//         while (!q.isEmpty()) {
//             System.out.print(q.remove() + " ");
//         }
//         System.out.println();
//      }
// }

//----> Queue Reversal
// import java.util.*;
// import java.util.LinkedList;
// public class QueueB {
//     public static void reverse(Queue<Integer> q){
//         Stack<Integer> s = new Stack<>();

//         while (!q.isEmpty()) {
//             s.push(q.remove());
//         }

//         while (!s.isEmpty()) {
//             q.add(s.pop());
//         }

//         System.out.print(q);
//     }

//     public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         reverse(q);
//     }
// }