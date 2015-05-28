/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodlogo;

import javax.swing.JOptionPane;

/**
 *
 * @author JAVA M2
 */
public class bodlogo47a {
    public static void main(String[] args) {
        int total;
        int dundaj;
                int grade;
                int gradeCounter;
                String gradeString;
                total = 0;
                gradeCounter = 1;
                while(gradeCounter <= 6){
                    gradeString = JOptionPane.showInputDialog("Хийсэн бүтээгдэхүүн:");
                    grade = Integer.parseInt(gradeString);
                    total = total + grade;
                    gradeCounter = gradeCounter + 1;
                }
                dundaj = total / 6;
                JOptionPane.showMessageDialog( null," Нийт хийсэн бүтээгдхүүний дундаж нь:"+dundaj,
                        "ClassAverage",JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
                }
                        
    }
    
}
