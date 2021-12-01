import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

import java.net.URL;
import java.nio.file.Paths;


// ************ LOOK FOR THIS COMMENT *********************
public class JavaFXTemplate extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
			URL url = Paths.get("./src/main/resources/GameScene.fxml").toUri().toURL();
			Parent root = FXMLLoader.load(url);

			primaryStage.setTitle("Welcome to 15 puzzle!!!");
			Scene s1 = new Scene(root, 700,500);
			s1.getStylesheets().add("GameScene.css");
			primaryStage.setScene(s1);
			primaryStage.show();


		
		Thread t = new Thread(()-> {A_IDS_A_15solver ids = new A_IDS_A_15solver();});
		t.start();

	}

}
