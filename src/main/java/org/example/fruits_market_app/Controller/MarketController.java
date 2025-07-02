package org.example.fruits_market_app.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MarketController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}