package com.BinhAn;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.resize(Math.random() * 100);
        System.out.println(circle);
        Rectangle rectangle = new Rectangle();
        rectangle.resize(Math.random() * 100);
        System.out.println(rectangle);
    }
}
