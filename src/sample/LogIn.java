package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import javax.swing.*;
import java.io.IOException;
public class LogIn {

    public LogIn() {

    }

    @FXML
    private Button button;
    @FXML
    private Label wrongLogIn;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;




    public void userLogIn(ActionEvent event) throws IOException {
        checkLogin();

    }

    private void checkLogin() throws IOException {
        Main m = new Main();
        if(username.getText().toString().equals("dtu") && password.getText().toString().equals("dtu")) {
            JOptionPane.showMessageDialog(null,"hello.. SR");
            wrongLogIn.setText("Success!");

            m.changeScene("Dashboard.fxml");
        }
        else if(username.getText().toString().equals("a") && password.getText().toString().equals("a")) {
            JOptionPane.showMessageDialog(null,"root signed");
            wrongLogIn.setText("Success!");

            m.changeScene("Dashboard.fxml");
        }
        else if(username.getText().toString().equals("youssef") && password.getText().toString().equals("")) {
            wrongLogIn.setText("Success!");
            JOptionPane.showMessageDialog(null,"hello.. youssef");

            m.changeScene("Dashboard.fxml");
        }

        else if(username.getText().isEmpty() && password.getText().isEmpty()) {
            wrongLogIn.setText("Username or Password is incorrect !.");
        }


        else {
            wrongLogIn.setText("Wrong username or password!");
        }
    }


}