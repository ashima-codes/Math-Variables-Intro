

class Main {
  public static void main(String[] args) {

    //Use the // to create single line comments to either add info or to take out code for debugging

    System.out.println("Hello world!");

    //We will be using System.out.println and System.out.print throughout the year. Try using both below to see what the difference is!
     System.out.println("hi");
     System.out.print("hello");

    //ANSWER: 
    // System.out.println moves to the next line System.out.print doesn't.

    //Throughout the year this year we will need to store information. For that we will be using VARIABLES!

    //Java is an Object-Oriented programming language. All variables we use this year will either be OBJECTS or PRIMITIVES

    //There are 8 primitives in Java: int, byte, short, long, float, double, boolean, char

    //For AP we need to know: int, double, boolean

    //List examples of the types below and give definition
    //int (integer): 
    //double:
    //boolean:

    //For now we are just going to work with primitive

    //Create 3 variables of each of the above types (USE GOOD CODING PRACTICE WHEN CREATING THE VARIABLES
    int number = 3;
    double decimal = 4.5;
    boolean trueOrFalse = true;
    int number1, num2, num3, num4, num5, num6, num7, num8, num9 = 7;
    number1 = 6;
    num2 = 4;
    num3 = 5;
    num4= 7;
    num5 = 7;
    num6 = 3;
    System.out.println(num5);
    System.out.println("My favorite number is " + number1 );


    //MATH TIME!

    //What are the math operators that we can use?
    //+ - * / %

    //Try doing some math operations with numbers. How can we check to see if the math worked?
System.out.println("3+6 = ?, 8*4 = ?, 7%3 = ?, 6-8 = ?");
   System.out.println((3 + 6) + ", " + (8 * 4) + ", " + (7 % 3) + ", " + (6 - 8));
   System.out.println("The average of 6,2, and 9:" + (6+2+9)/3);


    //Create codes that will print the following:

    //Odd integers from 1 to 100, inclusive of both

System.out.println("Odd integers from 1 to 100:");
for ( int i = 0; i < 101; i++) {
    if ( i%2 != 0) {
        System.out.println(i);}
}

    //All multiples of 3 from 1 to 100
System.out.println("All multiples of 3 from 1 to 100:");
for ( int j = 1; j < 101; j++) {
    if ( j%3 == 0) {
        System.out.println(j);}
}


    //Starting at 1000, print on the same line (with a - [hypthen] between each) all of the numbers that end in 0 going down to 0
System.out.print("Starting at 1000, print on the same line /n (with a - [hypthen] between each) all of the numbers that end in 0 going down to 0");
for (int a = 1000; a <= 0; a--);
    if ( a%10 == 0 ){
        System.out.print(a + "-");
    }

  }
}
