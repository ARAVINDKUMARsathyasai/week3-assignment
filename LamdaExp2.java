package IOPackage;

import java.util.Scanner;

// program to check total prime numbers between the given range so function will have parameters but it will not return anything 

@FunctionalInterface
interface PrimeNumbers{
	public static void infoMethod() {
		System.out.println("This interface is to print the all the prime numbers in the given range");
		System.out.println("This function has no return type but it takes integer type var arguments as a parameter");
	}
	void primePrint(int ...a);
}

public class LamdaExp2 {
	public static void main(String ...args) {
		Scanner sc = new Scanner(System.in);
		PrimeNumbers.infoMethod();
		PrimeNumbers pm = (int ...a)->{
			int flag = 0;
			for(int i = a[0];i<=a[1];i++) {
				flag = 0;
				for(int j =2;j<(i/2);j++) {
					if(i%j == 0) {
						flag = 1;
						break;
					}
				}
				if(flag == 0)
					System.out.println(i);
			}
		};
		
		System.out.println("Enter the range in which numbers are to be printed");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Prime numbers between "+num1+" and "+num2);
		pm.primePrint(num1,num2);
	}
}
