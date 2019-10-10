/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingwithhsqldb;

import java.util.Objects;
import static jdk.nashorn.internal.objects.NativeMath.round;

/**
 *
 * @author Axel
 */
public class ProductEntity {
    public int id;
    public String name;
    public double price;
    
    public ProductEntity(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
	public boolean equals(Object obj) {
            //Override de la méthode equals pour comparer deux produits
            ProductEntity test = (ProductEntity)obj;
            return (test.getId() == this.getId() &&
                    test.getName().equals(this.getName()) &&
                round(test.getPrice(),2) == round(this.getPrice(),2));
	}
    
    @Override
    public String toString() {
	return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + '}';
	}
    
}
