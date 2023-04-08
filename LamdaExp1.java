package IOPackage;

import java.util.Scanner;

//Program to take names of the company employees and print names on the bases of there starting word
@FunctionalInterface
interface Names{
	void names();
}

public class LamdaExp1 {
	public static void main(String args[]) {
		Names na = ()->{
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter the names of the employees seprated by ,");
			String names = sc.nextLine();
			String [] nameLis = names.split(",");
			System.out.println("Enter the catagorising alphabet ");
		    
			char ch = sc.next().toUpperCase().charAt(0);
			sc.close();
			
			System.out.println("List of the names are ");
			for (String st : nameLis)
					System.out.println(st);
			
			
			System.out.println("List of the sorted names");
			for (byte i = 0; i<nameLis.length;i++) {
				String st = nameLis[i].toUpperCase();
				if(st.charAt(0)==ch) {
					System.out.println(nameLis[i]);
				}
			}
		};
		
		na.names();
	}
}
