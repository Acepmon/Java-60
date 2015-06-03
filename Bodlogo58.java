package Bodlogo58Pac;
import java.util.Random;

public class Bodlogo58 {
    public static void main(String[] args) {
        int[] value=new int[10];
        Random random=new Random();
        String number="";
        String reverse="";
        int count=0;
        int max=0;
        int output=0;
        
        for(int i=0; i<value.length; i++) {
            value[i]=random.nextInt(20)+1;
            
                while(value[i]!=0) {
                    int digit=value[i]%2;
                    value[i]=value[i]/2;

                    if(digit==1) {
                        reverse=reverse+"1";
                    }

                    else {
                        reverse=reverse+"0";
                    }
                }

                for(int j=reverse.length()-1; j>=0; j--) {
                    number=number+reverse.charAt(i);
                }
                
                if(number.charAt(i)==1) {
                    count++;
                }
                
                if(count>max) {
                    max=count;
                    output=value[i];
                    
                }
            
            System.out.println(" "+output);
            
            count=0;
        }
    }
}
