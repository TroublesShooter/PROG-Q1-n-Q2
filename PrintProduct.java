/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
 public class PrintProduct {
     private Product product;
     
     public PrintProduct(Product product) {
         this.product = product;
     }
     public void printTotalSales() {
         System.out.println("Total product Sales: " + product.GetTotalProductsSold());
     }
     public void printAverageSales() {
         System.out.println("Average product Sales: " + (int) product.GetAverageProductSold());
     }
     public void printMostPopular() {
         System.out.println("Most Popular Product: " + product.GetMostPopularProduct());
        }
     
    
}
