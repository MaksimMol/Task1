package com.example.task6;

import javafx.scene.canvas.GraphicsContext;

public class Circle extends Shape {
    private double radius = 50;

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
