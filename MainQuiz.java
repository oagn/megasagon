import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.image.*;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MainQuiz extends Application {

    Stage window;
    Scene scene1, scene2;
    Button button1, button2, button3;
    Text mainLabel, quiztext;
    TextField answer;
    Image robot = new Image ("https://lumiere-a.akamaihd.net/v1/images/gallery_walle_thumbnail_29cb9ba3.jpeg?region=0,0,600,450&width=480", 400, 0, false, false);

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        
        mainLabel = new Text("Welcome to the Computer Science Quiz!");
        mainLabel.setFont(Font.font("Arial", 36));
        
        ImageView iv1 = new ImageView();
        iv1.setImage(robot);
        
        button1 = new Button("Start Quiz");
        button1.setStyle("-fx-font-size: 30pt;");
        button1.setOnAction(e -> {
        	window.setScene(scene2);
        });
        
        HBox topbanner = new HBox(30);
        topbanner.setAlignment(Pos.CENTER);
        topbanner.getChildren().addAll(mainLabel);
        
        
        HBox buttonbanner = new HBox(30);
        buttonbanner.setAlignment(Pos.CENTER);
        buttonbanner.getChildren().addAll(button1);
        
        StackPane picturebit = new StackPane();
        picturebit.getChildren().add(iv1);
        
        
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topbanner);
        borderPane.setBottom(buttonbanner);
        borderPane.setCenter(picturebit);
        
        Scene scene1 = new Scene(borderPane, 800, 500);
        
      
        quiztext = new Text("Example Question: Ada Lovelace was the daughter of...\n\n\n"
        		+ "a: Lord Byron\n"
        		+ "b: Percy Shelley\n"
        		+ "c: John Keats\n"
        		+ "d: William Blake");
        quiztext.setFont(Font.font("Arial", 20));
        
        TextField answer = new TextField();
        
        button2 = new Button("Quit");
        button2.setStyle("-fx-font-size: 30pt;");
        button2.setOnAction(e -> {
        	window.setScene(scene1);
        });
        
        button3 = new Button("Submit");
        button3.setStyle("-fx-font-size: 30pt;");
        button3.setOnAction(e -> {
        System.out.println(answer.getText());
        });
        
        
        VBox layout2 = new VBox(30);
        layout2.setAlignment(Pos.CENTER);
        layout2.getChildren().addAll(quiztext, answer, button3, button2);
        scene2 = new Scene(layout2, 800,500);
   
        window.setScene(scene1);
        window.setTitle("Computer Science Quiz");
        window.show();
    }

}