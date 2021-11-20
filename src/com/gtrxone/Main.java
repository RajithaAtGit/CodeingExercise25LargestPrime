package com.gtrxone;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(0));
    }

    public static int getLargestPrime(int number) {
        int primeNumber = 2;
        int lagestprimefactor = 0;
        if (number >= 2) {
            while (number > 1) {
                if (number % primeNumber == 0) {

                    while (true) {
                        if (number % primeNumber != 0) {
                            break;
                        } else {
                            number /= primeNumber;
                        }

                        lagestprimefactor = primeNumber;
                    }
                }
                primeNumber++;
            }
            return lagestprimefactor;
        }
        return -1;
    }
}
