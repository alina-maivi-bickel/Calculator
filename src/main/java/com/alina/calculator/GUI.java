package com.alina.calculator;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GUI {

  public void start(Stage stage) throws Exception {
    
    Group root = new Group();
    Scene scene = new Scene(root, Color.LIGHTSKYBLUE);
    Image icon = new Image(getClass().getResourceAsStream("/calculator.png"));


    stage.setTitle("Calculator");
    stage.getIcons().add(icon);
    stage.setWidth(400);
    stage.setHeight(500);
    stage.setResizable(false);
    stage.centerOnScreen();
    

    stage.setScene(scene);
    stage.show();

  }

}
