package com.alina.calculator;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GUI {

  public void start(Stage stage) throws Exception {
    
    Group root = new Group();
    Scene scene = new Scene(root, Color.LIGHTSKYBLUE);
    Image icon = new Image(getClass().getResourceAsStream("/calculator.png"));

    Image addButton = new Image(getClass().getResourceAsStream("/buttons/plus.png"));
    Image subButton = new Image(getClass().getResourceAsStream("/buttons/minus.png"));
    Image mulButton = new Image(getClass().getResourceAsStream("/buttons/sternchen.png"));
    Image divButton = new Image(getClass().getResourceAsStream("/buttons/schragstrich.png"));

    ImageView add = new ImageView(addButton);
    ImageView sub = new ImageView(subButton);
    ImageView mul = new ImageView(mulButton);
    ImageView div = new ImageView(divButton);
    ImageView[] buttons = {add, sub, mul, div};
    int[] yPositions = {80, 180, 280, 380};

    for(int i = 0; i < buttons.length; i++) {
      buttons[i].setX(300);
      buttons[i].setY(yPositions[i]);
      buttons[i].setFitWidth(50);
      buttons[i].setPreserveRatio(true);
    }

    root.getChildren().addAll(add, sub, mul, div);

    stage.setTitle("Calculator");
    stage.getIcons().addAll(icon);
    stage.setWidth(400);
    stage.setHeight(500);
    stage.setResizable(false);
    stage.centerOnScreen();
    
    stage.setScene(scene);
    stage.show();

  }

}
