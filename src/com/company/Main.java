package com.company;

public class Main {

    public static void main(String[] args) {


        double[] array = new double[]{2.3, -2.5, 0.3, 3.1, -4.2, 0.9, -5.3, 4.9, 0.8, -8.3, 9.2, -0.1, 6.9, -0.5, 0.9};
        int colichestvo = 0;
        double sume = 0;

        boolean vyklichatel = false;


        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                vyklichatel = true;
            }

            if (array[i] > 0 && vyklichatel) {
                colichestvo++;
                sume += array[i];


            }
            System.out.println(sume / colichestvo);

        }
        int numbers [] = {8, -2, -4, 2, 3, 6};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println(numbers[5]);

    }
}
