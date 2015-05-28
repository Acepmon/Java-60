/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodlogo;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author JAVA M2
 */
public class bodlogo8 {
    public static void main(String[] args) {
        JTextArea hub = new JTextArea();
        String output = "";
        int a[] = new int [15];
        for(int i = 0; i<=14; i++)
        {
            a[i] = (int)(Math.random()*100);
            output+= ""+a[i];
            
        }
        hub.setText(output);
        JOptionPane.showMessageDialog(null,hub," Numbers ",JOptionPane.INFORMATION_MESSAGE);
        int max = 0;
        for(int i = 0; i<=14; i++)
            if(a[i]>max)max=a[i];
        JOptionPane.showMessageDialog(null," max: " +max,"хамгийн их нь:",JOptionPane.INFORMATION_MESSAGE  );
        System.exit(0);
                
    }
}
