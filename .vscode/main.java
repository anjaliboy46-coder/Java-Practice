// public class main{
//     public static void main(String[] args) {
//         System.out.println("Hello World");
//     }
// }
// import java.util.Scanner;
// public class main {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

        // float num1 = sc.nextFloat();   // reads first integer
        // float num2 = sc.nextFloat();   // reads second integer

        // float  sum = num1 + num2;     // calculates sum

        // System.out.println("Sum = " + sum);  // prints result
        //type casting explicit
        //int num=(int)(75.64);
        // System.out.println(num);
        // automatic type promotion in exoressions
    //     int a=257; // 257%256=1
    //     byte b=(byte)(a);
    //     System.out.println(b);
    //
    // byte a=40;
    // byte b=50;
    // byte c=100;
    // int d=(a*b)/c;
    // System.out.println(d);
    // int number='b';
    // System.out.println(number);
    //int number='A';
    //System.out.println("नमस्ते");
    //System.out.println("HELLO");
    //System.out.println(3*6);
    // byte b=42;
    // char c='a';
    // short s=1024;
    // int i=50000;
    // float f=5.67f;
    // double d=0.1234;
    // double result=(f*b)+(i/c)-(d-s);
    // System.out.println((f*b)+" "+(i/c)+" "+(d-s));
    // System.out.println(result);
    //int a=10;
    //if(a==10){
        //System.out.println("Hello World");   
    //}
    // while loop
    //int count =1;
    //while(count!=5){
        //System.out.println(count);
        //count++;
    //}
    //for loop
    //for(int count=1;count!=5;count++){
        //System.out.println(count);
    //}
    //temperature conversion
//     System.out.println("Please enter temp in c:");
//     float tempC=sc.nextFloat();
//     float tempF=(tempC*9/5)+32;
//     System.out.println(tempF);
//      }
// }
import java.util.*;

public class main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        String a = "anjali";
        String b = "Anjali";

        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
    }
}