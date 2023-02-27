package org.example.seminar3.hw;

import org.example.seminar3.hw.model.Products2;

import java.util.ArrayList;
import java.util.List;

/**
 * Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class Zadanie2 {
    public static void main(String[] args) {
        Products2 prod1 = new Products2("банан", "Эквадор", 115.6, 99, 2);
        Products2 prod2 = new Products2("груша", "Россия", 180.85, 185, 1);
        Products2 prod3 = new Products2("яблоко", "Россия", 230.7, 99, 2);
        Products2 prod4 = new Products2("мандарин", "Морокко", 200.0, 130, 2);
        Products2 prod5 = new Products2("апельсин", "Китай", 105.56, 150, 3);
        Products2 prod6 = new Products2("арбуз", "Узбекистан", 69.4, 250, 1);
        List<Products2> allProd = new ArrayList<>();
        allProd.add(prod1);
        allProd.add(prod2);
        allProd.add(prod3);
        allProd.add(prod4);
        allProd.add(prod5);
        allProd.add(prod6);
        System.out.println(allProd);

        int searchSort = 3;
        int minPrice = 0;
        int count = 0;      // лучше использовать логическую переменную
//        allProd.indexOf(getSort==2)
        for (Products2 prod : allProd) {
            if (prod.getSort() == searchSort) {
                if (count < 1) {
                    minPrice = prod.getPrice();
                    count++;
                } else if (minPrice > prod.getPrice()) {
                    minPrice = prod.getPrice();
                }
            }
        }
        if (minPrice != 0) {
            System.out.println("minPrice = " + minPrice);
            System.out.println("Товары с минимальной ценой сорта " + searchSort);
        } else {
            System.out.println("Нет товаров такого сорта.");
        }

        for (Products2 prod:allProd) {
            if (prod.getPrice() == minPrice){
                System.out.println(prod.getName());
            }
        }
    }

}
