package Bodlogo49Pac;

import java.util.Scanner;

public class Bodlogo49 {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter first sentence: ");
        String sentence1=input.nextLine();
        
        System.out.print("Enter second sentence: ");
        String sentence2=input.nextLine();
        
        String[] word1=new String[100];
        String[] word2=new String[100];
        
        String char1="";
        String char2="";
        
        int index1=0;
        int index2=0;
        
        word1[0]="";
        word2[0]="";
        
        for(int i=0; i<sentence1.length(); i++) {
            if(sentence1.charAt(i)!=' ') {
                char1=char1+sentence1.charAt(i);
                word1[index1]=char1;
            }
            
            else {
                index1++;
                char1="";
                word1[index1]="";
            }
        }
        
        for(int i=0; i<sentence2.length(); i++) {
            if(sentence2.charAt(i)!=' ') {
                char2=char2+sentence2.charAt(i);
                word2[index2]=char2;
            }
            
            else {
                index2++;
                char2="";
                word1[index2]="";
            }
        }
        int lenght =0;
        String longWord="";
        for(int a=0; a<=index1; a++) {
            for(int b=0; b<=index2; b++) {
                if(word1[a].equals(word2[b])) {
                    if(word1[a].length()>lenght) {
                        lenght = word1[a].length();
                        longWord = word1[a];
                    }
                }
            }
        }
        
        System.out.println("Long word:"+longWord);
    }
}
