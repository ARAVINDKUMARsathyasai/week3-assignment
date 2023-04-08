package IOPackage;

import java.util.Scanner;

// function reference without any return  and having a staic method in it

@FunctionalInterface
interface Addition{
	void sum(int ...a);
	
	public static void testMethod() {
		System.out.println("This method is form the static method of the interface");
		System.out.println("This method can be accessed by the loos coupling method");
	}
}

class Iaddition implements Addition{
	@Override
	public void sum(int ...a) {
		int sum = 0;
		
		for (int num : a)
			sum += num;
		
		System.out.println("This method has no return sum of "+a.length+" Numbers is = "+sum);
	}
}

public class Function4 {
	public static void main(String ...args) {
		Addition.testMethod();
		Iaddition id = new Iaddition();
		System.out.println("Enter any number of integer values seprated by ,");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		String nums[] = str.split(",");
		int arr[] = new int[nums.length];
		for(byte i =0; i<nums.length;i++) {
			arr[i] = Integer.parseInt(nums[i]);
		}
		System.out.println("Calling the Addition function");
		id.sum(arr);
	}
}
