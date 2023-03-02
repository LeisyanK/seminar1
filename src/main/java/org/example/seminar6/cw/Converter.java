package org.example.seminar6.cw;

/**
 * Напишите интерфейс Converter для конвертации из градусов по Цельсию в
 *
 * Кельвины, Фаренгейты. У классов наследников необходимо переопределить метод интерфейса, для валидного
 * перевода величин. Метод для конвертации назовите "convertValue".
 */
public interface Converter {
    double convertValue(double value);
}
