package myApp;

import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.*;

import javafx.scene.control.*;
import java.io.IOException;

public class HomePageController {
    @FXML
    MenuItem adminLoginButton;

    @FXML
    private void adminLogin(ActionEvent e) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("views/LoginPage.fxml"));
        Parent root = (Parent) loader.load();
        Scene scene = new Scene(root, 900, 620);
        Main.mainStage.setScene(scene);

    }
}
