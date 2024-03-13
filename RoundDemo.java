/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.rounddemo;

/**
 *
 * @author klatimer
 */
public class RoundDemo {

    public static void main(String[] args) {
        double testNumber = 34.12345;
        double roundedTest = round2(testNumber);
        System.out.println(roundedTest);
    }

public static double round2(double number)
{
    double temp = Math.round(number*100);
    return temp/100;
    
}
}
