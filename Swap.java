import java.util.Scanner;  
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int a = sc.nextInt();  // Input first number
        int b = sc.nextInt();  // Input second number
        int temp;  
        temp = a;  // Swap logic
        a = b;  
        b = temp;  
        System.out.println("a=" + a);  // Display swapped value of a
        System.out.println("b=" + b);  // Display swapped value of b
        
    }
}
