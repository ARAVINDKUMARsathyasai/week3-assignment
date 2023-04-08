package day12;

interface Doable{  
    default void doIt(){  
        System.out.println("Default methods are allowed in the interface form java 8");  
    }  
}  
@FunctionalInterface  
interface Sayable extends Doable{  
    void say(String msg);   // abstract method  
}  

public class FunctionalReference2 implements Sayable {
	public void say(String msg){  
        System.out.println(msg);  
    }  
	public static void main(String ...args) {
		FunctionalReference2 fie = new FunctionalReference2();  
        fie.say("This is from the main method its working");  
        fie.doIt(); 
	}
}
