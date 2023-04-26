/*
   Dog Game GUI Application
   by Eric Reese, Michael Allmond, Fatiha Kariche
*/ 


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.geometry.Pos;


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
      primaryStage.setTitle("Dog Gone Dog Facts!");
      
      //Create a Label control
      Label message1 = new Label("Its a Fact!");
      
      //Puts the label in an Hbox
      HBox hbox = new HBox(message1);
      
      /*Creates a scene with the Hbox as its root node. 
         800x600 resolution
      */
      Scene scene = new Scene(hbox, 800, 600);
      
      //Adds the scene to the stage
      primaryStage.setScene(scene);
      
      //shows the window
      primaryStage.show();
            
   }
   
   

}