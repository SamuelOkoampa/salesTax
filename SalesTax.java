/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.salestax;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class SalesTax {

    public static void main(String[] args) {
        Scanner shem = new Scanner(System.in);
        
        //Declare variables
        double purchase;
        double stateSalesTax = 0.04, countrySalesTax = 0.02, totalSalesTax, totalSales;
        
        //Accept user's input purchse
        System.out.println("Enter the amount of purchase:");
        purchase = shem.nextDouble();
        
        //Compute total sales tax
        totalSalesTax = stateSalesTax + countrySalesTax;
        totalSales = purchase + totalSalesTax;
        
        //Print purchase
        System.out.println("Purchase = " + purchase );
        
        //Print state sales tax
        System.out.println("State sales tax = " + stateSalesTax);
        
        //Print country's sales tax
        System.out.println("Country sales tax = " + countrySalesTax);
        
        //Print total sales tax
        System.out.println("Therefore, the total sales tax = " + totalSalesTax);
        
        
    }
}
