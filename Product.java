/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Product implements IProduct{
    private String[] products;
    private int[][] sales;
    
    public Product(String[] products, int[][] sales) {
        this.products = products;
        this.sales = sales;
    }

    @Override
    public double GetAverageProductsSold() {
        int count = sales.length * sales[0].length;
        return count;
        
        
    }

    @Override
    public String GetMostPopularProduct() {
        int highest = sales[0][0];
        int index = 0;
        for (int i=0;i<sales.length;i++) {
            for (int j=0;j<sales.length;j++) {
                if (sales[i][j]>highest) {
                    highest = sales[i][j];
                    index = i;
                }
            }
        }
        return products[index] + " (" + highest + ")";
        
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int[] row : sales) {
            for (int value : row) {
            }
        }
        return total;
    }
    
}
