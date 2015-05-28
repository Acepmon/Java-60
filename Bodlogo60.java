
import java.util.Scanner;

public class Bodlogo60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Цифрээ оруулна уу: ");
        
        int k = scanner.nextInt();
        for(int i =100; i<1000; i++){
            int j=(i/100 + (i%100)/10 + i%10);
            if (j == k)
                System.out.println(i);
        }
    }
    
}