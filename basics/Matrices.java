// import java.util.*;
// public class Matrices {
//     public static void print(int matrix[][]){
//         int n=matrix.length;
//         int m=matrix[0].length;
//         int largest=Integer.MIN_VALUE;
//         Scanner sc = new Scanner(System.in);
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 matrix[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 System.out.print(matrix[i][j]+" ");
//                 if (matrix[i][j]>largest) {
//                     largest=matrix[i][j];
//                 }
//             }
//             System.out.println();
//         }System.err.println("the largest element is : "+ largest);

//     }

//     public static void main(String[] args) {
//         int matrix[][]=new int[3][3];
//         print(matrix);
//     }
// }

// import java.util.*;

// public class Matrices {
//     public static boolean search(int matrix[][],int key){
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                if(matrix[i][j]==key){
//                 System.out.println("found at cell ( "+i+","+j+")");
//                 return true;
//                }
//             }
//             System.out.println();
//         }
//         System.out.println("key not found");
//         return false;
//     }

//     public static void main(String[] args) {
//         int matrix[][] = new int[3][3];
//         int n = matrix.length,m = matrix[0].length;

//         Scanner sc = new Scanner(System.in);
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         //output 
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//         search(matrix, 5);
//     }
// }



//---->for max 

//--->spiral matrix code

// import java.util.*;
// public class Matrices {
//     public static void printSpiral(int matrix[][]){
//         int startRow = 0;
//         int startCol = 0;
//         int endRow = matrix.length-1;
//         int endCol = matrix[0].length-1;
//         while (startRow<=endRow&&startCol<=endCol) {
//             //top
//             for(int j=startRow;j<=endCol;j++){
//                 System.out.print(matrix[startRow][j]+" ");

//             }
//             //right
//             for(int i=startRow+1;i<=endRow;i++){
//                 System.out.print(matrix[i][endCol]+" ");
//             }
//             //bottom 
//             for(int j=endCol-1;j>=startCol;j--){
//                 if(startRow==endRow){
//                     break;
//                 }
//                 System.out.print(matrix[endRow][j] +" ");
//             }
//             //left
//             for(int i=endRow-1;i>=startRow+1;i--){
//                 if(startCol==endCol){
//                     break;
//                 }
//                 System.out.print(matrix[i][startCol]+" ");
//             }
//             startCol++;
//             startRow++;
//             endRow--;
//             endCol--;
//         }
//         System.out.println();


//     }

//     public static void main(String[] args) {
//         int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//         printSpiral(matrix);
//     }
// }



//----->Diagonal Sum.
// import java.util.*;

// public class Matrices {
//     public static void diagonalSum(int matrix[][]){
//         int sum=0;
//         int n=matrix.length;
        
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 if((i==j)||(i+j==n-1)){
//                  sum = sum+matrix[i][j];
//                 }
                
//             }
//         }System.out.println(sum);
//     }

//     public static void main(String[] args) {
//         int matrix[][] = {{1,2,3,0},{4,5,6,0},{7,8,9,0},{0,0,0,0}};
//         diagonalSum(matrix);
//     }
// }


//---->good apparoach for diagonal sum
// import java.util.*;
// public class Matrices {

//     public static int diagonalSum(int matrix[][]){
//         int sum=0;
//         int n=matrix.length;
//         for(int i=0;i<n;i++){
//             sum+=matrix[i][i];
//             if(i!=n-1-i)
//             sum+=matrix[i][n-i-1];
//         }return sum;

//     }
//     public static void main(String[] args) {
//         int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
//         System.out.println(diagonalSum(matrix));

//     }
// }



//---->search in sorted matrix
// import java.util.*;
// public class Matrices {
//     public static boolean staircaseSearch(int matrix[][],int key){
//          int row =0,col =matrix[0].length-1;
//          while ((row<matrix.length&&col>=0)) {
//             if(matrix[row][col]==key){
//                 System.out.println("found key at ("+row+","+col+")");
//                 return true;
//             }

//             else if(key<matrix[row][col]){
//                 col--;
//             }
//             else{
//                 row++;
//             }
//          }
//          System.out.println("key not found");
//          return false;
//     }

//     public static void main(String args[]) {
//         int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
//         int key = 32;
//         staircaseSearch(matrix, key);
//     }
// }



//----->FIND TRANSPOSE OF A MATRIX
// import java.util.Scanner;

// public class Matrices {

//     public static void findTranspose(int matrix[][],int r,int c){
//         int ans[][] = new int[c][r];

//         for(int i=0;i<c;i++){
//             for(int j=0;j<r;j++){
//                 ans[i][j]=matrix[j][i];
//             }
//         }

//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 System.out.print(ans[i][j] + " ");
//             }
//             System.out.println();
//         }

        

//     }

//     public static void print(int matrix[][]){
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter numbers of row and column");
//         int r = sc.nextInt();
//         int c=sc.nextInt();

//         int matrix[][]=new int[r][c];
        
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 matrix[i][j]=sc.nextInt();
//             }
//         }
//         System.out.println();
//         print(matrix);
//         findTranspose(matrix, r, c);
        

//     }
// }