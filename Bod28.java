
import java.util.Scanner;

public class Bod28 {
	
	Scanner scan;
	int num;
	
	void getVal() {
		
		System.out.println("Octal to Binary");
		scan = new Scanner(System.in);
		
		System.out.println("\nEnter the number :");
		num = Integer.parseInt(scan.nextLine());
	}
	
	void convert() {
		
		String binary = Integer.toBinaryString(num);
		
		System.out.println("Binary Value is : " + binary);
	}
}
 
class MainClass {
	
	public static void main(String args[]) {
		
		Bod28 obj = new Bod28();
		
		obj.getVal();
		obj.convert();
	}
}