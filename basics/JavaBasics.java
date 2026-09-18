// import java.util.*;

// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String input = sc.nextLine();
//         System.out.println(input);

        
//     }
// }




// import java.util.*;

// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int pro = a*b;
//         System.out.println(pro);

        
//     }
// }


// import java.util.*;

// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         float a = sc.nextFloat();
        
        
//         float area =3.14f*a*a ;
//         System.out.println(area);

        
//     }
// }


// import java.util.*;

// public class JavaBasics{
//     public static void main(String args[]){
//         char a = 'a';
//         char b = 'b';
//         System.out.println((int)(b));
//         System.out.println((int)(a));
        
//         System.out.println(b-a);

        
//     }
// }


// import java.util.*;

// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         float a = sc.nextFloat();
//         float b = sc.nextFloat();
//         float c = sc.nextFloat();
//         float avg = (a+b+c)/3;
        
//         System.out.println(avg);
        
//     }
// }


// import java.util.*;

// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int area = a*a;
        
//         System.out.println(area);
        
//     }
// }


// import java.util.*;

// public class JavaBasics{
//     public static void main(String args[]){
//         int a =10;
//         int b = ++a;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }


// import java.util.*;

// public class JavaBasics{
//     public static void main(String args[]){
//         int a =10;
//         int b = a++;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }


// import java.util.*;

// public class JavaBasics{
//     public static void main(String args[]){
//         int a =10;
//         int b = --a;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }


// import java.util.*;

// public class JavaBasics{
//     public static void main(String args[]){
//         int a =10;
//         int b = a--;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }


// public class JavaBasics {
//     public static void main (String args[]){
//         int age = 22;
//         if (age>=18) {
//             System.out.println("adult :drive,vote, drink");
//         }
//         else{
//             System.out.println("not adultjava JavaBasics.java");
//         }
//     }
// }

// import java.util.Scanner;

