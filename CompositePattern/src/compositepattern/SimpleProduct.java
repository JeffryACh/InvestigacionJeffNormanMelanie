/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepattern;

/**
 * Clase que representa un producto simple
 * 
 * @author JeffryACh
 * 
 * SimpleProduct
 */
public class SimpleProduct extends AbstractProduct {       
    // Atributos
    protected String brand;       
    
    /**
     * Constructor
     * @param name - Nombre del producto
     * @param price - Precio del producto
     * @param brand - Marca del producto
     */
    public SimpleProduct(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;   
    }

    // Métodos
    /**
     * Método que devuelve la marca del producto
     * @return String - Marca del producto
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Método que establece la marca del producto
     * @param brand - Marca del producto
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Método que devuelve el nombre del producto
     * @return String - Nombre y precio del producto
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Método que establece el nombre del producto
     * @param name - Nombre del producto
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método que devuelve el precio del producto
     * @return double - Precio del producto
     */
    @Override
    public double getPrice() {
        return price;
    }

    /**
     * Método que establece el precio del producto
     * @param price - Precio del producto
     */
    @Override
    public void setPrice(double price) {
        this.price = price;
    }

}

