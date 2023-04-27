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
//     Create a Label control, message, aligns top of page
//       Label bannerText = new Label("Question:"); 
// 
// 
// 
// 
//       Middle of Page True Button prompt
//       Button trueButton = new Button("ITS A FACT!");
//       Middle of Page False Button Prompt
//       Button falseButton = new Button("ITS FALSE!");
//       HBox hbox = new HBox(30, trueButton, falseButton);
//       hbox.setAlignment(Pos.TOP_CENTER);
//       
//       
//       
//       *******Image Code goes here********
//       /*
//       Image dogImage = new Image("dogPhotos");
//       ImageView dogImage = new ImageView(dogImage);
//       
//       image.setPreserveRatio(true);
//       */
//       
//       
//       VBox
//       VBox vbox = new VBox(100, bannerText, hbox);
//       vbox.setAlignment(Pos.CENTER);
//       
//       
//       
//       
//       /* Creates a scene with the Hbox as its root node. 
//       800x600 resolution */
//       Scene scene = new Scene(vbox, 600, 400);
//       
//

       
      //Adds the scene to the stage
      primaryStage.setScene(scene);
      
      //shows the window
      primaryStage.show();
            
   }
   

}