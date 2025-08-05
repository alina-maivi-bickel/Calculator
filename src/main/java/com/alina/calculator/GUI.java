package com.alina.calculator;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GUI {

  public void start(Stage stage) throws Exception {
    
    VBox root = new VBox(5);
    root.setPadding(new Insets(20));
    root.setAlignment(Pos.TOP_CENTER);
    root.getStyleClass().add("vbox");

    //Field at the top
    TextField field = new TextField();
    field.setEditable(false);
    field.setText("0");
    field.setFont(Font.font("Monospaced", 50));
    field.setMaxWidth(350);
    field.setAlignment(Pos.CENTER_RIGHT);
    field.setFocusTraversable(false);
    VBox.setMargin(field, new Insets(5, 0, 5, 0));

    //Arithmetic and Number Buttons
    GridPane grid = new GridPane();
    grid.setHgap(10.0);
    grid.setVgap(10.0);
    grid.setPadding(new Insets(5, 10, 0, 10));

    String[] numberNames = {"seven", "eight", "nine", "plus", 
                            "four", "five", "six", "minus", 
                            "one", "two", "three" , "sternchen", 
                            "delete", "zero", "equals", "schragstrich"};

    for (int i = 0; i < numberNames.length; i++) {
      String path = "/buttons/" + numberNames[i] + ".png";
      ImageView view = new ImageView(new Image(getClass().getResourceAsStream(path)));
      view.setFitWidth(60);
      view.setPreserveRatio(true);

      Button btn = new Button();
      btn.setGraphic(view);
      btn.setStyle("-fx-background-color: transparent; -fx-border-color: transparent;");

      int row = i / 4;
      int col = i % 4;

      grid.add(btn, col, row);
    }

    root.getChildren().addAll(field, grid);

    Scene scene = new Scene(root, 400, 500, Color.LIGHTSKYBLUE);
    Image icon = new Image(getClass().getResourceAsStream("/calculator.png"));

    //CSS-Styling
    scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
    
    //Stage
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
