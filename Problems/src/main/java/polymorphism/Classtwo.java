package polymorphism;

public class Classtwo extends Classone{
	@Override
	public void methodOne() {
		System.out.println("method overrided for methodone");
	}
	public static void main(String[] args) {
		Classtwo two = new Classtwo();
		two.methodOne();
	}

}
