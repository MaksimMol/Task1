package com.example.task6;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape implements Cloneable {
    protected double x, y;
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw(GraphicsContext gc);

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

}
