package JavaBasics;

public class Constructor {
	
	int a;
	String st;
	
	//Constructor
	public Constructor() {
		a=0;
		st=null;
	}

	public static void main(String[] args) {
	
		Constructor c1 = new Constructor();
		System.out.println(c1.a);
		System.out.println(c1.st);
		
	}
	

}
