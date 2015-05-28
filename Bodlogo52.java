package Bodlogo52Pac;

import java.util.ArrayList;
import java.util.Scanner;

public class Bodlogo52 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        String sentence;
        String word;
        String minWord;
        ArrayList<Integer> number = new ArrayList<>();
        int index=0;
        
        System.out.print("Enter sentence: ");
        sentence=input.nextLine();
        sentence=sentence+".";
        
        int count=0;
        int min=100;
        word="";
        minWord="";
        
        for(int i=0; i<sentence.length(); i++) {
            if(sentence.charAt(i)!=' ' && sentence.charAt(i)!='.') {
                switch(sentence.charAt(i)) {
                    case 'a':
                        break;
                    case 'e':
                        break;
                    case 'i':
                        break;
                    case 'o':
                        break;
                    case 'u':
                        break;
                    case 'y':
                        break;
                    default:
                        count++;
                        break;
                }
                
                word=word+sentence.charAt(i);
            }
            
            else {
                
                if(count<min) {
                    min=count;
                    minWord=word;
                }
                
                index++;
                count=0;
                word="";
            }
        }
        
        System.out.println("Word that has minimum consonant or has no consonant is-"+minWord);
    }
}
