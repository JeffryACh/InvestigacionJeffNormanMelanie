/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un producto compuesto
 * 
 * @author JeffryACh
 * 
 * CompositeProduct
 */
public class CompositeProduct extends AbstractProduct {
    // Atributos
    private List<AbstractProduct> products = new ArrayList<AbstractProduct>();
    
    /**
     * Constructor por defecto
     * @param name - Nombre del producto
     */
    public CompositeProduct(String name) {
        super(name, 0);   
    }
    
    // Métodos

    /**
     * Método que devuelve el precio del producto
     * @return double - Precio del producto
     */
    @Override
    public double getPrice() {
        double price = 0d;
        for (AbstractProduct child : products) {
            price += child.getPrice();   
        }
        return price; 
    }
    
    /**
     * Método que establece el precio del producto
     * @param price - Precio del producto
     */
    @Override
    public void setPrice(double price) {
        throw new UnsupportedOperationException();   
    }       
    
    /**
     * Método que añade un producto a la lista de productos
     * @param product - Producto a añadir
     */
    public void addProduct(AbstractProduct product) {
        this.products.add(product);   
    }
    
    /**
     * Método que borra un producto de la lista de productos
     * @param product - Producto a borrar
     * @return boolean - True si se ha borrado el producto, false en caso contrario
     */
    public boolean removeProduct(AbstractProduct product) {
        return this.products.remove(product);
    }
}