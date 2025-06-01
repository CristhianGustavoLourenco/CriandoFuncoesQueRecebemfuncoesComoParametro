/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import entities.Product;
import java.util.List;

/**
 *
 * @author crist
 */
public class ProductService {
    public double filteredSum(List<Product> list){
        double sum = 0.0;
        for(Product p : list){
            if(p.getName().charAt(0) == 'T'){
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
