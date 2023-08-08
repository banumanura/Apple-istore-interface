/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manura
 */
public class items_2 {

    private static interface Itema_2 {
    }
    public interface Product {
    public String getName();
    public int getPrice();
}

public abstract class Apple_stock implements Items {
    private String name;
    private int price;
    // Other fields and methods
    
    
    public String getName() {
        return name;
    }

    
    public int getPrice() {
        return price;
    }
}

public class UpdatedInsert implements Itema_2 {
    private String name;
    private String price;
    private String code;
     private String type;
    // Other fields and methods
    
    
    public String getName() {
        return name;
    }

    
    public String getPrice() {
        return price;
    }
    
    public String getVersion() {
        return type;
    }
}
    
}
