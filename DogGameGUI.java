/*
   Dog Game GUI Application
   by Eric Reese, Michael Allmond, Fatiha Kariche
*/ 

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Pos;


import javafx.fxml.FXML;




public class DogGameGUI extends Application
{

   public static void main(String[] args)
   {
      //launches the application
      launch(args);      
   }
   
   
   @Override
   public void start(Stage primaryStage)
   {
   
      //stage title
      primaryStage.setTitle("Dog Gone: Dog Facts!");
      
      //Create a Label control, message, aligns top of page
      Label message1 = new Label("Question:");
      HBox hbox = new HBox(message1);
      hbox.setAlignment(Pos.TOP_CENTER);




      //Middle of Page True Button prompt
      Button messageTrue = new Button("ITS A FACT!");
      
      
      //Middle of Page False Button Prompt
      Button messageFalse = new Button("ITS FALSE!");
      
      
      /* Creates a scene with the Hbox as its root node. 
      800x600 resolution */
      Scene scene = new Scene(hbox, 800, 600);
      
      
      
      //*******Image Code goes here********
      
      
      
      
      //Adds the scene to the stage
      primaryStage.setScene(scene);
      
      //shows the window
      primaryStage.show();
            
   }
   
   

}