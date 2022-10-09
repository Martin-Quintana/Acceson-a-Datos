package iesteis.javafxjacksoncocktails.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import iesteis.javafxjacksoncocktails.model.DrinksItem;
import iesteis.javafxjacksoncocktails.model.Response;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DrinkController implements Initializable {

    private String finalURL = "www.thecocktaildb.com/api/json/v1/1/search.php?s=";

    @FXML
    private Button search;


    @FXML
    private TextField name;

    @FXML
    private Label statusResult;

    @FXML
    private ImageView drinkImage;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        name.setText("Cocktail");
    }

    public void setName(ActionEvent actionEvent) {
        try {
            URL jsonURL = new URL(finalURL + name.getText());

            ObjectMapper objectMapper = new ObjectMapper();

            Response response = objectMapper.readValue(jsonURL, Response.class);
            response.getResults().stream().forEach(System.out::println);
            DrinksItem firstDrink = response.getResults().get(0);
            statusResult.setText(String.valueOf(firstDrink.getStrDrink()));
            //Image image = new Image((String) firstDrink.getStrImageSource(), true);
            //drinkImage.setImage(image);


        } catch (IOException e) {
            e.printStackTrace();


        }

    }
}