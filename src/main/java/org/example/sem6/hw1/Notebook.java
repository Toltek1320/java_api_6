package org.example.sem6.hw1;

public class Notebook {
    private final String name;
    private final String color;
    private final int amountRAM;
    private final String operatingSystem;
    private final int price;
    private final String model;

    Notebook(String name, String color, int amountRAM, String operatingSystem, int price, String model) {
        this.name = name;
        this.color = color;
        this.amountRAM = amountRAM;
        this.operatingSystem = operatingSystem;
        this.price = price;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Ноутбук: (" + name + "): " +
                "цвет:" + color +
                ", количество опретивной памяти:" + amountRAM +
                ", операционная система: " + operatingSystem + '\'' +
                ", цена: " + price +
                ", модель: " + model;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAmountRAM() {
        return amountRAM;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public int getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

}

