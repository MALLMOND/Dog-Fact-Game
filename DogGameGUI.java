/*
   Dog Game GUI Application
   by Eric Reese, Michael Allmond, Fatiha Kariche
*/ 


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;


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
      
      
      Label messageLabel = new Label("Its a Fact!");
      
      HBox hbox = new HBox(messageLabel);
      
      Scene scene = new Scene(hbox);
      
      
      //shows the window
      primaryStage.show();
      
      
      
   }
   
   

}