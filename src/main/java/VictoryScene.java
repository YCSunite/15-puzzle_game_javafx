import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class VictoryScene {
    @FXML
    Button newPuzzle;
    @FXML
    Button ExitGame;


    public void newPuzzle(ActionEvent actionEvent) {

    }

    public void ExitGame(ActionEvent actionEvent) {
        Stage stage = (Stage) ExitGame.getScene().getWindow();
        stage.close();
    }
}
