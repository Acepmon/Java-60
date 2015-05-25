package Bodlogo41Pac;

import java.util.Scanner;

public class Bodlogo41 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number: ");
        
        int m=input.nextInt();
        int sum=0;
        int h=1;
        do {
            if(m%h==0) {
                sum=sum+h;
            }
            
            h++;
        } while(h<=m);
        
        if(sum==m) {
            System.out.println(sum);
        }
        
        else {
            System.out.println("Entered number is not equal to its divisors.");
        }
    }
}
