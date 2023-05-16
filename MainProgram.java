// Example F to C in Java
// original code from https://scoutlife.org/about-scouts/merit-badge-resources/programming/42481/java/

import java.util.Scanner;


public class MainProgram {
    public static final  double  LOW_TEMP_F_WARNING=20.;
    public static final  double  HIGH_TEMP_F_WARNING=90.;
    public static final  int     MAX_LOOP=3;

    static double FahrenheitToCelsius(Double fahrenheit) {
        return ( fahrenheit - 32.)*(5./9.);
    }

    public static void main(String[] args) {
        // try was added by vscode, because it said that scanFaren was never closed.
        try (Scanner scanFaren = new Scanner(System.in)) {

            double Fahrenheit = 0;
            double Celsius = 0;

            for (int i=0; i<MAX_LOOP; i++) {
                System.out.print("\nEnter a temperature in Fahrenheit: ");

                if(scanFaren.hasNextDouble()) {
                    Fahrenheit=scanFaren.nextDouble();
                    Celsius = FahrenheitToCelsius(Fahrenheit);
                } else {
                    System.out.println("Temperature must be a number\n");
                    System.exit(-1); 
                }

                System.out.println("The temperature in Celsius is: "+Celsius);
      
                // Check for high temperature and issue a warning if necessary
                if(Fahrenheit >= HIGH_TEMP_F_WARNING){
                    System.out.println("Remember to hydrate");
                }

                // Check for low temperature and issue a warning if necessary
                else if (Fahrenheit <= LOW_TEMP_F_WARNING ){
                    System.out.println("Remember to pack Long underwear");
                }

                else {
                    System.out.println("Maybe you should touch some grass");
                }
            }
        }
        System.exit(-1);
    }
}
