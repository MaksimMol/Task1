package com.example.task6;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Controller {

    @FXML
    private ListView<Shape> listView;

    @FXML
    private ColorPicker colorPicker;

    @FXML
    private Canvas canvas;

    private ObservableList<Shape> items;

    public void initialize() {
        //Инициализация списка фигур
        items = FXCollections.observableArrayList(
                new Circle(), new Square(), new Rectangle(), new Triangle()
        );
        listView.setItems(items);

        //Установка режима выбора одного элемента
        listView.getSelectionModel().setSelectionMode(javafx.scene.control.SelectionMode.SINGLE);
    }

    //Рисование фигуры
    @FXML
    public void drawShape(MouseEvent mouseEvent) {
        GraphicsContext gc = canvas.getGraphicsContext2D(); // Получаем контекст рисования

        //Получение индекса выбранной фигуры
        int index = listView.getSelectionModel().getSelectedIndex();
        if (index == -1) return;

        Color color = colorPicker.getValue();

        // Получение фигуры из списка и клонирование
        Shape shape = (Shape) items.get(index).clone();
        if (shape == null) return;

        shape.setColor(color);
        shape.setXY(mouseEvent.getX(), mouseEvent.getY());
        shape.draw(gc);
    }

}
