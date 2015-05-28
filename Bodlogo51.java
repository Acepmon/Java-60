package Bodlogo51Pac;

import java.util.Scanner;

public class Bodlogo51 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String sentence;
        String word;
        String wordCh;
        int[] number=new int[100];
        int index=0;
        
        System.out.print("Enter sentence: ");
        sentence=input.nextLine();
        sentence=sentence+".";
        
        int count=0;
        int max=0;
        word="";
        wordCh="";
        
        for(int i=0; i<sentence.length(); i++) {
            
            
            if(sentence.charAt(i)!=' ' && sentence.charAt(i)!='.') {
                switch(sentence.charAt(i)) {
                    case 'a':
                        count++;
                        break;
                    case 'e':
                        count++;
                        break;
                    case 'i':
                        count++;
                        break;
                    case 'o':
                        count++;
                        break;
                    case 'u':
                        count++;
                        break;
                    case 'y':
                        count++;
                        break;
                    default:
                        
                        break;
                }
                
                word=word+sentence.charAt(i);
                number[index]=count;
            }
            
            else {
                if(count>max) {
                    max=count;
                    wordCh=word;
                }
                
                index++;
                count=0;
                word="";
            }
            
            
        }
        
        System.out.println("Word that has a maximum value is - "+wordCh);
    }
}
