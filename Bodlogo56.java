package Bodlogo56Pac;

import java.util.Scanner;

public class Bodlogo56 {
    
    static boolean isPrime=false;
    static boolean isPalindrome=false;
    static String toBinary="";
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter value: ");
        int value=input.nextInt();
        
        for(int i=3; i<=value; i++) {
            if(isPrime(i)) {
                String bin=toBinary(i);
                if(isPalindrome(bin)) {
                    System.out.println(i+"="+bin);
                }
            }
        }
    }
    
    public static boolean isPrime(int k) {
        
            boolean check=true;
            
            for(int j=2; j<k; j++) {
                if(k%j==0) {
                    check=false;
                    break;
                }
            }
            
            if(check) {
                isPrime=true;
            }
            
            else {
                isPrime=false;
            }
        
        return isPrime;
    }
    
    public static String toBinary(int m) {
        String number="";
        String reverse="";
        
        while(m!=0) {
            int digit=m%2;
            m=m/2;
            if(digit==1) {
                reverse=reverse+"1";
            }
            
            else {
                reverse=reverse+"0";
            }
        }
        
        for(int i=reverse.length()-1; i>=0; i--) {
            number=number+reverse.charAt(i);
            toBinary=number;
        }
        
        return toBinary;
    }
    
    public static boolean isPalindrome(String l) {
        String reverse="";
        int length=l.length();
        
        for(int i=length-1; i>=0; i--) {
            reverse=reverse+l.charAt(i);
        }
        
        if(l.equals(reverse)) {
            isPalindrome=true;
        }
        
        else {
            isPalindrome=false;
        }
        
        return isPalindrome;
    }
}
