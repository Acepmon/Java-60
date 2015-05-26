/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daalgawar;
import java.util.ArrayList;
import java.util.Collections;

public class bodlogo23 {
  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<String>();

    arrayList.add("1");
    arrayList.add("2");
    arrayList.add("3");
    arrayList.add("4");
    arrayList.add("5");
    arrayList.add("6");

    System.out.println(arrayList);
    Collections.swap(arrayList, 0, 1);
    Collections.swap(arrayList, 2, 3);
    Collections.swap(arrayList, 4, 5);
    
    
    System.out.println(arrayList);
  }
}
/*
[A, B, C, D, E]
[E, B, C, D, A]
*/