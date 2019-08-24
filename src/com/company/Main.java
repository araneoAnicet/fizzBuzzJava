package com.company;


public class Main {


    private static String[] fizzBuzz(final int numberOfIterations, final int fizz, final int buzz) {
        String[] result = new String[numberOfIterations];
        for (int i = 0; i < numberOfIterations; i++) {
            result[i] = Integer.toString(i + 1);
        }

        if (fizz >= buzz) {
            for (int i = buzz - 1; i < numberOfIterations; i += buzz) {
                result[i] = "Buzz";
            }

            for (int i = fizz - 1; i < numberOfIterations; i += fizz) {
                if (result[i].equals("Buzz")) {
                    result[i] = "FizzBuzz";
                } else {
                    result[i] = "Fizz";
                }
            }
        }
         else {
            for (int i = fizz - 1; i < numberOfIterations; i += fizz) {
                result[i] = "Fizz";
            }

            for (int i = buzz - 1; i < numberOfIterations; i += buzz) {
                if (result[i].equals("Fizz")) {
                    result[i] = "FizzBuzz";
                } else {
                    result[i] = "Buzz";
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        final int iterations = 100;
        final int fizz = 3;
        final int buzz = 5;

        String[] result = fizzBuzz(iterations, fizz, buzz);

        System.out.println("The program starts...");
        for (int i = 0; i < 100; i++) {
            System.out.println(result[i]);
        }
    }
}
