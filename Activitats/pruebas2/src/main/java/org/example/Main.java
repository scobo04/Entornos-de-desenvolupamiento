package org.example;

import javax.swing.plaf.metal.MetalInternalFrameTitlePane;

public class Main {
    public static void main(String[] args) {

        int n = 1000;

        System.out.println(prueba(n));
    }

    public static int prueba(int n) {

        for (int i = n; i < Integer.MAX_VALUE; i++) {

            if (i < Integer.MAX_VALUE) {

                n++;

            }

        }

        return n;
    }

}