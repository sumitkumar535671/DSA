// import java.util.*;
// public class Backtracking {
//     public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i] +" ");
//         }
//     }
//     public static void changeArr(int arr[],int i,int val){
//         //base case
//         if (i==arr.length) {
//             printArr(arr);
//             return;
//         }
//         //kaam(recursion)
//         arr[i]=val;
//         changeArr(arr, i+1, val+1); //fnx call step
//         arr[i]=arr[i]-2; //backtracking step
//     }

//     public static void main(String[] args) {
//         int arr[]=new int[5];
//         changeArr(arr, 0, 1);
//         System.out.println();
//         printArr(arr);
//     }
// }


//---->substring TC[O(n*2**n)]
// import java.util.*;
// public class Backtracking {
//     public static void subString(String str,String ans,int i){
//         if (i==str.length()) {
//             System.out.println(ans);
//             return;
//         }
//         //choice yes
//         subString(str, ans+str.charAt(i), i+1);
//         //choice no
//         subString(str, ans, i+1);
//     }

//     public static void main(String[] args) {
//         String str = "abc";
//         subString(str, "", 0);
//     }
// }



//----->Find & print all permutation of a string.  TC[O(n*n!)]

// import java.util.*;
// public class Backtracking {
//     public static void findPermutation(String str,String ans){
//         if (str.length()==0) {
//             System.out.println(ans);
//             return;
//         }
//         for(int i=0;i<str.length();i++){
//             char curr = str.charAt(i);  
//             //abcde => ab+de=abde
//             String Newstr =str.substring(0,i)+str.substring(i+1);
//             findPermutation(Newstr, ans+curr);
//         }
//     }

//     public static void main(String[] args) {
//         String str = "abc";
//         findPermutation(str, "");
//     }
// }



//---->N Queens  TC[O(n!)]
// import java.util.*;
// public class Backtracking {
//     public static boolean isSafe(char board[][],int row,int col){
//         //vertical up 
//         for(int i=row-1;i>=0;i--){
//             if (board[i][col]=='Q') {
//                 return false;
//             }
//         }
//         //diag left up
//         for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
//             if (board[i][j]=='Q') {
//                 return false;
//             }
//         }
//         //diag right up
//         for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
//             if (board[i][j]=='Q') {
//                 return false;
//             }
//         }

//         return true;
//     }
//     public static void nQueens(char board[][],int row){
//         //base
//         if (row==board.length) {
//             count++;
//             // printBoard(board);
//             return;
//         }
//         //column
//         for(int j=0;j<board.length;j++){
//             if (isSafe(board,row,j)) {
//                 board[row][j]='Q';
//                 nQueens(board, row+1); //function call
//                 board[row][j]='x';//backtracking step
//             }
//         }
//     }

//     public static void printBoard(char board[][]){
//         System.out.println("----chess board");
//         for(int i=0;i<board.length;i++){
//             for(int j=0;j<board.length;j++){
//                 System.out.print(board[i][j] +" ");
//             }
//             System.out.println();
//         }
//     }

//     static int count = 0;
//     //recursion call by value hoti hai .ydi main parameter du to her 
//     //call me nya parameter bnega 
//     public static void main(String[] args) {
//         int n=5;
//         char board[][] = new char[n][n];
//         //initialize
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 board[i][j]='x';
//             }
//         }
//         nQueens(board, 0);
//         System.out.println("total ways to solve n queens = " + count);
        
//     }
// }


//---->check if problem can be solved & print only 1 solution to N Queens problem.
// import java.util.*;
// public class Backtracking {
//     public static boolean isSafe(char board[][],int row,int col){
//         //vertical up 
//         for(int i=row-1;i>=0;i--){
//             if (board[i][col]=='Q') {
//                 return false;
//             }
//         }
//         //diag left up
//         for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
//             if (board[i][j]=='Q') {
//                 return false;
//             }
//         }
//         //diag right up
//         for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
//             if (board[i][j]=='Q') {
//                 return false;
//             }
//         }

//         return true;
//     }
//     public static boolean nQueens(char board[][],int row){
//         //base
//         if (row==board.length) {
//             count++;
//             // printBoard(board);
//             return true;
//         }
//         //column
//         for(int j=0;j<board.length;j++){
//             if (isSafe(board,row,j)) {
//                 board[row][j]='Q';
//                 if(nQueens(board, row+1)){
//                     return true;
//                 } 
//                 board[row][j]='x';//backtracking step
//             }
//         }
//         return false;
//     }

//     public static void printBoard(char board[][]){
//         System.out.println("----chess board");
//         for(int i=0;i<board.length;i++){
//             for(int j=0;j<board.length;j++){
//                 System.out.print(board[i][j] +" ");
//             }
//             System.out.println();
//         }
//     }

//     static int count = 0;
//     //recursion call by value hoti hai .ydi main parameter du to her 
//     //call me nya parameter bnega 
//     public static void main(String[] args) {
//         int n=5;
//         char board[][] = new char[n][n];
//         //initialize
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 board[i][j]='x';
//             }
//         }
//         if(nQueens(board, 0)){
//             System.out.println("solution is possible");
//             printBoard(board);
//         }else{
//             System.out.println("solution is not possible");
//         }
        
        
//     }
// }


//---->Grid Ways
// import java.util.*;
// public class Backtracking {
//     public static int gridWays(int i, int j, int n, int m){
//         //base
//         if((i==n-1)&&(j==m-1)){ //condition for last cell
//             return 1;
//         }else if(i==n || j==m){ //boundary cross conditon
//             return 0;
//         }
//         //kaam
//         int right = gridWays(i, j+1, n, m);
//         int down = gridWays(i+1, j, n, m);
//         int total = right+down;
//         return total;
//     }

//     public static void main(String[] args) {
//         int n=3,m=3;
//         System.out.println(gridWays(0, 0, n, m));
//     }
// }


//---->Sudoku problem

// import java.util.*;
// public class Backtracking {
//     public static boolean sudokuSolver(int sudoku[][] , int row, int col){
//         //base case
//         //recursion
//         int nextRow = row,nextCol = col+1;
//         if (col+1==9){
//             nextRow = row+1;
//             nextCol=0;
//         } 

//         if (sudoku[row][col]!=0) {
//             return sudokuSolver(sudoku, nextRow, nextCol);
//         }

//         for(int digit=1; digit<=9; digit++){
//             if(isSafe(sudoku,row,col,digit)){
//                 sudoku[row][col] = digit;
//                 if(sudokuSolver(sudoku, nextRow, nextCol)){//soln exists
//                     return true;
//                 }
//                 sudoku[row][col] = 0;
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         int sudoku[][] ={{0,0,8,0,0,0,0,0,0},
//         {4,9,0,1,5,7,0,0,2},
//         {0,0,3,0,0,4,1,9,0},
//         {1,8,5,0,6,0,0,2,0},
//         {0,0,0,0,2,0,0,6,0},
//         {9,6,0,4,0,5,3,0,0},
//         {0,3,0,0,7,2,0,0,4},
//         {0,4,9,0,3,0,0,5,7},
//         {8,2,7,0,0,9,0,1,3}};
//     }
// }