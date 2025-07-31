package com.alina.calculator;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application{

    public static void main(String[] args) {
        launch(args);
        
    }

    @Override
    public void start(Stage stage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);
        stage.setTitle("Calculator");
        Image icon = new Image(getClass().getResourceAsStream("/calculator.png"));
        stage.getIcons().add(icon);

        stage.setScene(scene); 

        stage.show();
    }
}
