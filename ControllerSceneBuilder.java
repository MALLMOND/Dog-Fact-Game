import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import java.util.prefs.Preferences;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.util.Random;
import javafx.application.Platform;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;

import com.google.gson.Gson;

public class ControllerSceneBuilder {

    @FXML
    private ImageView dogImage;

    @FXML
    private Button falseButton;

    @FXML
    private Label questionBanner;

    @FXML
    private ProgressBar questionProgress;

    @FXML
    private Label questionText;

    @FXML
    private Button trueButton;
    
    private DogInfo fact;
    
    private HttpClient client;
    
    private int barProgressAmount = 1;
    
    private int questionNum = 1;
    
    private int questionTotal = 6;
    
    private int questionCorrect = 0;
    
    private String[] dogPhotos = {"https://images.dog.ceo/breeds/ovcharka-caucasian/IMG_20190602_204319.jpg",
                                 "https://images.dog.ceo/breeds/retriever-curly/n02099429_3026.jpg",
                                 "https://images.dog.ceo/breeds/sharpei/noel.jpg",
                                 "https://images.dog.ceo/breeds/terrier-tibetan/n02097474_4875.jpg",
                                 "https://images.dog.ceo/breeds/doberman/n02107142_3488.jpg"};
                                 

    @FXML
    void checkFalse(ActionEvent event) {
      changeImage();
      updateQuestion();
      questionProgress.setProgress(0.2 * questionNum);
         questionNum++;
         
       if(questionNum == questionTotal){
         System.out.println("Score: " + questionCorrect +"/5");
         System.exit(0); 
      }
      
    }

    @FXML
    void checkTrue(ActionEvent event) {
      changeImage();
      updateQuestion();
      questionProgress.setProgress(0.2 * questionNum);
         questionNum++;
         questionCorrect++;
         
      if(questionNum == questionTotal){
         System.out.println("Score: " + questionCorrect +"/5");
         System.exit(0); 
      }
      
            
    }
    
    @FXML
    void changeImage() {
      
      Random ran = new Random();
      int x = ran.nextInt(5);
      
      Image dogPic = new Image(dogPhotos[x]);
      
      dogImage.setImage(dogPic);
      
      Preferences p = Preferences.userNodeForPackage(ControllerSceneBuilder.class);
      
    }
    
    protected void displayQuestion() {
      Random ran = new Random();
      int d = ran.nextInt(5);
      
      questionText.setText(fact.data[d].attributes.body);
    }
    
    protected void processDogFact(String data) {
            
      Gson gson = new Gson();
      this.fact = gson.fromJson(data, DogInfo.class);      
            
      // Schedule UI updates on the GUI thread
      // This is important because the data download happens in the background
      Platform.runLater( new Runnable() {
                           public void run() {
                              displayQuestion();
                           }
                        });
   }
    
    protected void updateQuestion() {
    
      if(this.client == null)
         this.client = HttpClient.newHttpClient();
    
      try {
            HttpRequest request = HttpRequest.newBuilder()
               .uri(new URI("https://dogapi.dog/api/v2/facts?limit=5"))
               .GET()
               .build();
                             
           // Use Java's new :: method reference syntax to schedule callbacks to handle the data once retrieved
           // A callback is code to run later when the data is ready.
           // Note that HttpResponse::body is the same as calling the HttpResponse classes method body() on the response instance returned
           // Note that this::processWeatherData is the same as this.processWeatherData() 
           client.sendAsync(request, BodyHandlers.ofString())
               .thenApply(HttpResponse::body)
               .thenAccept(this::processDogFact);     
           
          } catch(URISyntaxException e) { 
            // This message can be more informative if your API is more complex
            System.out.println("Issue with request");
          }
          
      // Some debugging text for the console.      
      // Again, this should also be reflected in the GUI
      System.out.println("Updating Fact...");
      
   }
   
   @FXML
    public void initialize() {
      updateQuestion();
      questionProgress.setProgress(0.0);  
    }

}
