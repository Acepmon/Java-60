package Bodlogo33Pac;

import java.util.Scanner;

public class Bodlogo33 {
    public static void main(String[] args) {
        String inputString;
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter String: ");
        inputString=input.nextLine();
        
        int length=inputString.length();
        int i, begin, end, middle;
        
        begin=0;
        end=length-1;
        middle=(begin+end)/2;
        
        for(i=begin; i<=middle; i++) {
            if(inputString.charAt(begin)==inputString.charAt(end)) {
                begin++;
                end--;
            }
            
            else {
                break;
            }
        }
        
        if(i==middle+1) {
            System.out.println("Entered String is Palindrome.");
        }
        
        else {
            System.out.println("Entered String is not Palindrome.");
        }
    }
}
