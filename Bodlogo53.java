package Bodlogo53Pac;

import java.util.Scanner;

public class Bodlogo53 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter sentence: \n");
        String sentence=input.nextLine();
        String[] word=new String[100];
        String word1="";
        int j=0;
        
        
        for(int i=0; i<sentence.length(); i++) {
            
            
            if(sentence.charAt(i)==' ') {
                j++;
            }
            
            else {
                word1=word1+sentence.charAt(i);
                word[j]=word1;
            }
        }
        
        System.out.println(word1);
    }
}
