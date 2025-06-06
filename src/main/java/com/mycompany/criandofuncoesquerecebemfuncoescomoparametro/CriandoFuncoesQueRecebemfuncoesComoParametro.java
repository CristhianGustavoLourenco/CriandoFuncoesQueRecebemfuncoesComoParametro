/*.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.criandofuncoesquerecebemfuncoescomoparametro;

import entities.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import util.ProductService;

/**
 *
 * @author crist
 */
public class CriandoFuncoesQueRecebemfuncoesComoParametro {

    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
       
       list.add(new Product("Tv", 900.00));
       list.add(new Product("Mouse", 50.00));
       list.add(new Product("Tablet", 350.50));
       list.add(new Product("HD Case", 80.90));
       
       ProductService ps= new ProductService();
       double sum = ps.filteredSum(list);
       
       System.out.println("Sum = " + String.format("%.2f", sum));
    }
}
