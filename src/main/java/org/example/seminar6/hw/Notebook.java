package org.example.seminar6.hw;

public class Notebook {
    private Integer id;
    private String name;
    private String model;
    private Integer ram;
    private Integer hardDrive;
    private String OS;
    private String color;
    private Double price;
    private Boolean defected;
    public Notebook() {
    }

    public Notebook(Integer id, String name, String model, Integer ram, Integer hardDrive, String OS, String color, Double price, Boolean defected) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.OS = OS;
        this.color = color;
        this.price = price;
        this.defected = defected;
    }
}
