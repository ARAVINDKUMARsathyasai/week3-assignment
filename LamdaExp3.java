package IOPackage;

import java.util.Scanner;

// Code to print the factorial of the number this lamda function will have parameter and return type

@FunctionalInterface
interface Factorial{
	long factorial(int num);
}

public class LamdaExp3 {
	public static void main(String ...args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mind that output should be less than "+Long.MAX_VALUE);
		System.out.println("Enter the number to which has to be calculated");
		Factorial fac = (num)->{
			long fact = 1l;
			for(int i = num;i>0;i--) {
				fact = fact*i;
			}
			return fact;
		};
		
		int num= sc.nextInt();
		System.out.println("Factorial of  "+num+"= "+fac.factorial(num));
	}
}
