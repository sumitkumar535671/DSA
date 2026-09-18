// public class Tree {
//     public static class Node {
//          int val ;
//          Node left;
//          Node right;

//          public Node(int val){
//             this.val = val;
//          }
//     }

//     public static void display(Node root){
//         System.out.print(root.val + "->");
//         System.out.print(root.left.val + " ,");
//         System.out.print(root.right.val);
//     }

//     public static void main(String[] args){
//         Node root = new Node(1);
//         Node a = new Node(2);
//         Node b = new Node(3);

//         Node c = new Node(4);
//         Node d = new Node(5);

//         Node e = new Node(6);

//         root.left = a;
//         root.right = b;

//         a.left = c;
//         a.right = d;

//         b.right = e;

//         System.out.println(root.val);
//     }
// }

// import java.util.LinkedList;
// import java.util.Queue;

// public class Tree {
//     static class Node {

//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class BinaryTree{
//         static int idx = -1;

//         public static Node buildTree(int nodes[]){
//             idx++;
//             if(nodes[idx] == -1){
//                 return null;
//             }

//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);


//             return newNode;
//         }

//         public static void preorder(Node root){ //O(n)
//             if(root == null) return ;
//             System.out.print(root.data + " ");
//             preorder(root.left);
//             preorder(root.right);
//         }


//         public static void inorder(Node root){ //O(n)
//             if(root == null) return ;
//             inorder(root.left);
//             System.out.print(root.data + " ");
//             inorder(root.right);
//         }

//         public  static void postorder(Node root){
//             if(root == null){
//                 return ;
//             }

//             preorder(root.left);
//             preorder(root.right);
//             System.out.print(root.data + " ");
//         }

//         //Level order Traversal
//         public static void levelOrder(Node root){
//             if(root==null) return ;

//             Queue<Node> q = new LinkedList<Node>();
//             q.add(root);
//             q.add(null);

//             while (!q.isEmpty()) {
//                 Node currentNode = q.remove();

//                 if(currentNode == null){
//                     System.out.println();
//                     if(q.isEmpty()){
//                         break;
//                     }else{
//                         q.add(null);
//                     }
//                 }else{
//                     System.out.print(currentNode.data+" ");
//                     if(currentNode.left != null){
//                         q.add(currentNode.left);
//                     }
//                     if(currentNode.right != null){
//                         q.add(currentNode.right);
//                     }
//                 }
//             }

//         }
//     }
//     public static void main(String args[]){
//         int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

//         BinaryTree tree = new BinaryTree();

//         Node root = tree.buildTree(nodes);

//         tree.levelOrder(root);
//     }
// }

//----> Height of a tree

// public class Tree {

//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }
//     public static int height(Node root){
//         if(root == null) return 0;

//         int lh = height(root.left);
//         int rh = height(root.right);

//         int mainHeight = Math.max(lh, rh)+1;

//         return mainHeight;
//     }

//     public static void main(String[] args) {
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);

//         root.left.left = new Node(4);
//         root.left.right = new Node(5);

//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         System.out.println(height(root));
//     }
// }

//----> Count the number of nodes in a tree


// public class Tree {

//     static class Node {
//         int data;
//         Node left;
//         Node right;
         
//         Node(int data){
//             this.data = data;
//             this.left = left;
//             this.right = right;
//         }
//     }

//     public static int countNodes(Node root){
//         if(root == null) return 0;

//         int leftCount = countNodes(root.left);
//         int rightCount = countNodes(root.right);
//         int realCount = leftCount + rightCount + 1;

//         return realCount;
//     }

//     public static void main(String[] args) {
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(9);

//         System.out.println(countNodes(root));
//     }
// }


//-----> Sum of Nodes
// public class Tree {

//     static class Node {
//         int data;
//         Node left;
//         Node right;
//         Node(int data){
//             this.data = data;
//             this.left = left;
//             this.right = right;
//         }
//     }

//     public static int sumOfNodes(Node root){
//         if(root == null) {
//             return 0;
//         };

//         int leftSum = sumOfNodes(root.left);
//         int rightSum = sumOfNodes(root.right);
//         return leftSum + rightSum + root.data;
//     }

//     public static void main(String args[]){
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);

//         root.left.left = new Node(44);

//         System.out.println(sumOfNodes(root));
//     }
// }


//-----> Diameter of a tree

// public class Tree {

    // static class Node {
    //     int data;
    //     Node left, right;

    //     public Node(int data){
    //         this.data = data;
    //         this.left = null;
    //         this.right = null;
    //     }
    // }

//     public static int height(Node root){
//         if(root == null) return 0;

//         int lh = height(root.left);
//         int rh = height(root.right);

//         return Math.max(lh, rh) + 1;
//     }

//     public static int diameter(Node root){ //O(n^2)
//         if(root==null) return 0;

//         int leftDia = diameter(root.left);
//         int lh = height(root.left);
//         int rightDia = diameter(root.right);
//         int rh = height(root.right);

//         int selfDia = lh + rh + 1;

//         return Math.max(selfDia, Math.max(rightDia, selfDia));
//     }

//     static class Info {
//         int diam;
//         int ht;
//         public Info(int diam, int ht){
//             this.diam=diam;
//             this.ht = ht;
//         }
//     }

//     public static Info diameter2(Node root){//O(n)
//         if(root == null ){
//             return new Info(0, 0);
//         }

//         Info leftInfo = diameter2(root.left);
//         Info rightInfo = diameter2(root.right);

//         int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam),leftInfo.ht + rightInfo.ht +1);
//         int ht = Math.max(leftInfo.ht,rightInfo.ht) + 1;
//         return new Info(diam, ht);
//     }

//     public static void main(String[] args) {
//         Node root = new Node(1);

//         root.left = new Node(2);
//         root.right = new Node(3);
//         System.out.println(diameter2(root).ht);
//     }
// }


//-----> Subtree of another tree
public class Tree {

    static class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isIdentical(Node node, Node subRoot){
        if(node == null && subRoot == null){
            return true;
        }else if(node == null || subRoot == null || node.data != subRoot.data){
            return false;
        }

        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right, subRoot.right)){
            return false;
        }

        return true;
    }

    public static boolean isSubtree(Node root, Node subRoot){
        if(root == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        return isSubtree(root.left, subRoot)|| isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(isSubtree(root, subRoot));
    }
}