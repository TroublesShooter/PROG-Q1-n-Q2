/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class ProductCalculationsTest {
    private final ProductCalculations calc = new ProductCalculations();

    @Test
    public void GetVAT_WithValidPrice_ReturnsCorrectValue() {
        assertEquals(525.0, calc.GetVAT(3500), 0.01);
    }

    @Test
    public void GetCommission_WithValidPrice_ReturnsCorrectValue() {
        assertEquals(175.0, calc.GetCommission(3500), 0.01);
    }

    @Test
    public void GetTotalSale_WithValidPrice_ReturnsCorrectValue() {
        assertEquals(4200.0, calc.GetTotalSale(3500), 0.01);
    
}
