package BieDaalt;

import javax.swing.JOptionPane;

public class PrimeNumber {
    
     public static void main(String[] args) {            
              
            int num;
            String Num;
            
           Num = JOptionPane.showInputDialog("Тоогоо оруулна уу:");
           num = Integer.parseInt(Num);
                
                for(int i=1; i < num; i++){                       
                        boolean isPrime = true;                      
                       
                        for(int j=2; j < i ; j++){
                               
                                if(i % j == 0){
                                        isPrime = false;
                                        break;
                                }
                        }                       
                        if(isPrime)
                            System.out.print(i + " ");
                }
        }
}
