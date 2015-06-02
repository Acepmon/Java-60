package daalgawar;
import java.util.Scanner;
public class bodlogo65 
{
    public static void main(String[] args) 
    {
        int n, m;
        Scanner s = new Scanner(System.in);
        System.out.print("array ын утгыг оруул:\n");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("элементүүдийн утгыг оруул:\n");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    m = a[i];
                    a[i] = a[j];
                    a[j] = m;
                }
            }
        }
        System.out.print("Өсөх дараалал:\n");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + " ");
        }
        System.out.print(a[n - 1]);
              
        System.out.print("\nБуурах дараалал дараалал:\n");
        for (int i=n-1; i >= 0; i--) 
        {
            System.out.print(a[i] + " ");
        }

    }
}