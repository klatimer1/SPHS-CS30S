/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.forloopdemo2;
import java.util.Scanner;

/**
 * For Loop Demo 2
 * Replacing Variables in the For Loop header
 * @author klatimer
 */
public class ForLoopDemo2 {

    public static void main(String[] args) {
        int startingNumber;
        Scanner myScanner = new Scanner(System.in); // open the scanner
        System.out.print("Please enter your starting number: ");
        startingNumber = myScanner.nextInt();
        for (int count = startingNumber; count <=10; count++)
        {
            System.out.print (count + " ");
        } //end for
    } // end main
} //end class
