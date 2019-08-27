/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guidemo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

/**
 *
 * @author michaeltombor
 */
public class FXMLDocumentController implements Initializable {
    //These items were for the checkbox example
    @FXML private Label pizzaOrderLabel;
    @FXML private CheckBox pepperoniCheckBox;
    @FXML private CheckBox pineappleCheckBox;
    @FXML private CheckBox baconCheckBox;
    
    //These items are for the choicebox example 
    
    @FXML private ChoiceBox choiceBox;
    @FXML private Label choiceBoxLabel;
    
    //This will update the Label for ChoiceBox
    public void choiceBoxButtonPushed() {
        choiceBoxLabel.setText("My favorite fruit is: "+ choiceBox.getValue().toString());
       
    }
    
    
    //This is for Checkbox example
    public void pizzaOrderButtonPushed() {
        String order = "Toppings are: ";
        if (pepperoniCheckBox.isSelected()) 
            order += "\npepperoni";
        if (pineappleCheckBox.isSelected()) 
            order += "\npineapple";
        if (baconCheckBox.isSelected()) 
            order += "\nbacon";
        
        this.pizzaOrderLabel.setText(order);
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //This is for checkBox example 
        pizzaOrderLabel.setText("");
        //This is for Choicebox
        choiceBoxLabel.setText("");
        choiceBox.getItems().add("apples");
        choiceBox.getItems().add("bananas");
        choiceBox.getItems().addAll("oranges", "pears", "strawberries");
        choiceBox.setValue("apples");
    }    
    
}
