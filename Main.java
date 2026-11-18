
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //String array
        String[] products = {"Corzy Night Monarch", "Restonic Barbados", " Sealy Phuket"};
        //2D array 
        int[][] sales = new int[3][3];
        
        for (int i=0;i<products.length;i++) {
            for (int j=0;j<3;j++) {
                System.out.print("Enter number of sales for month " +(i + 1) + " for " + products[i] + " mattress: ");
                sales[i][j] = input.nextInt();
            }
            System.out.println();
        }
        
        Product product = new Product(products, sales);
        PrintProduct printer = new PrintProduct(product);
        
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("***************************");
        printer.printTotalSales();
        printer.printAverageSales();
        printer.printMostPopular();
    }
    
}
