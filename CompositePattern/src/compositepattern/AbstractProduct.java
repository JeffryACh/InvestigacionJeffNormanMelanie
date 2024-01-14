
package compositepattern;

/**
 * Clase abstracta que representa un producto que puede ser simple o compuesto
 * 
 * @author JeffryACh
 * 
 * AbstractProduct
 */
public abstract class AbstractProduct {
    // Atributos
    /**
     * name - Nombre del producto
     */
    protected String name;
    /**
     * price - Precio del producto
     */
    protected double price;       

    /**
     * Constructor por defecto
     * @param name - Nombre del producto
     * @param price - Precio del producto
     */
    public AbstractProduct(String name, double price) {
        super();

        this.name = name;
        this.price = price;
    }

    // Métodos

    /**
     * Método que devuelve el nombre del producto
     * @return String - Nombre y precio del producto
     */
    public String getName() {
        return name;
    }

    /**
     * Método que establece el nombre del producto
     * @param name - Nombre del producto
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método que devuelve el precio del producto
     * @return double - Precio del producto
     */
    public double getPrice() {
        return price;
    }

    /**
     * Método que establece el precio del producto
     * @param price - Precio del producto
     */
    public void setPrice(double price) {
        this.price = price;
    }
}      