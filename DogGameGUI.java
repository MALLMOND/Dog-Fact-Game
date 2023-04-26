/*
   Dog Game GUI Application
   by Eric Reese, Michael Allmond, Fatiha Kariche
*/ 

import javafx.fxml.FXML;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


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
      
      //Create a Label control
      Label message1 = new Label("Question:");
      HBox hbox = new HBox(message1);
      hbox.setAlignment(Pos.TOP_CENTER);




      //Middle of Page prompt
      Label messageTrue = new Label("ITS A FACT!");
      HBox hbox2 = new HBox(messageTrue);
      hbox2.setAlignment(Pos.CENTER_LEFT);
      
      
      //Middle of Page False Prompt
      Label messageFalse = new Label("ITS FALSE!");
      HBox hbox3 = new HBox(messageTrue);
      hbox3.setAlignment(Pos.CENTER_RIGHT);
      
      
      /* 
      Creates a scene with the Hbox as its root node. 
      800x600 resolution
      */
      Scene scene = new Scene(hbox, 800, 600);
      
      
      
      
      
      
      //Adds the scene to the stage
      primaryStage.setScene(scene);
      
      //shows the window
      primaryStage.show();
            
   }
   
   

}