
import java.util.Scanner;

public class ConvertTemp{
    
    public ConvertTemp(int choice){
        
        Scanner input = new Scanner(System.in);
        switch(choice)
        {
            
            case 1:
            System.out.println("Enter the measurement in /'Celsius/': ");
            double cel= input.nextDouble();
            double fahrenheit = (cel * 9.0 / 5.0) + 32;
            System.out.println("It is " +  fahrenheit + "in Fahrenheit");
            break;
            case 2: 
            System.out.println("Enter the measurement in /'Fahrenheit/'");
            double fah = input.nextDouble();
            double celsius = (fah - 32) * 5.0 / 9.0;
            System.out.println("It is " + celsius + " in Celsius");
            default: System.out.println("Invalid input");
        }
        input.close();
    }
}




