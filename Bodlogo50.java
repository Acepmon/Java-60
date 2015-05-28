package Bodlogo50Pac;

import java.util.Scanner;

public class Bodlogo50 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String sentence;
        String[] word=new String[100];
        String character="";
        
        System.out.print("Enter sentence: ");
        sentence=input.nextLine();
        sentence=sentence+".";
        
        for(int i=0; i<sentence.length(); i++) {
            if(sentence.charAt(i)!=' ' && sentence.charAt(i)!='.') {
                character=character+sentence.charAt(i);
            }
            
            else {
                if(character.length()%2==0) {
                    System.out.println("Even="+character);
                }
                
                else {
                    System.out.println("Odd="+character);
                }
                
                character="";
            }
        }
    }
}
