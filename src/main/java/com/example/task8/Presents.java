package com.example.task8;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Presents extends TreeDecorator {

    public Presents(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public void Operation(Pane pane) {
        super.Operation(pane);
        drawPresents(pane);
    }

    private void drawPresents(Pane pane) {
        Rectangle gift1 = new Rectangle(200, 350, 50, 50);
        gift1.setFill(Color.RED);
        Rectangle gift2 = new Rectangle(260, 350, 50, 50);
        gift2.setFill(Color.BLUE);
        Rectangle gift3 = new Rectangle(240, 400, 30, 30);
        gift3.setFill(Color.YELLOW);

        pane.getChildren().addAll(gift1, gift2, gift3);
    }

    @Override
    public String decorate() {
        return super.decorate() + ", Подарки";
    }

    @Override
    public float cost() {
        return super.cost() + 5000.0f;
    }
}
