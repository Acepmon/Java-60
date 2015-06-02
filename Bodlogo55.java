package Bodlogo55Pac;

import java.util.Scanner;

public class Bodlogo55 {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        String sentence;
        
        System.out.print("Enter sentence: ");
        sentence=input.nextLine();
        
        int count=0;
        
        for(int i=0; i<sentence.length(); i++) {
            
            
            for(int a=0; a<i; a++) {
                if(sentence.charAt(i)==sentence.charAt(a)) {
                    count++;
                }
            }    
                if(count==0) {
                    if(sentence.charAt(i)==' ') {
                        continue;
                    }
                    
                    System.out.print(sentence.charAt(i)+": ");
                    
                    for(int j=0; j<sentence.length(); j++) {
                        if(sentence.charAt(i)==' ') {
                            continue;
                        }
                        
                        if(sentence.charAt(i)==sentence.charAt(j)) {
                            System.out.print(j+"   ");
                        }
                    }
                    System.out.println("");
                }
                
            count=0;
        }
    }
}
