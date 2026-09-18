// public class OOPS {
//     public static void main(String[] args) {
//         Pen p1 = new Pen();//created a pen object called p1
//         // p1.setColor("Blue");
//         // System.out.println(p1.color);
//         // p1.color="Yellow";
//         // System.out.println(p1.color);
        

//         p1.setColor("Blue");
//         System.out.println(p1.getColor());

//         p1.setColor("Yellow");
//         System.out.println(p1.getColor());


//         // BankAccount myAcc = new BankAccount();
//         // myAcc.username = "sumitKumar";
//         // myAcc.setPassword("abcd");
//     }
    
// }

// class Pen {
//     private String color;
//     int tip;

//     String getColor(){
//         return this.color;
//     }

//     void setColor(String newColor){
//         color = newColor;
//     }

//     void setTip(int newTip){
//         tip = newTip;
//     }
// }


// class BankAccount{
//     public String username;
//     private String password;
//     public void setPassword(String pwd){
//         password = pwd;
//     }
// }


// public class OOPS {

//     public static void main(String[] args) {
//         Pen p1 = new Pen();
//         p1.setColor("blue");
//         System.out.println(p1.getColor());
//     }
// }


// class Pen {
//     private String color;

//     String getColor(){
//         return this.color;
//     }

//     void setColor(String color){
//         this.color = color;
//     }

// }



// public class OOPS {

//     public static void main(String[] args) {
//         Student s1 = new Student();
//         Student s2 = new Student("sumit");
//         Student s3 = new Student(123);//constructor overloading---->polymorphism
//     }
// }

// class Student {
//     String name ;
//     int roll ;
//     Student(){
//         System.out.println("construction is called...");
//     }
//     Student(String name){
//         this.name = name;
//     }
//     Student(int roll){
//         this.roll = roll;
//     }
// }


//----->copy constructor

// public class OOPS {

//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name = "sumit";
//         s1.roll = 456;
//         s1.password = "abcd";
//         // Student s2 = new Student(s1);
//         // s2.password = "xyz";
//         s1.marks = new int[3];
//         s1.marks[0] = 100;
//         s1.marks[1] = 90;
//         s1.marks[2] = 80;

//         Student s2 = new Student(s1);//copy
//         s2.password ="xyz";
//         s1.marks[2] = 100;
//         for(int i=0;i<3;i++){
//             System.out.println(s2.marks[i]);
//         }

//     }
// }

// class Student {
//     String name;
//     int roll;
//     String password;
//     int marks[];
// //shallow copy constructor
//     // Student (Student s1){
//     //     marks = new int[3];
//     //     this.name=s1.name;
//     //     this.roll = s1.roll;
//     //     this.marks = s1.marks;
//     // }


// //Deep copy constructor

//     Student (Student s1){
//           marks = new int[3];
//           this.name =s1.name;
//           this.roll = s1.roll;
//           for(int i=0;i<marks.length;i++){
//             this.marks[i] = s1.marks[i];
//           }

//     }

//     Student(){
        
//     }
// }



//--->Inheritance

// public class OOPS {

//     public static void main(String[] args) {
//         Fish shark = new Fish();
//         shark.eat();
//     }
// }

// //Base class
// class Animal {
//     String color;
//     void eat(){
//         System.out.println("eats");
//     }

//     void breathe(){
//         System.out.println("breathes");
//     }
// }

// //Derived class/subclass
// class Fish extends Animal {
//     int fins;
//     void swim(){
//         System.out.println("swim in water");
//     }
// }



// public class OOPS {

//     public static void main(String[] args) {
//         Calculator calc = new Calculator();
//         System.out.println(calc.sum(1, 3));
//         System.out.println(calc.sum(1.9f, 3.0f));
//         System.out.println(calc.sum(1, 3,9));


//         Deer d = new Deer();
//         d.eat();
//     }
// }
// //method overloadig
// class Calculator{
//     int sum(int a,int b){
//         return a + b;
//     }

//     float sum(float a,float b){
//         return a + b;
//     }

//     int sum(int a,int b,int c){
//         return a + b + c;
//     }
// }
// //method overriding
// class Animal {
//     void eat(){
//         System.out.println("eat anything");
//     }
// }

// class Deer extends Animal{
//     void eat(){
//         System.out.println("eats grass");
//     }
// }


//Abstract Classes

// public class OOPS {

//     public static void main(String[] args) {
//         //Horse h = new Horse();
//         // h.eat();
//         // h.walk();

//         // Chicken c = new Chicken();
//         // c.eat();
//         // c.walk();

//         Mustang m = new Mustang();

//     }
// }

// abstract class Animal{
//     String color ;
//     Animal (){
//         color ="brown";
//         System.out.println("animal constructor called");
//     }

//     void eat(){
//         System.out.println("animal eats");
//     }
//     abstract void walk();
// }

// class Horse extends Animal{
//     Horse(){
//         System.out.println("Horse constructor called");
//     }
//     void changeColor(){
//         color = "dark brown";
//     }
//     void walk(){
//         System.out.println("walks on 4 legs");
//     }
// }
// class Mustang extends Horse{
//     Mustang(){
//         System.out.println("Mustang constructor called");
//     }
// }

// class Chicken extends Animal{
//     void walk(){
//         System.out.println("walks on 2 legs");
//     }
// }



//----->INTERFACE

// public class OOPS {

//     public static void main(String[] args) {
//         Queen q = new Queen();
//         q.moves();
//     }
// }

// interface ChessPlayer{
//     void moves();
// }


// class Queen implements ChessPlayer{
//     public void moves(){
//         System.out.println("up,down,left,right  (in all directions)");
//     }

// }

// class Rook implements ChessPlayer{
//     public void moves(){
//         System.out.println("up,down,left,right");
//     }

// }

//-----> MULTIPLE INHERITANCES
// interface Herbivore {

// }

//  interface Carnivore {

    
// }

// class Bear implements Herbivore,Carnivore{

// }



//---->static key word
// public class OOPS {

    

// public static void main(String args[]){
//     Student s1 = new Student();
//     s1.schoolName="JMV";
    
//     Student s2 = new Student();
//     System.out.println(s2.schoolName);

//     Student s3 = new Student();
//     s3.schoolName="ABC";
// }

// }

// class Student {
//     String name;
//     int rool;
//     static String schoolName;

//     void setName(String name){
//         this.name=name;
//     }
//     String getName(){
//         return this.name;
//     }
// }



//----->Super keyword

// public class OOPS {

//     public static void main(String[] args) {
//         Horse h = new Horse();
//         System.out.println(h.color);
//     }
// }

// class Animal {
//     String color;
//     Animal(){
//         System.out.println("animal constructor is called");
//     }
// }

// class Horse extends Animal {
//     Horse(){
//         super.color="red";
//         System.out.println("horse constructor is called");
//     }
// }