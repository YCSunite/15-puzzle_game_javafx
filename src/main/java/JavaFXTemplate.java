import javafx.application.Application;
import javafx.animation.PauseTransition;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.util.Duration;
import javafx.stage.Stage;

import java.net.URL;
import java.nio.file.Paths;

public class JavaFXTemplate extends Application {

	PauseTransition pause = new PauseTransition(Duration.seconds(3));
	
	static PauseTransition pauseToVictory = new PauseTransition(Duration.seconds(2));
	static PauseTransition pauseToGameScene = new PauseTransition(Duration.seconds(1));

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub



			URL url = Paths.get("./src/main/resources/WelcomeScene.fxml").toUri().toURL();
			Parent root = FXMLLoader.load(url);

			URL url2 = Paths.get("./src/main/resources/GameScene.fxml").toUri().toURL();
			Parent root2 = FXMLLoader.load(url2);
			
			URL url3 = Paths.get("./src/main/resources/VictoryScene.fxml").toUri().toURL();
			Parent root3 = FXMLLoader.load(url3);

			primaryStage.setTitle("Welcome to 15 puzzle!!!");
		//loading Welcome scene to primary stage
			Scene s1 = new Scene(root, 700,500);
			s1.getStylesheets().add("WelcomeScene.css");


			Scene s2 = new Scene(root2, 700,500);
			s2.getStylesheets().add("GameScene.css");
			
			Scene s3 = new Scene(root3, 700,500);
			s3.getStylesheets().add("VictoryScene.css");
			
			pauseToVictory.setOnFinished(event->primaryStage.setScene(s3));
			pauseToGameScene.setOnFinished(event -> primaryStage.setScene(s2));
			
		    pause.setOnFinished(event->primaryStage.setScene(s2));
			pause.play();
			primaryStage.setScene(s1);
			primaryStage.show();


		
		Thread t = new Thread(()-> {A_IDS_A_15solver ids = new A_IDS_A_15solver();});
		t.start();

	}

	public static void switchToVictoryScene() {
		pauseToVictory.play();
	}
	public static void switchToGameScene(){
		pauseToGameScene.play();
	}

}
