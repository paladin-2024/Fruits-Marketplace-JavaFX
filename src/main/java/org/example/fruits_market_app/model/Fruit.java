package org.example.fruits_market_app.model;

public class Fruit {
    private String name;
    private double price;
    private String imageSrc;
    private String color;

    public Fruit(String name, double price, String imageSrc) {
        this.name = name;
        this.price = price;
        this.imageSrc = imageSrc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
