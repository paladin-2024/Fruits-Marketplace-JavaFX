package org.example.fruits_market_app.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.example.fruits_market_app.main.Main;
import org.example.fruits_market_app.main.MyListener;
import org.example.fruits_market_app.model.Fruit;

public class ItemController {

    @FXML
    private Label nameLabel;

    @FXML
    private Label priceLabel;

    @FXML
    private ImageView img;

    private Fruit fruit;

    private MyListener myListener;

    public void setData(Fruit fruit) {
        this.fruit = fruit;
        nameLabel.setText(fruit.getName());
        priceLabel.setText(Main.CURRENCY + fruit.getPrice());
        Image image = new Image(getClass().getResourceAsStream(fruit.getImageSrc()));
        img.setImage(image);
    }
}
