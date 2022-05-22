package com.example.chatclient;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    public TextArea chatArea;
    @FXML
   public ListView contacts;
    @FXML
    public TextField inputField;

    public void clikEnter(ActionEvent actionEvent) {

     chatArea.appendText(inputField.getText()+" "+ contacts.getSelectionModel().getSelectedItem() + System.lineSeparator());
             inputField.clear();

     }




    public void closeApplication(ActionEvent actionEvent) {

        Platform.exit();
    }

    public void mockAction(ActionEvent actionEvent) {

        System.out.println("Hello");
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        List<String> names = List.of("Vasya", "Masha", "Petya", "Valera", "Nastya");
        contacts.setItems(FXCollections.observableList(names));
    }

    public void Message(ActionEvent actionEvent) {
        String text = inputField.getText();
        if (text == null || text.isBlank()  ) {
            return;
        }


        chatArea.appendText(new StringBuilder().append(text).append(" Broadcast").append(System.lineSeparator()).toString());
        inputField.clear();
    }

    public void NetConnection(ActionEvent actionEvent) {
      
    }
}