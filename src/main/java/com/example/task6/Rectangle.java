package com.example.task6;

import javafx.scene.canvas.GraphicsContext;

public class Rectangle extends Shape {
    private double width = 100;
    private double height = 50;

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillRect(x, y, width, height);
    }
}
