package day12;

import java.util.Scanner;

@FunctionalInterface  
interface sayable{  
    void say(String msg);  
}  

public class FunctionalReference1 implements sayable {
	public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
    	FunctionalReference1 fie = new FunctionalReference1();
    	Scanner sc = new Scanner(System.in);
    	String str1;
    	System.out.println("Enter your name to which has to be displayed ");
    	str1 = sc.nextLine();
        fie.say(str1);  
    }  
}
