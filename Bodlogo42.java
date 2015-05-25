package Bodlogo42Pac;

import java.util.Arrays;
import java.util.Scanner;

public class Bodlogo42 {
    public static void main(String[] args) {
        int[] a=new int[5];
        int[] b=new int[5];
        int[] c=new int[10];
        
        System.out.println("Enter values for first array: ");
        Scanner input=new Scanner(System.in);
        
        
        for(int i=0; i<5; i++) {
            System.out.print("a["+i+"]=");
            a[i]=input.nextInt();
        }
        
        Arrays.sort(a);
        
        System.out.println(Arrays.toString(a));
        
        System.out.println("Enter values for second array: ");
        
        for(int j=0; j<5; j++) {
            System.out.print("b["+j+"]=");
            b[j]=input.nextInt();
        }
        
        Arrays.sort(b);
        
        System.out.println(Arrays.toString(b));
        
        for(int v=0; v<a.length; v++) {
            c[v]=a[v];
        }
        
        for(int y=0; y<b.length; y++) {
            c[y+a.length]=b[y];
        }
        
        Arrays.sort(c);
        
        System.out.println(Arrays.toString(c));
    }
}
