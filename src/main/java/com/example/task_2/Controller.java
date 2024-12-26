package com.example.task_2;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class Controller {

    @FXML
    private TextField sidesField;

    @FXML
    private MenuButton colorMenu;

    @FXML
    private Canvas canvas;

    @FXML
    private Label descriptionLabel;

    private ShapeFactory shapeFactory = new ShapeFactory();
    private Color selectedColor = Color.ORANGE;

    @FXML
    public void initialize() {
        // Добавление обработчиков для выбора цветов
        MenuItem redItem = new MenuItem("Красный");
        redItem.setOnAction(e -> selectedColor = Color.RED);

        MenuItem greenItem = new MenuItem("Зеленый");
        greenItem.setOnAction(e -> selectedColor = Color.GREEN);

        MenuItem blueItem = new MenuItem("Синий");
        blueItem.setOnAction(e -> selectedColor = Color.BLUE);

        MenuItem orangeItem = new MenuItem("Оранжевый");
        orangeItem.setOnAction(e -> selectedColor = Color.ORANGE);

        MenuItem BlackItem = new MenuItem("Черный");
        BlackItem.setOnAction(e -> selectedColor = Color.BLACK);

        MenuItem PinkItem = new MenuItem("Розовый");
        PinkItem.setOnAction(e -> selectedColor = Color.PINK);

        colorMenu.getItems().addAll(redItem, greenItem, blueItem, orangeItem, BlackItem, PinkItem);
    }

    @FXML
    public void drawShape() {
        if (sidesField.getText().isEmpty()) {
            descriptionLabel.setText("Пожалуйста, введите количество сторон.");
            return;
        }
        int sides;
        try {
            sides = Integer.parseInt(sidesField.getText());
            if (sides < 0) {
                descriptionLabel.setText("Количество сторон должно быть 0 или больше.");
                return;
            }
        } catch (NumberFormatException e) {
            descriptionLabel.setText("Введите корректное число сторон.");
            return;
        }

        // Создаем фигуру через фабричный метод
        Shape shape = shapeFactory.createPolygon(sides, selectedColor);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        if (shape != null) {
            String description = shape.descriptor();
            descriptionLabel.setText("Фигура: " + description);
            shape.draw(gc);
        } else {
            descriptionLabel.setText("Неправильное колличество сторон!");
        }
    }
}