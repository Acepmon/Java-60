package Bodlogo54Pac;

import java.util.Scanner;

public class Bodlogo54 {
    public static void main(String[] args) {
        String sentence;
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter sentence: ");
        sentence=input.nextLine();
        
        char character=0;
        int count=1;
        int max=0;
        
        for(int i=0; i<sentence.length(); i++) {
            for(int j=i+1; j<sentence.length(); j++) {
                
                if(sentence.charAt(i)==sentence.charAt(j)) {
                    count++;
                }
            }
            
            if(max<count) {
                max=count;
                character=sentence.charAt(i);
            }
            
            count=1;
        }
        
        System.out.println("Maximum character is '"+character+"' and it is '"+max+"' times entered ");
    }
}
