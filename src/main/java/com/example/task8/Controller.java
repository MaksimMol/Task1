package com.example.task8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Pane paintpane;

    @FXML
    private Label statusLabel;

    @FXML
    private Button lightsButton, ornamentsButton, presentsButton, tinselButton, addAllButton, exitButton, starButton;

    private ChristmasTree tree;
    private TreeDecorator dtree;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tree = new ChristmasTreeImpl();
        dtree = null;
        tree.Operation(paintpane);
        updateStatus();
    }

    public void addLights(ActionEvent actionEvent) {
        if (dtree == null)
            dtree = new Garland(tree);
        else
            dtree = new Garland(dtree);

        dtree.Operation(paintpane);
        updateStatus();
    }

    public void addOrnaments(ActionEvent actionEvent) {
        if (dtree == null)
            dtree = new Balls(tree);
        else
            dtree = new Balls(dtree);

        dtree.Operation(paintpane);
        updateStatus();
    }

    public void addPresents(ActionEvent actionEvent) {
        if (dtree == null)
            dtree = new Presents(tree);
        else
            dtree = new Presents(dtree);

        dtree.Operation(paintpane);
        updateStatus();
    }

    public void addStar(ActionEvent actionEvent) {
        if (dtree == null)
            dtree = new Star(tree);
        else
            dtree = new Star(dtree);

        dtree.Operation(paintpane);
        updateStatus();
    }

    public void addTinsel(ActionEvent actionEvent) {
        if (dtree == null)
            dtree = new Tinsel(tree);
        else
            dtree = new Tinsel(dtree);

        dtree.Operation(paintpane);
        updateStatus();
    }

    public void addAll(ActionEvent actionEvent) {
        if (dtree == null)
            dtree = new Star(new Tinsel(new Garland(new Balls(new Presents(tree)))));
        else
            dtree = new Star(new Tinsel(new Garland(new Balls(new Presents(dtree)))));

        dtree.Operation(paintpane);
        updateStatus();
    }

    private void updateStatus() {
        String decoration = (dtree == null) ? "Ёлка" : dtree.decorate();
        float cost = (dtree == null) ? tree.cost() : dtree.cost();
        statusLabel.setText("Декорации: " + decoration + ", цена " + cost + " руб.");
    }

    public void exit(ActionEvent actionEvent) {
        System.exit(0);
    }
}
