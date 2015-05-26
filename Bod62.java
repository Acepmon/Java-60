package frame;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Bod62 {
    public static void main(String args[]){
        String Number;
        int number;
        String output = " ";
        
        Number = JOptionPane.showInputDialog(null, "1-99 Хооронд тоо оруулна уу !!!");
        number = Integer.parseInt(Number);
        if(number < 100 || number > 1) {
            int a = number/10;
            int b = number%10;
        JTextArea outputArea = new JTextArea();
        outputArea.setText(output);
            
            switch (a){
                case 1: System.out.println("Ten"); break;
                case 2: System.out.println("Twenty"); break;    
                case 3: System.out.println("Thirty"); break;  
                case 4: System.out.println("Fourty"); break;
                case 5: System.out.println("Fivty"); break;    
                case 6: System.out.println("Sixty"); break; 
                case 7: System.out.println("Seventy"); break;
                case 8: System.out.println("Eighty"); break;    
                case 9: System.out.println("Ninety"); break;                
                    
                    
            }
            switch(b){
                case 1 :System.out.println("One"); break;
                case 2: System.out.println("Two"); break;
                case 3: System.out.println("Three"); break;    
                case 4: System.out.println("Four"); break; 
                case 5: System.out.println("Five"); break;
                case 6: System.out.println("Six"); break;    
                case 7: System.out.println("Seven"); break; 
                case 8: System.out.println("Eight"); break;
                case 9: System.out.println("Nine"); break;    
                default: JOptionPane.showMessageDialog(null, "1-99 Хооронд тоо оруулна уу !!!");
            }
        }}
    
}
