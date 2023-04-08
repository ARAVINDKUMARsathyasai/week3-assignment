package day12;

@FunctionalInterface
interface Showable{
	void message();
}

class SMS{
	SMS(){
		System.out.println("Constructor");
	}
	public  void Sms() {
		System.out.println("This is form the SMS class");
	}
}

public class MethodReference {
public static void main(String[] args) {
	SMS sm = new SMS();
	Showable sc = sm::Sms;
	Showable scon = SMS::new;
	sc.message();
	scon.message();
}
}
