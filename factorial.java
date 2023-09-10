//A simple program that calculates the factorial of any integer in the range ±2,147,483,648

import java.util.*; // import everything from the java.util package

public class Factorials { 
        public static void main(String[] args) { 
                Scanner sinput = new Scanner(System.in); //define a new scanner object so user can input any number they want to know the factorial of
                int a = sinput.nextInt();

                int fact = factorial(a); //call the factorial function the entered number
                System.out.println(fact); //print the result
        }

        private static int factorial(int a) { //recursive function to calculate the factorial
        	if (a < 1) {
        		return 0; //base case
        	}

        	int result = 1;

        	while (a > 0) { //recursive call
        		result = result * a;
        		a--;
        	}

        	return result;
        }

}
