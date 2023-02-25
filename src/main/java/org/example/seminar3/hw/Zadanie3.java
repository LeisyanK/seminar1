package org.example.seminar3.hw;

import org.example.seminar3.hw.model.Books;

import java.util.ArrayList;
import java.util.List;

public class Zadanie3 {
    public static void main(String[] args) {
        Books book1 = new Books("name1", "author1", 110.5, 2015, 120);
        Books book2 = new Books("name2", "author1", 110.5, 2009, 5);
        Books book3 = new Books("name3", "author1", 110.5, 2018, 175);
        Books book4 = new Books("name4", "author1", 110.5, 2022, 13);
        Books book5 = new Books("name5", "author1", 110.5, 2005, 89);
        Books book6 = new Books("name6", "author1", 110.5, 2000, 57);
        Books book7 = new Books("name7", "author1", 110.5, 2010, 111);
        Books book8 = new Books("name8", "Author8", 110.5, 2010, 11);
        Books book9 = new Books("name8", "uthor8", 110.5, 2010, 11);

        List<Books> allBooks = new ArrayList<>();
        allBooks.add(book1);
        allBooks.add(book2);
        allBooks.add(book3);
        allBooks.add(book4);
        allBooks.add(book5);
        allBooks.add(book6);
        allBooks.add(book7);
        allBooks.add(book8);
        allBooks.add(book9);
        System.out.println(allBooks);

        for (int i = 0; i < allBooks.size(); i++) {
            Books elem = allBooks.get(i);
            if (isSimplePage(elem) && isAuthor(elem) && isYear(elem)) {
                System.out.println(elem);
            }
        }
    }

    private static boolean isYear(Books elem) {
        if (elem.getYear() >= 2010) {
            return true;
        }
        return false;
    }

    private static boolean isAuthor(Books elem) {
        if (elem.getAuthor().contains("A") || elem.getAuthor().contains("a")) {
            return true;
        }
        return false;
    }

    private static boolean isSimplePage(Books elem) {
        for (int i = 2; i <= Math.sqrt(elem.getPages()); i++) {
            if (elem.getPages() % i == 0) {
                return false;
            }
        }
        return true;
    }
}
