
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.print("Enter your choice(1 or 2): ");
            int choice = sc.nextInt();
            ConvertTemp pa = new ConvertTemp(choice);
        
        sc.close();
    }
}

