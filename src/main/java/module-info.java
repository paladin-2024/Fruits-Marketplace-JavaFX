module org.example.fruits_market_app {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.desktop;

    exports org.example.fruits_market_app.Controller;
    opens org.example.fruits_market_app.Controller to javafx.fxml;
    exports org.example.fruits_market_app.main;
    opens org.example.fruits_market_app.main to javafx.fxml;
}