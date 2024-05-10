package test.problems;

public class Whileloop {
	public static void main(String[] args) {
	//	int a = 5;

		// WHILE LOOP
		/*while (i > 4) {
			System.out.println(i);
		}*/

		/*do {
			System.out.println(i);
			i++;
		} while (i < 5);
	}*/

		
	//FOR LOOP
	// Statement 1 is executed (one time) before the execution of the code block.

	// Statement 2 defines the condition for executing the code block.

	// Statement 3 is executed (every time) after the code block has been executed.
		for(int i=0;i<64;i=i+8) {
			if (i==32) {
				break;
				
			}
			System.out.println(i);
			
		}
		
		for(int i=0;i<64;i=i+8) {
			if (i==32) {
				continue;
				
			}
			System.out.println(i);
			
		}
		
		//For each loop
		String[] cars = {"bmw","VW","MS"};
		for (String i: cars){
			System.out.println(i);
		
			
			
		}
		
}}
