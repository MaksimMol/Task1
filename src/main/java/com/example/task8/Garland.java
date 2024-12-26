package com.example.task8;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Garland extends TreeDecorator {

    public Garland(ChristmasTree tree) {
        super(tree);
    }

    @Override
    public void Operation(Pane pane) {
        super.Operation(pane);
        drawLights(pane);
    }

    private void drawLights(Pane pane) {
        int baseX = 250;
        int radius = 4;

        Circle[] lights = new Circle[10];
        lights[0] = createLight(baseX - 45, 135, radius, pane);
        lights[1] = createLight(baseX + 45, 135, radius, pane);
        lights[2] = createLight(baseX, 135, radius, pane);
        lights[3] = createLight(baseX - 70, 215, radius, pane);
        lights[4] = createLight(baseX + 70, 215, radius, pane);
        lights[5] = createLight(baseX, 215, radius, pane);
        lights[6] = createLight(baseX - 100, 285, radius, pane);
        lights[7] = createLight(baseX + 100, 285, radius, pane);
        lights[8] = createLight(baseX, 285, radius, pane);
        lights[9] = createLight(baseX, 70, radius, pane);

        animateLights(lights);
    }

    private Circle createLight(int x, int y, int radius, Pane pane) {
        Circle light = new Circle(x, y, radius);
        light.setFill(Color.WHITE);
        pane.getChildren().add(light);
        return light;
    }

    private void animateLights(Circle[] lights) {
        Timeline timeline = new Timeline();

        // Создаем анимацию для каждого шара
        for (int i = 0; i < lights.length; i++) {
            int index = i;
            timeline.getKeyFrames().add(new KeyFrame(
                    Duration.seconds(i * 0.5),
                    event -> {
                        lights[index].setFill(Color.color(Math.random(), Math.random(), Math.random()));
                    }
            ));
        }

        timeline.getKeyFrames().add(new KeyFrame(
                Duration.seconds(5),
                event -> {
                    for (Circle light : lights) {
                        light.setFill(Color.color(Math.random(), Math.random(), Math.random()));
                    }
                }
        ));

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    @Override
    public String decorate() {
        return super.decorate() + ", Гирлянда";
    }

    @Override
    public float cost() {
        return super.cost() + 700.0f;
    }
}
