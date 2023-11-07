/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package eduhub;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author jcarl
 */
public class SelectRoleController implements Initializable {

    @FXML
    private Button btnOfficer;
    @FXML
    private Button btnStudent;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void handleBtnOfficer (ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("officerLoginWindow.fxml"));
            Parent root = loader.load();           
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            
            Scene scene = new Scene(root);
            stage.setScene(scene);
            javafx.geometry.Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
            stage.setX((screenBounds.getWidth() - stage.getWidth()) / 2);
            stage.setY((screenBounds.getHeight() - stage.getHeight()) / 2);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   
    @FXML
    private void handleBtnStudent (ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("StudentLogin.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            
            Scene scene = new Scene(root);
            stage.setScene(scene);
            javafx.geometry.Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
            stage.setX((screenBounds.getWidth() - stage.getWidth()) / 2);
            stage.setY((screenBounds.getHeight() - stage.getHeight()) / 2);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}