
import java.util.Scanner;

/**
 *
 * @author JAVA M2
 */
public class Bodlogo20 {
    
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("N тоо : ");
        int n = in.nextInt();
        int[] a = new int[n];
        int count = 0;
        
        System.out.print("A тоо" + (n != 1 ? "нууд: " : ": "));
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
            if (a[i] == 0) {
                count++;
            }
        }
        
        System.out.println("Анхны дараалал");
        for (int too : a) {
            System.out.print(too + " ");
        }
        System.out.println("");
        
        for (int zero = 0; zero <= count; zero++) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == 0 && i != (a.length-1)) {
                    int tmp = a[i+1];
                    a[i+1] = a[i];
                    a[i] = tmp;
                }
            }
        }
        
        System.out.println("Солигдсон дараалал");
        for (int too : a) {
            System.out.print(too + " ");
        }
        System.out.println("");
        
    }
}
