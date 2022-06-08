import java.util.Scanner;  // Import the Scanner class


public class farenheit {
    public static void main(String[] args){
      
        Scanner input = new Scanner(System.in);

        System.out.println("input degree: ");
        double fahrenheit = input.nextDouble();

        double celsius = (( 5 * (fahrenheit - 32.0)/ 9.0));
        System.out.println(fahrenheit + "degree is equal to " + celsius + " in celsius");
        
    }
}
