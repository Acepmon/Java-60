package Bodlogo45Pac;

import java.util.Random;

public class Bodlogo45 {
    public static void main(String[] args) {
        int[] a=new int[10];
        int[] b=new int[10];
        
        int max=0;
        int min=0;
        
        int i=0;
        int j=0;
        
        Random random=new Random();
        
        for(i=0; i<a.length; i++) {
            a[i]=random.nextInt(50)+1;
            System.out.print(a[i]+", ");
        }
        
        min=a[1];
        
        for(i=0; a.length>i; i++) {
            if(a[i]<min) {
                min=a[i];
            }
        }
        
        System.out.println("Minimum value of first array="+min);
        
        for(j=0; j<b.length; j++) {
            b[j]=random.nextInt(10)+1;
            System.out.print(b[j]+", ");
            
            if(max<b[j]) {
                max=b[j];
            }
        }
        
        System.out.println("Maximum value of second array="+max);
        
        if(min==max) {
            System.out.println("Minimum value of first array="+min+" = Maximum value of second array="+max);
        }
        
        else {
            System.out.println("There are no value of minimum and maximum are equal.");
        }
    }
}
