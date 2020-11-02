package exercise2;

import java.util.Scanner;

public class exercise2 {

public static void main(String[] args) {
	
	//Exercise1();
	//Exercise2();
	//Exercise3();
	//Exercise4();
	//Exercise5();
	//Exercise6();
	//Exercise7();
	//Exercise8();
	//Exercise9();
	//Exercise10();
	
	}

	 public static void Exercise1(String[] args) {
	  System.out.println(-5 + 8 * 6);
	  System.out.println((55+9) % 9);
	  System.out.println(20 + -3*5 / 8);
	  System.out.println(5 + 15 / 3 * 2 - 8 % 3);
	  
	 }
	 
	 public static void Exercise2(String[] args) {
		 Scanner in = new Scanner(System.in);
		   
		 System.out.print("Input first number: ");
		 int num1 = in.nextInt();

		 System.out.print("Input second number: ");
		 int num2 = in.nextInt();
		   
		 System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
		  
	 }
			 
	 public static void Exercise3() {
		 Scanner in = new Scanner(System.in);
			   
		 System.out.print("Input first number: ");
		 int num1 = in.nextInt();
			   
		 System.out.print("Input second number: ");
		 int num2 = in.nextInt();
			   
			 
		 System.out.println(num1 + " + " + num2 + " = " + 
			  (num1 + num2));
			   
		 System.out.println(num1 + " - " + num2 + " = " + 
			  (num1 - num2));
			   
		 System.out.println(num1 + " x " + num2 + " = " + 
			  (num1 * num2));
		 System.out.println(num1 + " / " + num2 + " = " + 
			  (num1 / num2));
			 
		 System.out.println(num1 + " mod " + num2 + " = " + 
			  (num1 % num2));
	 
	 }
	 
	 public static void Exercise4(String[] args) {
		  System.out.println(24+26);
	}
	 
	public static void Exercise5(String[] args) {

		System.out.println("   J    a   v     v  a ");
		System.out.println("   J   a a   v   v  a a");
		System.out.println("J  J  aaaaa   V V  aaaaa");
		System.out.println(" JJ  a     a   V  a     a");
		
	}
		 
	public static void Exercise6(String[] arg) {

		System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
	}
	  
	public static void Exercise7(String[] args) {

		double pi = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
		System.out.println(pi); //
		
	}
	
	 public static void Exercise8(String[] args) {
		   Scanner in = new Scanner(System.in);
		    
		   System.out.print("Input first number: ");
		   int num1 = in.nextInt();
		    
		   System.out.print("Input second number: ");
		   int num2 = in.nextInt();
		    
		   System.out.print("Input third number: ");
		   int num3 = in.nextInt();
		    
		   System.out.print("Input fourth number: ");
		   int num4 = in.nextInt();
		   
		   System.out.print("Enter fifth number: ");
		   int num5 = in.nextInt();
		    
		    
		   System.out.println("Average of five numbers is: " + 
		    (num1 + num2 + num3 + num4 + num5) / 5);
		   
	 }
	
	 public static void Exercise9(String[] strings) {

		   final double width = 5.6;
		   final double height = 8.5;

		   double perimeter = 2*(height + width);
				
		   double area = width * height;			
				
		   System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);

		   System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
		   
		    }
	 
	  public static void Exercise10(String[] args) {
		     
		   int a, b, temp;
		   a = 15;
		   b = 27;
		   System.out.println("Before swapping : a, b = "+a+", "+ + b);
		   temp = a;
		   a = b;
		   b = temp;   
		  System.out.println("After swapping : a, b = "+a+", "+ + b);
		 }
	  
}