package com.example.task8;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Balls extends TreeDecorator {

    public Balls(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public void Operation(Pane pane) {
        super.Operation(pane);
        drawBalls(pane);
    }


        public void drawBalls(Pane pane){
            int baseX = 250;
            int radius = 8;

            //шары на маленьком треугольнике
            int topVerticalPos = 105;
            int topBallX1 = baseX - 30;
            int topBallX2 = baseX + 30;

            Circle topBall1 = new Circle(topBallX1, topVerticalPos, radius);
            topBall1.setFill(Color.RED);
            pane.getChildren().add(topBall1);
            Circle topBall2 = new Circle(topBallX2, topVerticalPos, radius);
            topBall2.setFill(Color.RED);
            pane.getChildren().add(topBall2);

            //шары на среднем треугольнике
            int middleVerticalPos = 175;
            int middleBallX1 = baseX - 55;
            int middleBallX2 = baseX + 55;

            Circle middleBall1 = new Circle(middleBallX1, middleVerticalPos, radius);
            middleBall1.setFill(Color.AQUA);
            pane.getChildren().add(middleBall1);
            Circle middleBall2 = new Circle(middleBallX2, middleVerticalPos, radius);
            middleBall2.setFill(Color.AQUA);
            pane.getChildren().add(middleBall2);

            //шары на большом треугольнике
            int largeVerticalPos = 250;
            int largeBallX1 = baseX - 80;
            int largeBallX2 = baseX + 80;

            Circle largeBall1 = new Circle(largeBallX1, largeVerticalPos, radius);
            largeBall1.setFill(Color.BLUE);
            pane.getChildren().add(largeBall1);
            Circle largeBall2 = new Circle(largeBallX2, largeVerticalPos, radius);
            largeBall2.setFill(Color.BLUE);
            pane.getChildren().add(largeBall2);
        }


        @Override
    public String decorate() {
        return super.decorate() + ", Шары";
    }

    @Override
    public float cost() {
        return super.cost() + 4000.0f;
    }
}
