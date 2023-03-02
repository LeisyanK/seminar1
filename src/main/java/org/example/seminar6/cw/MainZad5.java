package org.example.seminar6.cw;

/**
 * Напишите интерфейс Converter для конвертации из градусов по Цельсию в
 * <p>
 * Кельвины, Фаренгейты. У классов наследников необходимо переопределить метод интерфейса, для валидного
 * перевода величин. Метод для конвертации назовите "convertValue".
 */
public class MainZad5 {
    public static void main(String[] args) {
        double temp = 37.0;
        System.out.println("В Фарингейтах = " + new Fahrenheit().convertValue(temp));
        System.out.println("В Кельвинах = " + new Kelvin().convertValue(temp));
        System.out.println("В Рейнюрах = " + new Reunyura().convertValue(temp));
        System.out.println("В Цельсиях = " + new Celsius().convertValue(temp));
    }
}
