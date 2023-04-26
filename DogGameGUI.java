/*
   Dog Game GUI Application
   by Eric Reese, Michael Allmond, Fatiha Kariche
*/ 


import javafx.application.Application;
import javafx.stage.Stage;


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
      primaryStage.setTitle("Doggo Facts!");
      
      //shows the window
      primaryStage.show();
      
   }
   
   

}