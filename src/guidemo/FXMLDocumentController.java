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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

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
    
    //These items are for the ComboBox example
    @FXML private ComboBox comboBox;
    @FXML private Label comboBoxLabel;
    
    //These items are for the RadioButton Example
    @FXML private Label radioButtonLabel;
    @FXML private RadioButton pythonRadioButton; 
    @FXML private RadioButton javaRadioButton; 
    @FXML private RadioButton cSharpRadioButton; 
    @FXML private RadioButton javaScriptRadioButton; 
    @FXML private ToggleGroup favoriteLanguageToggleGroup;

    
    
    
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
    
    //This is for Combobox exaple. It will update comboBoxLabel when the ComboBox is changed. 
    
    public void comboBoxWasUpdated() {
        this.comboBoxLabel.setText("Course selected: \n" + comboBox.getValue().toString());
    }
    
    //This is for the RadioButton example. 
    public void radioButtonPushed() {
        if (this.favoriteLanguageToggleGroup.getSelectedToggle().equals(this.pythonRadioButton))
            radioButtonLabel.setText("Your favorite language is\n Python");
        if (this.favoriteLanguageToggleGroup.getSelectedToggle().equals(this.cSharpRadioButton))
            radioButtonLabel.setText("Your favorite language is\n C#");
        if (this.favoriteLanguageToggleGroup.getSelectedToggle().equals(this.javaRadioButton))
            radioButtonLabel.setText("Your favorite language is\n Java");
        if (this.favoriteLanguageToggleGroup.getSelectedToggle().equals(this.javaScriptRadioButton))
            radioButtonLabel.setText("Your favorite language is\n JavaScript");
        
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
        
        //These items are for configuring the ComboBox
        comboBox.getItems().add("Comp1030");
        comboBox.getItems().addAll("Comp1008", "MGMT2004", "MGMT2020");
        
        //These items are for configuring the RadioButtons
        radioButtonLabel.setText("");
        favoriteLanguageToggleGroup = new ToggleGroup();
        this.pythonRadioButton.setToggleGroup(favoriteLanguageToggleGroup);
        this.cSharpRadioButton.setToggleGroup(favoriteLanguageToggleGroup);
        this.javaRadioButton.setToggleGroup(favoriteLanguageToggleGroup);
        this.javaScriptRadioButton.setToggleGroup(favoriteLanguageToggleGroup);
    }    
    
}
