/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepattern;



import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una orden de venta
 * 
 * @author JeffryACh
 * 
 * SaleOrder
 */
public class SaleOrder {
    // Atributos
    private long orderId;
    private String customer;
    private List<AbstractProduct> products = new ArrayList<AbstractProduct>(); // Productos de la orden

    /**
     * Constructor
     * @param orderId - ID de la orden
     * @param customer - Cliente que realiza la orden
     */
    public SaleOrder(long orderId, String customer) {
        super();
        this.orderId = orderId;
        this.customer = customer;
    }

    // Métodos
    
    /**
     * Método que devuelve el ID de la orden
     * @return price - Precio del producto
     */
    public double getPrice() {
        double price = 0d;
        for (AbstractProduct child : products) {
            price += child.getPrice();
        }           
        
        return price;
    }
    
    /**
     * Método que agrega un producto a la orden
     * @param product - Producto a agregar
     */
    public void addProduct(AbstractProduct product) {
        products.add(product);
    }   

    /**
     * Este método imprime la orden de venta
     */
    public void printOrder() {
        NumberFormat formater = new DecimalFormat("###,##0.00");
        System.out.println("\\\n============================================="  
                + "\nOrden: " + orderId + "\nCliente: " + customer
                + "\nProductos:\n"); 
        for (AbstractProduct prod : products) {
            System.out.println(prod.getName() + "\t\t\t$ "
                    + formater.format(prod.getPrice()));
            
        }
    
        System.out.println("Total: " + formater.format(getPrice()) 
                + "\n=============================================");
    
    }
}