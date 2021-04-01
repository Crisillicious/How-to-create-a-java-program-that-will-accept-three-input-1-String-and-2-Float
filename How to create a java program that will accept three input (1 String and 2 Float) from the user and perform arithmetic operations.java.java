import java.util.Scanner;
 
public class Main {
        //The most important JAVA method
      public static void main(String[] args) {
 
       Scanner obb;//Enables the program for obtaining the input of the primitive types like int, double, etc. and strings.
          obb= new Scanner(System.in);
       //Enables the user to input desired variable
       System.out.print("Enter Name: ");
       
       String Username= obb.nextLine();
 
      //Enables the user to input desired variable 
      System.out.print("Enter Course and Section: ");
      
      String cay= obb.nextLine();
      
      float sum;
	  float difference;
	  float product;
	  float quotient;
	  
	  //prints Arithmethic operations in java
	  System.out.println("ARIHTMETIC OPERATIONS IN JAVA");
	  
      
      //Enables the user to input desired variable:
      System.out.print("Enter your First Number: ");
      
      //This command line reads user's float number 
      Float num1= obb.nextFloat();
      
      //Enables the user to input desired variable:
      System.out.print("Enter your Second Number: " );
      
      //Enables the program to store the float number 
      Float num2= obb.nextFloat();
  
      
      //solution, this command line adds the first and second number
      sum= num1+num2;
      //solution, this command line subtracts the first and second number
      difference= num1-num2;
      //solution, this command line multiplies the first and second number
      product= num1*num2;
      //solution, this command line divides the first and second number
      quotient= num1/num2;
      //Output of the user's input on the command line #10
       System.out.println("Your Username is:" + Username);
       //Output of the user's input on the command line #15
       System.out.println("Your section and course is: " + cay);
      
      //Output, this command line enables the program to print the sum of first and second number
      System.out.println("The sum of first and second number is: " + sum);
      
      //Output, this command line enables the program to print the difference of first and second number
      System.out.println("The difference of first and second number is: " + difference);
      
      //Output, this command line enables the program to print the product of first and second number
      System.out.println("The product of first and second number is: " + product);
      
      //Output, this command line enables the program to print the quotient of first and second number
      System.out.println("The quotient of first and second number is: " + quotient);
      
      }   
}