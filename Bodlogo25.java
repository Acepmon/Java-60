package Bodloguud;

import javax.swing.JOptionPane;

//Дурын өгөгдсөн N натураль тоог квадратуудын нийлбэр байдлаар задалж бичих программ бич.

public class Bodlogo25 {
	
	public static void main(String[] args){
		
		String input = JOptionPane.showInputDialog("too oruulna uu");
    	int k = Integer.parseInt(input);
    	
    	String number = "";
        String reverse = "";
        int hoyort = 0;
        int negj = 0;
        String too = "";
        int order = -1;
        String sum = "";
        
        while (k!=0) {
            int digit = k%2;
            k=k/2;
            if(digit==1)
                number = number+"1";
            else
                number = number+"0";
        }
        for(int g=0; g<number.length(); g++)
        {
        	order ++;     
        	too = number.charAt(g)+"*"+"2*"+"("+order+") + ";
        	sum += too;        	
        }
        
        System.out.println(sum);
        JOptionPane.showMessageDialog(null, sum+"::: zadalsan n ");
        
        for (int i = number.length()-1; i>=0; i--){
            reverse = reverse + number.charAt(i);
       }
        
        System.out.println("");        
        System.out.println(reverse + "---> 2t ruu hurwuulsen ni");
//        System.out.println(number);
        
	}

}
