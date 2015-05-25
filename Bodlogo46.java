package BieDaalt;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Bodlogo46 {
    
    public static void main(String args[]){
        String Number;
        String output=" ";
        int num;
        Number = JOptionPane.showInputDialog("Тоогоо оруулна уу:");
        num = Integer.parseInt(Number);
        
        for(int counter = 1; counter<=num; counter++){
             if(num%counter==0)
             output+=counter+" ";
        }
         JTextArea outputArea = new JTextArea();
        outputArea.setText(output);
        
        JOptionPane.showMessageDialog(null,output, "Үр дүн", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
            
    }
    
}
