import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;

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
    
    private String[] dogPhotos = {"https://images.dog.ceo/breeds/ovcharka-caucasian/IMG_20190602_204319.jpg",
                                 "https://images.dog.ceo/breeds/retriever-curly/n02099429_3026.jpg",
                                 "https://images.dog.ceo/breeds/sharpei/noel.jpg",
                                 "https://images.dog.ceo/breeds/terrier-tibetan/n02097474_4875.jpg",
                                 "https://images.dog.ceo/breeds/doberman/n02107142_3488.jpg"};

    @FXML
    void checkFalse(ActionEvent event) {

    }

    @FXML
    void checkTrue(ActionEvent event) {

    }

}
