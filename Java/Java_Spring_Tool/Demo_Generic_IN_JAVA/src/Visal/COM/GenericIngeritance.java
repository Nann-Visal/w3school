package Visal.COM;

public class GenericIngeritance {
	public static void main(String[] args) {
		String str = " Dara ";
		Object obj = new Object();
		obj = str;
		Visal<String> strG = new Visal<>();
		Visal<Object> objG = new Visal<>();
		
		//error
	    //objG = strG;
	    //not error
	    obj = strG;
	    
	    VisalII<Object> s1 = new VisalII<Object>();
	    objG = s1;
		
	}
	static class Visal<T>{
		
	}
	static class VisalII<T> extends Visal{
		
	}
}
