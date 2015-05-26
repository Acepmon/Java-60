package Bodlogo44Pac;

import java.util.Random;

public class Bodlogo44 {
    public static void main(String[] args) {
        int[] array=new int[10];
        Random random=new Random();
        int count=0;
        int max=0;
        
        for(int i=0; i<array.length; i++) {
            array[i]=random.nextInt(10)+1;
            System.out.print(array[i]+", ");
        }
        
        for(int i=0; i<array.length; i++) {
            for(int j=i; j<array.length; j++) {
                if(array[i]==array[j]) {
                    count++;
                }
            }
            
            if(max<count) {
                max=count;
            }
            
            count=0;
        }
        
        System.out.println("Max="+max);
    }
}
