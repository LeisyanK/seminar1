package org.example.seminar3.hw;

import org.example.seminar3.hw.model.Products1;

import java.util.ArrayList;
import java.util.List;

/**
 * Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */
public class Zadanie1 {
    public static void main(String[] args) {
        Products1 product1 = new Products1("яблоко высший сорт", 100, 1);
        Products1 product2 = new Products1("груша конференц", 200, 1);
        Products1 product3 = new Products1("арбуз высший сорт", 300, 2);
        Products1 product4 = new Products1("дыня высший сорт", 150, 3);
        Products1 product5 = new Products1("банан", 90, 2);
        List<Products1> allProd = new ArrayList<>();
        allProd.add(product1);
        allProd.add(product2);
        allProd.add(product3);
        allProd.add(product4);
        allProd.add(product5);
        System.out.println(allProd);

        int maxPrice = 0;
        for (int i = 0; i < allProd.size(); i++) {
            Products1 prod = allProd.get(i);
            if ((prod.getSort() == 1 || prod.getSort() == 2) && prod.getName().contains("высший") && prod.getPrice() > maxPrice) {
                maxPrice = prod.getPrice();
            }
        }
        System.out.println("Наибольшая цена = " + maxPrice);
    }

}
