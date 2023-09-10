//A simple program to calucate the sum of all the numbers between any two integers

import java.util.*; //import all the java util modules

public class Sums {
        public static void main(String[] args) {
                Scanner sinput = new Scanner(System.in); // create new scanner object
                int a = sinput.nextInt(); //read the integer entered by the user
                int b = sinput.nextInt();
                int sum = sumBetween(a, b); //call the sumBetween method on the integers a and b that are entered to get their sum
                System.out.println(sum); //print the sum
        }

        public static int sumBetween(int c, int d){

                int result = 0; //  initialise the integer variable result to 0 - to store the sum of integers between c and d.

                int start = 0; // initialise start and end variable to get the range of integers between the integers c and d
                int end = 0;

                if (c > d) { // if c is greater than d, d is the smaller value so start at d
                        start = d;
                        end = c;
                }
                else { // otherwise, if d is greater than c, c is the smaller value so start at c
                        start = c;
                        end = d;
                }

                for (int i = start + 1; i < end; i++){ //iterate through the integers between start and end (not including the start and end number)
                        result = result + i; // add the value of i (each number that is next in the range) to the result - accumulating the sum of the integers in the specified range.
                }

                return result; 
        }

}
