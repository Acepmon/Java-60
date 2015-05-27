import java.util.Scanner;
 
public class Bodlogo61 {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		double a = 0, b = 0, c = 0, x1, x2;
		
		System.out.println("Тэгшитгэл :\nax^2+bx+c\n");
		
		try {
			
			System.out.println("x^2 (a) коэффициент оруулна уу : ");
			a = Double.parseDouble(scan.nextLine());
			
			System.out.println("x (b) коэффициент оруулна уу : ");
			b = Double.parseDouble(scan.nextLine());
			
			System.out.println("(c) коэффициент оруулна уу : ");
			c = Double.parseDouble(scan.nextLine());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		x1 = (-b + (Math.sqrt( (b*b) - (4*a*c)))) / (2*a);
		x2 = (-b - (Math.sqrt( (b*b) - (4*a*c)))) / (2*a);
		
		System.out.println(x1);
		System.out.println(x2);
	}
}