package polymorphism;

public class Classone {
	
	public void methodOne() {
		System.out.println("This is method one");

	}
	
	 static int methodTwo(int a,int b) {
		return a+b;
		
	}
	 static void methodThree(String c,String d) {
		System.out.println("Arun"+" "+ c);
		System.out.println("Kabil"+" "+ d);
		
		 
	 }
	public static void main(String[] args) {
	
		int methodOne =methodTwo(1,2);
		System.out.println("addition of the a and b is:"+methodOne);
		methodThree("KUMAR", "KUMAR");
	}

}
