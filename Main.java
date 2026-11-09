//hello world
//public class Main{
    //public static void main(String[] args) {
        //System.out.println("Hello World");
    //}
//}
//?basic
//import java.util.Scanner;
//public class Main{
    //public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        //System.out.println("Enter your name:");
        //String name=sc.nextLine();
        //System.out.println("Enter your age:");
        //int age=sc.nextInt();
        //System.out.println("hello " +name+", you are " +age+ "years old.");
    //}
//}
//?even or odd
//import java.util.Scanner;
//public class Main{
    //public static void main(String[] args){
        //Scanner sc=new Scanner(System.in);
        //System.out.println("Enter a number:");
        //int num=sc.nextInt();
        //if(num%2==0){
            //System.out.println(num + " is Even");
        //}else{
            //System.out.println(num + " is odd");
        //}
    //}
//}
//?sum
//import java.util.Scanner;
//public class Main{
    //public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        //System.out.println("Enter n:");
        //int n=sc.nextInt();
        //int sum=n*(n+1)/2;
        //System.out.println("sum="+sum);
    //}
//}
//?Declaring a String Array
//You can declare a String array in two main ways:
// ?Method 1: Declare with size
//String[] names = new String[5];  // Array of 5 strings
// ?Method 2: Declare and initialize directly
//String[] fruits = {"Apple", "Banana", "Cherry", "Mango"};
//?2. Assigning Values
//If you declare with size, you can assign values later:
//names[0] = "Alice";
//names[1] = "Bob";
//names[2] = "Charlie";
//names[3] = "David";
//names[4] = "Eva";
//3. Accessing Values
//?Use the index (starting from 0) to access elements:
//System.out.println(names[0]);  // Prints Alice
//System.out.println(fruits[2]); // Prints Cherry
//?4. Looping Through String Arrays
//You can use a for loop or for-each loop:
// Using for loop
//for (int i = 0; i < fruits.length; i++) {
//System.out.println(fruits[i]);
//}
//?Using for-each loop
//for (String fruit : fruits) {
    //System.out.println(fruit);
//}
//?Taking Input into a String Array
//You can use Scanner to fill a String array with user input:
//import java.util.Scanner;
//public class Main {
    //public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //String[] cities=new String[3];
        //System.out.println("Enter cities:");
        //for(int i=0;i<cities.length;i++){
        //cities[i]=sc.nextLine();
    //} 
    //System.out.println("You entered:");
    //for(String city:cities){
    //System.out.println(city); 
    //} 
//}  
//}  
//for n number of cities
//import java.io.StringReader;
//import java.util.Scanner;
//public class Main{
    //public static void main(String[] args){
        //Scanner sc=new Scanner(System.in);
        //System.out.println("How many cities do you want to enter:");
        //int n=sc.nextInt();
        //sc.nextLine();
        //String[] cities=new String[n];
        //System.out.println("Enter " + n + " cities:");
        //for(int i=0;i<cities.length;i++){
            //cities[i]=sc.nextLine();
        //}
        //System.out.println("You Entered:");
        //for(String city:cities){
            //System.out.println(city);
        //}
    //}
//}
//public class Main{
  //  public static void main(String[] args) {
//String s="Boya Anjali";
//String Greeting="Hello Anjali";
//System.out.println(Greeting);
//System.out.println(s.length());
//System.out.println(s.toUpperCase());
//System.out.println(s.toLowerCase());
//System.out.println(s.substring(0,5));
//System.out.println(s.charAt(1));
    //}
//}
//public class Main {
    //public static void main(String[] args) {
        //int [] numbers={10,20,30,40,50};
        //String[] fruits={"Apple","Banana","Mango","Grapes"};
        //System.out.println("First number:"+numbers[0]);
        //System.out.println("Second Fruit:"+fruits[1]);
        //?Arrays
        //System.out.println(numbers);
        //for(int i=0;i<numbers.length;i++){
            //System.out.println(numbers[i]);
        //}
        //?Strings
        //System.out.println(fruits);
        //for(String fruit:fruits){
            //System.out.println(fruit);
        //}
    //}
//}
//import java.util.Scanner;
//public class Main {
    //public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        //System.out.println("How many names do you want to enter:");
        //int n=sc.nextInt();
        //sc.nextLine();
        //String[] names=new String[n];
        //System.out.println("Enter " + n + " names:");
        //for(int i=0;i<names.length;i++){
           // names[i]=sc.nextLine();
        //}
        //System.out.println("You Entered:");
        //for(String name:names){
            //System.out.println(name);
        //}
        //System.out.println("Enter names in UpperCase");
        //for(String name:names){
           // System.out.println(name.toUpperCase());
        //}
    //}
//}
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        // int salary=25000;
        // if(salary>10000){
        //     salary=salary+2000;
        // }else{
        //     salary=salary+1000;
        // }
        // System.out.println(salary);
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        //for loop
        // for(int i=1;i<=n;i++){
        //     System.out.println(i + " ");
        //     System.out.println("Hello World");
        // }
        //while loop
        // int i=1;
        // while(i<=5){
        //     System.out.println(i);
        //     i++;
        // }
        //do while loop
        // int i=1;
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i!=10);
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=a;
        if(b>max){
            max=b;
        }   
        if(c>max){
            max=c;
        }
        System.out.println(max);
    }
}