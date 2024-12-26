package com.example.task6;

import javafx.scene.canvas.GraphicsContext;

public class Triangle extends Shape {
    private double size = 100;

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        double[] xPoints = {x, x - size / 2, x + size / 2};
        double[] yPoints = {y - size, y + size / 2, y + size / 2};
        gc.fillPolygon(xPoints, yPoints, 3);
    }
}
