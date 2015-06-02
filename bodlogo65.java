/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daalgawar;
import java.util.Arrays;
import java.util.Scanner;
 
public class bodlogo65 {
 
	Scanner scan;
	int[] num;
	int n;
	
	void getVal() {
		
		scan = new Scanner(System.in);
		
		System.out.println("\n'A' д утга оруулнуу :");
		n = Integer.parseInt(scan.nextLine());
		
		System.out.println("Тоонуудаа оруул :");
		num = new int[n];
		
		for(int i=0; i<n; i++) {
			
			num[i] = Integer.parseInt(scan.nextLine());
		}
	}
	
	void sort() {

		Arrays.sort(num);
		
		System.out.println("\nӨсөх дараалалаар");
		
		for(int i=0; i<n; i++) {
			
			System.out.print(" " + num[i]);
		}
		
		System.out.println("\nБуурах дараалалаар");
 
		for(int i=n-1; i>=0; i--) {
			
			System.out.print(" " + num[i]);
		}
	}
}
 
class Main {
	
	public static void main(String args[]){
		
		bodlogo65 obj = new bodlogo65();
		
		obj.getVal();
		obj.sort();
	}
}