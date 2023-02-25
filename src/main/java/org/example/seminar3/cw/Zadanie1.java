package org.example.seminar3.cw;

import org.example.seminar3.cw.model.Items;

import java.util.ArrayList;
import java.util.List;

public class Zadanie1 {
    public static void main(String[] args) {

        Items items = new Items( "qwe",  "asd", 3);
        Items items2 = new Items( "qwe2",  "asd2", 3);
        Items items3 = new Items( "qwe3",  "asd3", 3);
        Items items4 = new Items( "qwe",  "xyz", 4);
        List<Items> itemsList = new ArrayList<>();
        itemsList.add(items);
        itemsList.add(items2);
        itemsList.add(items3);
        itemsList.add(items4);
        System.out.println(itemsList); //.toString());
        String searchName = "qwe";
        Integer sumValue = 0;
        List<String>  country = new ArrayList<>();
        for (int i = 0; i < itemsList.size(); i++) {
            if (itemsList.get(i).getName().equals(searchName)){
//                country.add(itemsList.get(i).getCountry());
                sumValue += itemsList.get(i).getValue();
                Boolean flag = true;
                for (int j = 0; j < country.size(); j++) {
                    if(itemsList.get(i).getCountry().equals(country.get(j))){
                        flag = false;
                    }
                }
                if (flag) {
                    country.add(itemsList.get(i).getCountry());
                }
            }
        }
        System.out.println("countries = " + country);
        System.out.println("sumValue = " + sumValue);
    }
}
