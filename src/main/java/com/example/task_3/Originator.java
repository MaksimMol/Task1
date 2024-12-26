package com.example.task_3;
import javafx.scene.shape.Shape;

public class Originator {
    private Shape shape;

    // Установка фигуры
    public void setShape(Shape shape) {
        this.shape = shape;
    }

    // Создание снимка (Memento)
    public Memento createMemento() {
        return new Memento(shape);
    }
}