// public class JavaBasics {
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         if(num%2==0){
//             System.out.println("number is even" + " " + num);
//         }else{
//             System.out.println("number is odd" +" "+ num);
//         }
//     }
// }


// public class JavaBasics {
//     public static void main (String args[]){
        
//         int a =1;
//         int b = 0;
//         int c = 7;

//         if((a>=b)&&(a>=c)){
//             System.out.println(a);
//         }else if(b>=c){
//             System.out.println(b);
//         }else{
//             System.out.println(c);
//         }
//     }
// }


//ternary operator-->

// public class JavaBasics{
//     public static void main(String args[]){
//         int number = 90;
//         String type = ((number%2)==0)? "even":"odd";
//         System.out.println(type);
//     }
// }


//---> calculator

// import java.util.Scanner;

// public class JavaBasics {
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a :");
//         int a = sc.nextInt();
//         System.out.println("enter b :");
//         int b = sc.nextInt();
//         System.out.println("enter operator :");
//         char operator = sc.next().charAt(0);

//         switch (operator) {
//             case '+': System.out.println(a+b);  
//                 break;
//             case '-': System.out.println(a-b);
//                 break;
//             case '*': System.out.println(a*b);
//                 break;
//             case '/': System.out.println(a/b);
        
//             default: System.out.println("sorry brother");
//                 break;
//         }
//     }
// }

//-----> while loop
// import java.util.*;

// public class JavaBasics {
//     public static void main (String args []){
//         int counter = 0;
//         while (counter<10) {
//             System.out.println("Hello World");
//             counter++;
//         }
//         System.out.println("printed HW 10x");
//     }
// }



// import java.util.*;

// public class JavaBasics {

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int sum = 0;
//         int i=1;
//         while (i<=n) {
//             sum+=i;
//             i++;
//         }
//         System.out.println(sum);
//     }
// }




//---->print reverse of a number

// import java.util.*;

// public class JavaBasics{
//     public static void main(String args[]) {
//         int n = 10899;

//         while (n>0) {
//             int lastDigit = n%10;
//             System.out.print(lastDigit);
//             n = n/10;
            
//         }
        
//     }
// }


//---> reverse the given number 

// import java.util.*;

// public class JavaBasics{
//     public static void main (String args[]){
//         int n = 10899;
//         int rev = 0;

//         while (n>0) {
//             int lastDigit = n%10;
//             rev = (rev*10)+lastDigit;
//             n = n/10;
//         }
//         System.out.println(rev);
//     }
// }


//--->keep entring numbers till user enters a multiple of 10;


// import java.util.*;

// public class JavaBasics{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         do{
//             System.out.print("enter your number :");
//             int n = sc.nextInt();
//             if (n%10==0) {
//                 break;
//             }
//             System.out.println(n);
//          } while (true) ;
                
            
        
//     }
// }



// import java.util.*;

// public class JavaBasics{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
        
            
//           while (true){
//             System.out.print("enter your number :");
//             int n = sc.nextInt();
//             if (n%10==0) {
//                 break;

//           }
//           System.out.println(n);
                
            
        
//     }
// }}



//--->display all numbers entered by user except multiples of 10

// import java.util.*;

// public class JavaBasics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         do{
//             System.out.print("enter your number :");
//             int n = sc.nextInt();
//             if (n%10==0) {
//                 continue;
//             }
//             System.out.println("number was :" + n);
//         }while(true);
//     }
// }


//--->check if a number is prime or not 

// import java.util.*;

// public class JavaBasics{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         if (n==2) {
//             System.out.println("n is prime");
//         }else{
//         boolean isPrime = true;
//         for(int i=2;i<=Math.sqrt(n);i++){
//             if (n%i==0) {
//                isPrime = false; 
//             }
//         }
//         if (isPrime == true) {
//             System.out.println("n is prime");
//         }else{
//             System.out.println("n is not prime");
//         }
//         }
        
//     }
// }




// public class JavaBasics{
//     public static void main(String[]args){
//         for(int i=0;i<=5;i++) {
//             System.out.println("Hello");
//             i+=2;}
//         }
//     }



// import java.util.*;

// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         if(num >0){
//             System.out.println("number is positive");
//         }else{
//            System.out.println("number is negative"); 
//         }
//     }

    
// }


// import java.util.*;

// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter week number (1-7): ");

//         int week = sc.nextInt();
//         switch(week){
//         case 1:
//             System.out.println("Monday");
//             break;
//         case 2:
//             System.out.println("Tuesday");
//             break;
//         case 3:
//             System.out.println("Wednesday");
//             break;
//         case 4:
//             System.out.println("Thersday");
//             break;
//         case 5:
//             System.out.println("Friday");
//             break;
//         case 6:
//             System.out.println("Saterday");
//             break;
//         case 7:
//             System.out.println("Sunday");
//             break;

//         default : 
            
//                System.out.println("Invalid input ! Please try again");

            
//         }
//     }
// }


// import java.util.*;

// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int year = sc.nextInt();
//         boolean x = (year%4)==0;
//         boolean y = (year%100)!=0;
//         boolean z = ((year%100==0)&&(year%400==0));

//         if(x&&(y||z)){
//           System.out.println(year + "is a leap year");
//         }else{
//             System.out.println(year + " is not a leap year");
//         }
//     }
// }


//Question 1 :How many times 'Hello' is printed?

// public class JavaBasics{
//     public static void main(String[]args){
//         for(int i=0;i<5;i++) {
//             System.out.println("Hello");
//             i+=2;
//         }}}


//Question2:Write a program that reads a set of integers,and then prints the sum of the even and odd integers.

// import java.util.Scanner;
// public class JavaBasics{
//     public static void main(String[]args) {
//         Scanner sc=new Scanner(System.in);
//         int number;
//         int choice;
//         int evenSum=0;
//         int oddSum=0; 
//         do{
//             System.out.print("Enter the number ");
//             number=sc.nextInt();
//             if(number%2==0) {
//                 evenSum+=number;
//             }else{
//                 oddSum+=number;
//             }
//             System.out.print("Do you want to continue ? Press 1 for yes or for no");
//             choice=sc.nextInt();
//         }
//         while(choice==1);
//         System.out.println("Sum of even numbers: "+evenSum);System.out.println("Sum of odd numbers: "+oddSum);
//     }
// }


//patern---> Nested Loop

// import java.util.*;

// public class JavaBasics{
//     public static void main(String args[]){
//         for(int line = 1 ;line<=4;line++){
//             for(int star = 1;star<=line;star++){
//                 System.out.print("*");
//             }
//              System.out.println();
//         }
//     }
// }


// import java.util.*;

// public class JavaBasics{
//     public static void main(String args[]){
//         for(int line = 1 ;line<=4;line++){
//             for(int star = 1;star<=4-line+1;star++){
//                 System.out.print("*");
//             }
//              System.out.println();
//         }
//     }
// }



// import java.util.*;

// public class JavaBasics{
//     public static void main(String args[]){
//         for(int line = 1 ;line<=12;line++){
//             for(int number = 1;number<=line;number++){
//                 System.out.print(number);
//             }
//              System.out.println();
//         }
// }
// }




// import java.util.*;

// public class JavaBasics{
//     public static void main(String args[]){
//         int n = 4;
//         char ch = 'A';
//         for(int i = 1 ;i<=4;i++){
//             for(int j = 1;j<=i;j++){
//                 System.out.print(ch);
//                 ch++;
//             }
//              System.out.println();
//         }
//     }
// }



//--->  Functions

// import java.util.*;

// public class JavaBasics {
//     public static void printSum(){
//       Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a+b;
//         System.out.println("sum is :"+sum);
//     }
//     public static void main(String args[]) {
//        printSum();
//     }
// }


// import java.util.*;

// public class JavaBasics {
//     public static int calculateSum(int num1,int num2){
//       int sum = num1+num2;
//       return sum;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = calculateSum(a, b);
//         System.out.println("sum is :"+sum);
//         calculateSum(a,b);
//     }
// }

//---> swap --value

// import java.util.*;
// public class JavaBasics {

//      public static void swap(int a,int b){
//        int temp = a;
//        a = b;
//        b = temp;
//       System.out.println("a = " + a);
//        System.out.println("b = " + b); 
//      }

//      public static void main(String[] args) {
        
//         int a=5;
//         int b=9;
//         swap(a, b);
       
//      }
//     }




// import java.util.*;
// public class JavaBasics {

//      public static int  multiply(int a,int b){
//       int product = a*b;
//        return product;
//      }

//      public static void main(String args[]) {
        
//         int a=8;
//         int b=9;
//         int prod = multiply(a, b);
//         System.out.println("a*b =" +prod);
//         prod = multiply(20,20);
//         System.out.println("a*b="+prod);
       
//      }
//     }


//---->fatorial of a number n

// import java.util.*;

// public class JavaBasics {

//     public static int factorial(int n){
//       int f =1;

//       for(int i=1;i<=n;i++){
//          f = f*i;
//       }
//       return f;//factorial of n
      
//     }
//     public static void main(String args[]) {
        
//      System.out.println(factorial(5));   
//     }

// }




//----> Binomial Coefficient


// import java.util.*;

// public class JavaBasics {

//     public static int factorial(int n){
//       int f =1;

//       for(int i=1;i<=n;i++){
//          f = f*i;
//       }
//       return f;//factorial of n
      
//     }
    

//     public static int binCoeff(int n,int r){
//     int fact_n = factorial(n);
//     int fact_r = factorial(r);
//     int fact_nmr = factorial(n-r);

//     int binCoeff = fact_n/(fact_r*fact_nmr);
//     return binCoeff;
//     }
//     public static void main(String args[]) {
//         System.out.println(binCoeff(5, 0));
//     }
// }


//---->isPrime or not

// import java.util.*;
// public class JavaBasics {

//     public static boolean isPrime(int n){
//         if(n==2){
//             return true;
//         }
//         for(int i=2;i<=Math.sqrt(n);i++){
//             if(n%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String args[]) {
//         System.out.println(isPrime(7));
//     }
// }



//---->Print all Primes in a range

// import java.util.*;
// public class JavaBasics {

//     public static boolean isPrime(int n){
//         if(n==2){
//             return true;
//         }
//         for(int i=2;i<=Math.sqrt(n);i++){
//             if(n%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void primesInRange(int n){
//         for(int i=2;i<=n;i++){
//             if(isPrime(i)==true){
//                 System.out.print(i+" ");
//             }
//         }
//         System.out.println();
//     }
//     public static void main(String args[]) {
//         primesInRange(10);
//     }
// }



//---->Convert from Binary to Decimal

// import java.util.*;

// public class JavaBasics {

//     public static void binToDes(int binNum){
//       int myNum = binNum;
//       int pow = 0;
//       int decNum = 0;
//       while (binNum >0) {
//         int lastDigit = binNum % 10;
//         decNum = decNum + (lastDigit*(int)Math.pow(2,pow));

//         pow++;
//         binNum = binNum/10;
//       }
//       System.out.println("decimal of " +myNum+ " = "+decNum);
//     }

//     public static void main(String[] args) {
//       binToDes(100001101);
//     }
// }


//---->Convert from Decimal to Binary;

// import java.util.*;

// public class JavaBasics {

//     public static void desToBin(int n){
//       int my = n;
//       int pow = 0;
      
//       int biNum = 0;
//       while (n >0) {
//         int rem = n%2;
//         biNum = biNum +(rem*(int)Math.pow(10,pow)) ;
//         pow++;
//         n=n/2;
//         }
//       System.out.println("binary of " + my + " = "+biNum);
//     }

//     public static void main(String[] args) {
//       desToBin(53);
//     }
// }


//---->Question 1 :Write a Java method to compute the average of three numbers.

// import java.util.*;

// public class JavaBasics {

//   public static float average(float a,float b,float c){
//         return (a+b+c)/3;
//   }
//   public static void main(String[] args) {
//     System.out.println(average(3,4,4));
//   }
// }


//---->Question2:Write a method named is Even that accepts an int argument.The method should return true if the argument is even,or false otherwise.Also write a program to  test your method.

// import java.util.*;

// public class JavaBasics {

//   public static void isEven(int n){
//    if(n%2==0){
//     System.out.println(n + " "+"is even");
//    }else{
//     System.out.println(n +" "+ "is not even");
//    }
//   }

//   public static void main(String[] args) {
//     isEven(8);
//   }
// }


//---->Question 3:Write a Java program to check if a number is a palindrome in Java?

// import java.util.*;

// public class JavaBasics {

//   public static void main(String[] args) {
//     System.out.println("Please Enter a number : ");
//     Scanner sc = new Scanner(System.in);
//     int palindrome = sc.nextInt();
//     if(isPalindrome(palindrome)){
//       System.out.println("Number : "+palindrome+"is a palindrome");
//     }else{
//       System.out.println("Number :"+palindrome+"is not a palindrome");
//     }
    
//   }

//   public static boolean isPalindrome(int number){
//     int palindrome = number;
//     int reverse = 0;
//     while(palindrome!=0){
//       int remainder = palindrome % 10 ;
//       reverse = reverse * 10 + remainder;
//       palindrome = palindrome/10;
//     }
//     if(number==reverse){
//       return true;
//     }
//     return false;
//   }
// }


//Question 5: Write a Java method to compute the sum of the digits in an integer.

// import java.util.*;

// public class JavaBasics {
//   public static int mySum(int number){
//     int sum = 0;
//     while (number>0) {
//      int remainder = number%10;
//      sum = sum+remainder;
//      number = number/10;
//     }
    
//     return sum;
//   }

//   public static void main(String[] args) {
//    System.out.println(mySum(45));
//   }
// }


//---->Print Hollow Rectangle Pattern

// import java.util.*;

// public class JavaBasics {

//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){

//             for(int j=1;j<=5;j++){
//              if(((i==2)||(i==3))&&((j==2)||(j==3)||(j==4))){
//                 System.out.print(" ");
//              }else{
//                 System.out.print("*");
//              }
//             }
//             System.out.println();
//         }
//     }
// }


// import java.util.*;
// public class JavaBasics {

//     public static void hollow_rectangle(int totRows,int totCols){
//         for(int i=1;i<=totRows;i++){
//             for(int j=1;j<=totCols;j++){
//                 if(i==1||i==totRows||j==1||j==totCols){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         hollow_rectangle(12,13);
//     }
// }



// import java.util.*;

// public class JavaBasics {

//     public static void inverted_rotated_half_pyramid(int n){
//         //outer
//         for(int i=1;i<=n;i++){
//             //spaces
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             //stars
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//       inverted_rotated_half_pyramid(4);  
//     }
// }


// import java.util.*;

// public class JavaBasics {

//     public static void inverted_half_pyramid_with_numbers(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i+1;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         inverted_half_pyramid_with_numbers(4);
//     }
// }



// import java.util.*;

// public class JavaBasics {

//     public static void floydsTriangle(int n){
//         int sum =1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
                

//                 System.out.print(sum +" ");
//                 sum=sum+1;
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         floydsTriangle(4);
//     }
// }



// import java.util.*;

// public class JavaBasics {

//     public static void zero_one_triangle(int n){
        
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                if((i+j)%2==0) {
//                 System.out.print("1");
//                }else{
//                 System.out.print("0");
//                }

                
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//        zero_one_triangle(4);
//     }
// }


 
// import java.util.*;
// public class JavaBasics {

//     public static void butterfly(int n){
//         //1st half
//         for(int i=1;i<=n;i++){
//             //stars--i
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             //spaces--2*(n-i)
//             for(int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             //stars -i
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         //2nd half
//         for(int i=n;i>=1;i--){
//             //stars--i
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             //spaces--2*(n-i)
//             for(int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             //stars -i
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }


//     }
//     public static void main(String[] args) {
//         butterfly(4);
//     }
// }




//---->Rhombus



// import java.util.*;

// public class JavaBasics {

//     public static void solid_rhombus(int n){
//         for(int i=1;i<=n;i++){
//             //spaces
//             for(int j=1;j<=(n-i);j++){
//                 System.out.print(" ");
//             }
//             //stars
//             for(int j=1;j<=n;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         solid_rhombus(7);
//     }
// }




//---->Hollow rhombus

// import java.util.*;

// public class JavaBasics {
//     public static void hollow_rhombus(int n){
//         for(int i=1;i<=n;i++){
//             //spaces
//             for(int j=1;j<=(n-i);j++){
//                 System.out.print(" ");
//             }
//             //hollow rectanle-stars
//             for(int j=1 ;j<=n;j++){
//                 if(i==1||i==n||j==1||j==n){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         hollow_rhombus(7);
//     }
// }




//---->Diamond Pattern

// import java.util.*;

// public class JavaBasics {

//     public static void diamond_pattern(int n){
//         for(int i=1; i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         for(int i=n; i>0;i--){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=(2*i)-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         diamond_pattern(4);
//     }
// }