// import java.util.*;

// public class Hashing {
//     public static void main(String[] args) {
//         //Create 
//         HashMap<String,Integer> hm = new HashMap<>();
        
//         //Insert
//         hm.put("India",100);
//         hm.put("China",150);
//         hm.put("US",50);

//         System.out.println(hm);

//         //Iterate
//         Set<String> keys = hm.keySet();
//         System.out.println(keys);
//         for (String k : keys) {
//             System.out.println(k + ", value = " + hm.get(k));
//         }
        
//          System.out.println(hm.entrySet());
        

//     }
// }


//---->implementation
// import java.util.*;
// public class Hashing {

//     static class HashMap<K,V> { //generic
//         private class Node {
//             K key;
//             V value;
//             public Node (K key, V value){
//                 this.key = key;
//                 this.value = value;
//             }
//         }
//         private int n; //n
//         private int N; //buckets length
//         private LinkedList<Node> buckets[]; //N

//         @SuppressWarnings("unchecked")
//         public HashMap(){
//             this.N = 4;
//             this.buckets = new LinkedList[4];
//             for(int i=0;i<4; i++){
//                 this.buckets[i] = new LinkedList<>();
//             }
//         }

//         private int hashFunction(K key){
//             int hc = hashCode();
//             return Math.abs(hc) % N;
//         }

//         private int SearchInLL(K key, int bi){
//             LinkedList<Node> ll = buckets[bi];
//             int di = 0;

//             for(int i=0; i<ll.size(); i++){
//                 Node node = ll.get(i);
//                 if (node.key == key) {
//                     return di;
//                 }
//                 di++;
//             }
//             return -1;
//         }

//         @SuppressWarnings("unchecked")
//         private void rehash(){
//             LinkedList<Node> oldBuck[] = buckets;
//             buckets = new LinkedList[N*2];
//             N = 2*N;
//             for(int i=0; i<buckets.length; i++){
//                 buckets[i] = new LinkedList<>();
//             }

//             //nodes -> add in bucket
//             for(int i=0; i<oldBuck.length; i++){
//                 LinkedList<Node> ll = oldBuck[i];
//                 for(int j=0; j<ll.size(); j++){
//                     Node node = ll.remove();
//                     put(node.key, node.value);
//                 }
//             }
//         }

//         public void put(K key, V value){
//             int bi = hashFunction(key);
//             int di = SearchInLL(key,bi); //valid; -1

//             if (di != -1) {
//                 Node node = buckets[bi].get(di);
//                 node.value = value; //update
//             }else{
//                 buckets[bi].add(new Node(key,value));
//                 n++;
//             }

//             double lambda = (double)n/N;
//             if (lambda > 2.0) {
//                 rehash();
//             }
//         }
        
//         public boolean containsKey(K key){
//             int bi = hashFunction(key);
//             int di = SearchInLL(key,bi); 

//             if (di != -1) {
//                 return true;
//             }else{
//                 return false;
//             }
//         }

//         public V remove(K key){
//             int bi = hashFunction(key);
//             int di = SearchInLL(key,bi);

//             if (di != -1) {
//                 Node node = buckets[bi].remove(di);
//                 n--;
//                 return node.value;
//             }else{
//                 return null;
//             }
//         }

//         public V get(K key){
//             int bi = hashFunction(key);
//             int di = SearchInLL(key,bi); //valid; -1

//             if (di != -1) {
//                 Node node = buckets[bi].get(di);
//                 return node.value;
//             }else{
//                 return null;
//             }
//         }

//         public ArrayList<K> keySet(){
//             ArrayList<K> keys = new ArrayList<>();

//             for(int i=0; i<buckets.length; i++){
//                 LinkedList<Node> ll = buckets[i];
//                 for(Node node : ll){
//                     keys.add(node.key);
//                 }
//             }
//             return keys;
//         }

//         public boolean isEmpty(){
//             return n==0;
//         }
//     }
//     public static void main(String[] args) {
//             HashMap<String, Integer> hm = new HashMap<>();
//             hm.put("India", 100);
//             hm.put("China", 150);
//             hm.put("Usa", 10);
//             hm.put("German", 1);

//             ArrayList<String> keys = hm.keySet();
//             for (String key : keys) {
//                 System.out.println(key);
//             }
//         }
// }


//---->LinkedHashMap
// import java.util.*;
// public class Hashing {

//     public static void main(String[] args) {
//         LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
//         lhm.put("India",100);
//         lhm.put("China",150);
//         lhm.put("USA",10);
//         lhm.put("Nepal",4);
//         System.out.println(lhm);

//         HashMap<String,Integer> hm = new HashMap<>();
//         hm.put("India",100);
//         hm.put("China",150);
//         hm.put("USA",10);
//         hm.put("Nepal",4);
//         System.out.println(hm);
//     }
// }


//----->TreeHashMap
// import java.util.*;
// public class Hashing {

//     public static void main(String[] args) {
//         TreeMap<String,Integer> tm = new TreeMap<>();
//         tm.put("India",100);
//         tm.put("China",150);
//         tm.put("Usa",10);
//         tm.put("Nepal",4);
//         System.out.println(tm);

//         HashMap<String,Integer> hm = new HashMap<>();
//         hm.put("India",100);
//         hm.put("China",150);
//         hm.put("USA",10);
//         hm.put("Nepal",4);
//         System.out.println(hm);
//     }
// }