package com.example.task8;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class ChristmasTreeImpl implements ChristmasTree {
    @Override
    public void Operation(Pane pane) {
        //Большой треугольник
        Polygon triangle1 = new Polygon(250, 80, 125, 300, 375, 300);
        triangle1.setFill(Color.GREEN);
        //Средний треугольник
        Polygon triangle2 = new Polygon(250, 75, 140, 225, 360, 225);
        triangle2.setFill(Color.GREEN);
        //Маленький треугольник
        Polygon triangle3 = new Polygon(250, 40, 165, 150, 335, 150);
        triangle3.setFill(Color.GREEN);
        //Ствол
        Rectangle trunk = new Rectangle(225, 300, 50, 50);
        trunk.setFill(Color.BROWN);

        pane.getChildren().addAll(triangle1, triangle2, triangle3, trunk);
    }

    @Override
    public String decorate() {
        return "Ёлка";
    }

    @Override
    public float cost() {
        return 5000.0f;
    }
}
