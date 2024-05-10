package problems;

public class Test2 {
	/*public static void main(String[] args) {
		String a ="Arun";
		String b= "";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+ a.charAt(i);
		//	System.out.println(b);
		}
		System.out.println(b);
	}*/
	public static void main(String[]args){
		int n1=0,n2=1,sum=0;
		for(int i=0;i<10;i++){
		sum=n1+n2;
		n1=n2;
		n2=sum;
		System.out.print(" "+ sum);

		}
		}

	

}
