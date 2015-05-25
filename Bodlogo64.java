package BieDaalt;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Bodlogo64 {

    public static void main(String args[]){
        
        int Sum=0;
        int Urjver = 0;
        int Yalgavar = 0;
        int Noogdvor = 0;
        String NumA;
        String NumB;
        int numA;
        int numB;
        String output = " ";
        String output1 = " ";
        String output2 = " ";
        String output3 = " ";
        
        NumA = JOptionPane.showInputDialog("A Тоогоо оруулна уу:");
        numA = Integer.parseInt(NumA);
        NumB = JOptionPane.showInputDialog("B Тоогоо оруулна уу:");
        numB = Integer.parseInt(NumB);      

            
                Sum = numA + numB;
                output+= Sum+" ";
                Urjver = numA * numB;
                output1 = Urjver+" ";
                Yalgavar = numA - numB;
                output2 = Yalgavar+" ";
                Noogdvor = numA/numB;
                output3 = Noogdvor+" ";
                
        JTextArea outputArea = new JTextArea();
        outputArea.setText(output);
                
        JOptionPane.showMessageDialog(null, output, "Нийлбэр",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, output1, "Үржвэр",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, output2, "Ялгавар",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, output3, "Ноогдвор",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        
    }
}
