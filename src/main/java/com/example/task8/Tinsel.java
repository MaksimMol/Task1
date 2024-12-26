package com.example.task8;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import java.util.Random;

public class Tinsel extends TreeDecorator {

    public Tinsel(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public void Operation(Pane pane) {
        super.Operation(pane);
        drawTinsel(pane);
    }

    private void drawTinsel(Pane pane) {
        Random random = new Random();
        int[][] tinselLevels = {
                {191, 120, 309, 120}, // Верхний уровень
                {169, 190, 331, 190}, // Средний уровень
                {148, 265, 352, 265}  // Нижний уровень
        };

        for (int[] coords : tinselLevels) {
            int x1 = coords[0]; // Начальная X
            int y1 = coords[1]; // Начальная Y
            int x2 = coords[2]; // Конечная X
            int y2 = coords[3]; // Конечная Y

            Line tinsel = new Line(x1, y1, x2, y2);

            tinsel.setStroke(Color.color(random.nextDouble(), random.nextDouble(), random.nextDouble()));
            tinsel.setStrokeWidth(4);

            pane.getChildren().add(tinsel);
        }
    }

    @Override
    public String decorate() {
        return super.decorate() + ", Мишура";
    }

    @Override
    public float cost() {
        return super.cost() + 1000.0f;
    }
}
