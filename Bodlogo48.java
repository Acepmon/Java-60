package Bodlogo48Pac;

import java.util.Scanner;

public class Bodlogo48 {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence=input.nextLine();
        String[] word=new String[100];
        String word1="";
        int j=0;
        int count=0;
        int sum=0;
        word[0]="";
        
        for(int i=0; i<sentence.length(); i++) {
            
            
            if(sentence.charAt(i)!=' ') {
                word1=word1+sentence.charAt(i);
                word[j]=word1;
            }
            
            else {
                j++;
                word1 ="";
                word[j]="";
            }
        }
        
        for(int i =0; i<=j; i++) {
            System.out.println("Value at "+i+" :"+word[i]);
        }
        
        for(int a=0; a<=j; a++) {
            for(int b=0; b<=j; b++) {
                if(word[a].equals(word[b])) {
                    count++;
                }
            }
            
            System.out.println("count "+word[a]+" :"+count);
            
            count=0;
        }
    }
}
