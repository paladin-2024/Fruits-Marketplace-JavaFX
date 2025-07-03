package org.example.fruits_market_app.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import javax.swing.text.html.ImageView;

public class MarketController {

    @FXML
    private VBox chosenFruitCard;
    @FXML
    private Label fruitNameLabel;
    @FXML
    private Label fruitPriceLabel;
    @FXML
    private ImageView fruitImg;
    @FXML
    private ScrollPane scroll;
    @FXML
    private GridPane grid;
}