package com.example.task6;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends Shape {

    private double side = 50;

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillRect(x - side / 2, y - side / 2, side, side);
    }

    @Override
    public String toString() {
        return "Square";
    }
}
