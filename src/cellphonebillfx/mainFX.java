/*
 * cellPhoneBillFX Version#1.0
 * Frank Bernal
 * CIS 084 Java Programming
 * Input: GB Used, Plan, Name
 * Output: Bill
 * 29 April 2022
 */

package cellphonebillfx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

// Start mainFX
public class mainFX extends Application {
    // Controls for the top pane
    Label lblTitle;
    
    // Controls for the left pane
    Label lblPlansAndPrices;
    
    // Controls for the center pane
    Label lblCustomerData;   // Title at top
    Label lblName;           // Prompt at top for name
    TextField txtName;       // Input the name
    TextField txtPlan;       // Input the plan
    Label lblPlan;           // Prompt at right for plan
    TextField txtGBused;     // Input for GB used
    Label lbltxtGBused;      // Prompt at right for GB used
    
    // Controls for right pane
    Label lblCustomerBill;
    Label lblCustomerName;
    Label lblPleasePay;
    
    // Controls for bottom pane
    Button btnCompute;
    Button btnClear;
    Button btnExit;
    
    // Constant for GB over limit
    final double PRICE_PER_GB = 15.00
            
    // Start start
    @Override
    public void start(Stage primaryStage) {
        
    }   // End start

    // Start PSV main
    public static void main(String[] args) {
        launch(args);
    }   // End PSV main
    
}   // End mainFX
