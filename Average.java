// A program that generates 1000 random double-precision floating-point numbers, prints each of them, calculates their average, and displays the average.

public class Average {
        public static void main (String[] args) {
                double[] randomNums = new double[1000]; // initialise array of doubles with a capacity of 1000
                double total = 0; // initialise the total of the randomNums to be zero

                for (int i = 0; i < 1000; i++) { //iterate through the array 1000 times
                        randomNums[i] = Math.random(); // populate each index of the randomNums array with a random number
                        System.out.println(randomNums[i]); // print each number in the array
                        total = total + randomNums[i]; // add the current random number to the total variable - accumulate the sum of all the generated random numbers.
                }

                System.out.println("Average is: " + (total/1000.0)); // print the average of the 1000 doubles

        }

}
