/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class productCalculations implements IProductCalculations{
    private static final double VAT_RATE = 0.15;
    private static final double COMMISSION_RATE = 0.05;

    @Override
    public double GetVAT(double price) {
        return price * VAT_RATE;
    }

    @Override
    public double GetCommission(double price) {
        return price * COMMISSION_RATE;
    }

    @Override
    public double GetTotalSale(double price) {
        return price + GetVAT(price) + GetCommission(price);
        
    }
    
}
