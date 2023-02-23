package org.example.seminar2.cw2;

public class Zadanie4 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1, 1, 1);
        Vector vector2 = new Vector(1, 2, 1);

        System.out.println(vector1.getX());
        System.out.println(vector1.toString());
        System.out.println("Vector= " + vector1.length());
        System.out.println("scal = " + vector1.scal(vector2));
        System.out.println("векторное произведение = " + vector1.vecPr(vector2));
        System.out.println("косинус" + vector1.cosinus(vector2));
        System.out.println("сумма векторов: " + vector1.sumVec(vector2));
        System.out.println("разность векторов: " + vector1.diffVec(vector2));
    }

}
