package com.example.task8;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Star extends TreeDecorator {

    public Star(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public void Operation(Pane pane) {
        super.Operation(pane);
        drawStar(pane);
    }

    private void drawStar(Pane pane) {
        Polygon star = new Polygon(
                250.0, 0.0,
                257.0, 20.0,
                280.0, 20.0,
                260.0, 30.0,
                265.0, 50.0,
                250.0, 38.0,
                235.0, 50.0,
                240.0, 30.0,
                220.0, 20.0,
                243.0, 20.0
        );
        star.setFill(Color.GOLD);
        pane.getChildren().add(star);
    }

    @Override
    public String decorate() {
        return super.decorate() + ", Звезда";
    }

    @Override
    public float cost() {
        return super.cost() + 300.0f;
    }
}
