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
    Label lblGBused;      // Prompt at right for GB used
    
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
        // 1. Use a border pane to layout the scene on the stage
        BorderPane root = new BorderPane();
        root.setTop(createTop());         // Contains HBox control
        root.setLeft(createLeft());       // Contains VBox control
        root.setCenter(createCenter());   // Contains VBox control
        root.setRight(createRight());     // Contains VBox control
        root.setBottom(createBottom());   // Contains HBox control
    }   // End start

    // Start PSV main
    public static void main(String[] args) {
        launch(args);
    }   // End PSV main
    
    // Start createTop
    private HBox createTop() {
        // Puts title at top in big letters
        // Use an HBox named hbox to hold the title. HBox used for centering
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        Font font36B = Font.font("Ariel", FontWeight.BOLD, 36); // Title font
        lblTitle = new Label("Cell Phone Billing");
        lblTitle.setFont(font36B);
        hbox.getChildren().add(lblTitle);
        return hbox;
    }   // End of createTop
    
    // Start createLeft
    private VBox createLeft() {
        // Use VBox named vbox to hold display of plans and prices
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(0, 20, 0 ,20));
        
        // Use a Label control to hold the text that will be displayed 
        lblPlansAndPrices = new Label(
        "Plans and Prices\n"
                + "--------------------\n"
                + "A =  0 GB $50.00\n"
                + "B =  2 GB $60.00\n"
                + "C =  4 GB $70.00\n"
                + "D = 10 GB $90.00\n"
                + "+ $15.00/GB over plan limit"
        );
        
        // Put label in the VBox
        vbox.getChildren().add(lblPlansAndPrices);
        
        return vbox;
    }   // End of createLeft
    
    // Start createCenter
    private VBox createCenter() {
        // Use VBox named vbox to hold everything for the center pane
        VBox vbox = new VBox();
        vbox.setSpacing(10.0);
        
        // Inside vbox create a Label for the title
        lblCustomerData = new Label("Customer Data");
        
        // Inside the vbox, create ANOTHER vbox named vbox1 to hold prompt
        // "Name" and a textField for the user to type a name
        VBox vbox1 = new VBox();
        lblName = new Label("  Name");
        txtName = new TextField();
        txtName.setPrefSize(200, 20);
        txtName.setMaxWidth(200);
        vbox1.getChildren().addAll(lblName, txtName);
        
        // Also inside vbox, use HBox named hbox2 with a Label and TExtField
        // to get the plan
        HBox hbox2 = new HBox();
        txtPlan = new TextField();
        txtPlan.setPrefSize(40, 20);
        lblPlan = new Label("  Plan  (A-D)");   // lblPlan is global
        hbox2.getChildren().addAll(txtPlan, lblPlan);
        
        // Also indide vbox, one more HBox with a Label and TextField to get
        // GB used 
        HBox hbox3 = new HBox();
        txtGBused = new TextField();
        txtGBused.setPrefSize(40, 20);
        lblGBused = new Label("  GB Used"); // lblGBused is global
        hbox3.getChildren().addAll(txtGBused, lblGBused);
        
        // Put the title "Customer Data" and inputs for Name, Plan and GB used
        // in vbox
        vbox.getChildren().addAll (lblCustomerData, vbox1, hbox2, hbox3);
        
        return vbox;
    }   // End createCenter
    
}   // End mainFX
