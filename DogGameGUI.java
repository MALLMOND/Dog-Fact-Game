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
import javafx.geometry.Insets;

import javafx.event.EventHandler;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;


public class DogGameGUI extends Application
{
   
   private Label myLabel;

   public static void main(String[] args)
   {
      //launches the application
      launch(args);      
   }
   
   
   @Override
   public void start(Stage primaryStage) throws Exception
   {
      
      Parent root = FXMLLoader.load(getClass().getResource("FinalSceneBuilder.fxml"));    
      Scene scene = new Scene(root);   
      
      
      //stage title
      primaryStage.setTitle("Dog Gone: Dog Facts!");

      //Adds the scene to the stage
      primaryStage.setScene(scene);
      
      //shows the window
      primaryStage.show();
            
   }
   

}