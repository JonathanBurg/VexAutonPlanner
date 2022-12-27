/**
 * Planner Controller
 * Jonathan Burgener
 * 16 December 2022
 * Purpose:
 *      Create a map to plan out an auton and display movements that can be used to program auton
 */

package com.planner.autonplannervexv5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class PlannerController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="BInputDisk1"
    private Circle BInputDisk1; // Value injected by FXMLLoader

    @FXML // fx:id="BInputDisk2"
    private Circle BInputDisk2; // Value injected by FXMLLoader

    @FXML // fx:id="BInputDisk3"
    private Circle BInputDisk3; // Value injected by FXMLLoader

    @FXML // fx:id="BInputDisk4"
    private Circle BInputDisk4; // Value injected by FXMLLoader

    @FXML // fx:id="BInputDisk5"
    private Circle BInputDisk5; // Value injected by FXMLLoader

    @FXML // fx:id="BInputDisk6"
    private Circle BInputDisk6; // Value injected by FXMLLoader

    @FXML // fx:id="BInputDisk7"
    private Circle BInputDisk7; // Value injected by FXMLLoader

    @FXML // fx:id="BLeftPreload1"
    private Circle BLeftPreload1; // Value injected by FXMLLoader

    @FXML // fx:id="BLeftPreload2"
    private Circle BLeftPreload2; // Value injected by FXMLLoader

    @FXML // fx:id="BRightPreload1"
    private Circle BRightPreload1; // Value injected by FXMLLoader

    @FXML // fx:id="BRightPreload2"
    private Circle BRightPreload2; // Value injected by FXMLLoader

    @FXML // fx:id="CenterDisk7"
    private Circle CenterDisk7; // Value injected by FXMLLoader

    @FXML // fx:id="LBRoller"
    private Cylinder LBRoller; // Value injected by FXMLLoader

    @FXML // fx:id="LRRoller"
    private Cylinder LRRoller; // Value injected by FXMLLoader

    @FXML // fx:id="RBRoller"
    private Cylinder RBRoller; // Value injected by FXMLLoader

    @FXML // fx:id="RInputDisk1"
    private Circle RInputDisk1; // Value injected by FXMLLoader

    @FXML // fx:id="RInputDisk2"
    private Circle RInputDisk2; // Value injected by FXMLLoader

    @FXML // fx:id="RInputDisk3"
    private Circle RInputDisk3; // Value injected by FXMLLoader

    @FXML // fx:id="RInputDisk4"
    private Circle RInputDisk4; // Value injected by FXMLLoader

    @FXML // fx:id="RInputDisk5"
    private Circle RInputDisk5; // Value injected by FXMLLoader

    @FXML // fx:id="RInputDisk6"
    private Circle RInputDisk6; // Value injected by FXMLLoader

    @FXML // fx:id="RInputDisk7"
    private Circle RInputDisk7; // Value injected by FXMLLoader

    @FXML // fx:id="RLeftPreload1"
    private Circle RLeftPreload1; // Value injected by FXMLLoader

    @FXML // fx:id="RLeftPreload2"
    private Circle RLeftPreload2; // Value injected by FXMLLoader

    @FXML // fx:id="RRRoller"
    private Cylinder RRRoller; // Value injected by FXMLLoader

    @FXML // fx:id="RRightPreload1"
    private Circle RRightPreload1; // Value injected by FXMLLoader

    @FXML // fx:id="RRightPreload2"
    private Circle RRightPreload2; // Value injected by FXMLLoader

    @FXML // fx:id="backLeftCorner"
    private Line backLeftCorner; // Value injected by FXMLLoader

    @FXML // fx:id="backRightCorner"
    private Line backRightCorner; // Value injected by FXMLLoader

    @FXML // fx:id="blueDisk1"
    private Circle blueDisk1; // Value injected by FXMLLoader

    @FXML // fx:id="blueDisk10"
    private Circle blueDisk10; // Value injected by FXMLLoader

    @FXML // fx:id="blueDisk2"
    private Circle blueDisk2; // Value injected by FXMLLoader

    @FXML // fx:id="blueDisk3"
    private Circle blueDisk3; // Value injected by FXMLLoader

    @FXML // fx:id="blueDisk4"
    private Circle blueDisk4; // Value injected by FXMLLoader

    @FXML // fx:id="blueDisk5"
    private Circle blueDisk5; // Value injected by FXMLLoader

    @FXML // fx:id="blueDisk6"
    private Circle blueDisk6; // Value injected by FXMLLoader

    @FXML // fx:id="blueDisk7"
    private Circle blueDisk7; // Value injected by FXMLLoader

    @FXML // fx:id="blueDisk8"
    private Circle blueDisk8; // Value injected by FXMLLoader

    @FXML // fx:id="blueDisk9"
    private Circle blueDisk9; // Value injected by FXMLLoader

    @FXML // fx:id="border"
    private Pane border; // Value injected by FXMLLoader

    @FXML // fx:id="centerDisk1"
    private Circle centerDisk1; // Value injected by FXMLLoader

    @FXML // fx:id="centerDisk10"
    private Circle centerDisk10; // Value injected by FXMLLoader

    @FXML // fx:id="centerDisk11"
    private Circle centerDisk11; // Value injected by FXMLLoader

    @FXML // fx:id="centerDisk12"
    private Circle centerDisk12; // Value injected by FXMLLoader

    @FXML // fx:id="centerDisk13"
    private Circle centerDisk13; // Value injected by FXMLLoader

    @FXML // fx:id="centerDisk14"
    private Circle centerDisk14; // Value injected by FXMLLoader

    @FXML // fx:id="centerDisk2"
    private Circle centerDisk2; // Value injected by FXMLLoader

    @FXML // fx:id="centerDisk3"
    private Circle centerDisk3; // Value injected by FXMLLoader

    @FXML // fx:id="centerDisk4"
    private Circle centerDisk4; // Value injected by FXMLLoader

    @FXML // fx:id="centerDisk5"
    private Circle centerDisk5; // Value injected by FXMLLoader

    @FXML // fx:id="centerDisk6"
    private Circle centerDisk6; // Value injected by FXMLLoader

    @FXML // fx:id="centerDisk8"
    private Circle centerDisk8; // Value injected by FXMLLoader

    @FXML // fx:id="centerDisk9"
    private Circle centerDisk9; // Value injected by FXMLLoader

    @FXML // fx:id="frontLeftCorner"
    private Line frontLeftCorner; // Value injected by FXMLLoader

    @FXML // fx:id="frontRightCorner"
    private Line frontRightCorner; // Value injected by FXMLLoader

    @FXML // fx:id="movementRange"
    private Pane movementRange; // Value injected by FXMLLoader

    @FXML // fx:id="num1"
    private Text num1; // Value injected by FXMLLoader

    @FXML // fx:id="num2"
    private Text num2; // Value injected by FXMLLoader

    @FXML // fx:id="num3"
    private Text num3; // Value injected by FXMLLoader

    @FXML // fx:id="num4"
    private Text num4; // Value injected by FXMLLoader

    @FXML // fx:id="num5"
    private Text num5; // Value injected by FXMLLoader

    @FXML // fx:id="preload"
    private Circle preload; // Value injected by FXMLLoader

    @FXML // fx:id="redDisk1"
    private Circle redDisk1; // Value injected by FXMLLoader

    @FXML // fx:id="redDisk10"
    private Circle redDisk10; // Value injected by FXMLLoader

    @FXML // fx:id="redDisk11"
    private Circle redDisk11; // Value injected by FXMLLoader

    @FXML // fx:id="redDisk12"
    private Circle redDisk12; // Value injected by FXMLLoader

    @FXML // fx:id="redDisk2"
    private Circle redDisk2; // Value injected by FXMLLoader

    @FXML // fx:id="redDisk3"
    private Circle redDisk3; // Value injected by FXMLLoader

    @FXML // fx:id="redDisk4"
    private Circle redDisk4; // Value injected by FXMLLoader

    @FXML // fx:id="redDisk5"
    private Circle redDisk5; // Value injected by FXMLLoader

    @FXML // fx:id="redDisk6"
    private Circle redDisk6; // Value injected by FXMLLoader

    @FXML // fx:id="redDisk7"
    private Circle redDisk7; // Value injected by FXMLLoader

    @FXML // fx:id="redDisk8"
    private Circle redDisk8; // Value injected by FXMLLoader

    @FXML // fx:id="redDisk9"
    private Circle redDisk9; // Value injected by FXMLLoader

    @FXML // fx:id="robot"
    private Pane robot; // Value injected by FXMLLoader
    int y=0,x=0;
    @FXML
    void onAllFWDClick(ActionEvent event) {

    }

    @FXML
    void onAllFWDHold(MouseEvent event) {

    }

    @FXML
    void onAllREVClick(ActionEvent event) {

    }

    @FXML
    void onAllREVHold(MouseEvent event) {

    }

    @FXML
    void onBlueInput1Clicked(MouseEvent event) {

    }

    @FXML
    void onBlueInput2Clicked(MouseEvent event) {

    }

    @FXML
    void onBlueInput3Clicked(MouseEvent event) {

    }

    @FXML
    void onBlueInput4Clicked(MouseEvent event) {

    }

    @FXML
    void onBlueInput5Clicked(MouseEvent event) {

    }

    @FXML
    void onBlueInput6Clicked(MouseEvent event) {

    }

    @FXML
    void onBlueInput7Clicked(MouseEvent event) {

    }

    @FXML
    void onBlueLeftPreClicked(MouseEvent event) {

    }

    @FXML
    void onBlueRightPreClicked(MouseEvent event) {

    }

    @FXML
    void onExpandClick(ActionEvent event) {

    }

    @FXML
    void onExpandHold(MouseEvent event) {

    }

    @FXML
    void onIntakeClick(ActionEvent event) {

    }

    @FXML
    void onIntakeHold(MouseEvent event) {

    }

    @FXML
    void onLeftFWDClick(ActionEvent event) {

    }

    @FXML
    void onLeftFWDHold(MouseEvent event) {

    }

    @FXML
    void onLeftREVClick(ActionEvent event) {

    }

    @FXML
    void onLeftREVHold(MouseEvent event) {

    }

    @FXML
    void onOutakeHold(MouseEvent event) {

    }

    @FXML
    void onOuttakeClick(ActionEvent event) {

    }

    @FXML
    void onRedInput1Clicked(MouseEvent event) {

    }

    @FXML
    void onRedInput2Clicked(MouseEvent event) {

    }

    @FXML
    void onRedInput3Clicked(MouseEvent event) {

    }

    @FXML
    void onRedInput4Clicked(MouseEvent event) {

    }

    @FXML
    void onRedInput5Clicked(MouseEvent event) {

    }

    @FXML
    void onRedInput6Clicked(MouseEvent event) {

    }

    @FXML
    void onRedInput7Clicked(MouseEvent event) {

    }

    @FXML
    void onRedLeftPreClicked(MouseEvent event) {

    }

    @FXML
    void onRedRightPreClicked(MouseEvent event) {

    }

    @FXML
    void onRedoClick(ActionEvent event) {

    }

    @FXML
    void onRedoHold(MouseEvent event) {

    }

    @FXML
    void onResetClick(ActionEvent event) {

    }

    @FXML
    void onRightFWDClick(ActionEvent event) {

    }

    @FXML
    void onRightFWDHold(MouseEvent event) {

    }

    @FXML
    void onRightREVHold(MouseEvent event) {

    }

    @FXML
    void onRightRevClick(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert BInputDisk1 != null : "fx:id=\"BInputDisk1\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert BInputDisk2 != null : "fx:id=\"BInputDisk2\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert BInputDisk3 != null : "fx:id=\"BInputDisk3\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert BInputDisk4 != null : "fx:id=\"BInputDisk4\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert BInputDisk5 != null : "fx:id=\"BInputDisk5\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert BInputDisk6 != null : "fx:id=\"BInputDisk6\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert BInputDisk7 != null : "fx:id=\"BInputDisk7\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert BLeftPreload1 != null : "fx:id=\"BLeftPreload1\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert BLeftPreload2 != null : "fx:id=\"BLeftPreload2\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert BRightPreload1 != null : "fx:id=\"BRightPreload1\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert BRightPreload2 != null : "fx:id=\"BRightPreload2\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert CenterDisk7 != null : "fx:id=\"CenterDisk7\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert LBRoller != null : "fx:id=\"LBRoller\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert LRRoller != null : "fx:id=\"LRRoller\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert RBRoller != null : "fx:id=\"RBRoller\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert RInputDisk1 != null : "fx:id=\"RInputDisk1\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert RInputDisk2 != null : "fx:id=\"RInputDisk2\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert RInputDisk3 != null : "fx:id=\"RInputDisk3\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert RInputDisk4 != null : "fx:id=\"RInputDisk4\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert RInputDisk5 != null : "fx:id=\"RInputDisk5\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert RInputDisk6 != null : "fx:id=\"RInputDisk6\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert RInputDisk7 != null : "fx:id=\"RInputDisk7\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert RLeftPreload1 != null : "fx:id=\"RLeftPreload1\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert RLeftPreload2 != null : "fx:id=\"RLeftPreload2\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert RRRoller != null : "fx:id=\"RRRoller\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert RRightPreload1 != null : "fx:id=\"RRightPreload1\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert RRightPreload2 != null : "fx:id=\"RRightPreload2\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert backLeftCorner != null : "fx:id=\"backLeftCorner\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert backRightCorner != null : "fx:id=\"backRightCorner\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert blueDisk1 != null : "fx:id=\"blueDisk1\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert blueDisk10 != null : "fx:id=\"blueDisk10\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert blueDisk2 != null : "fx:id=\"blueDisk2\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert blueDisk3 != null : "fx:id=\"blueDisk3\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert blueDisk4 != null : "fx:id=\"blueDisk4\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert blueDisk5 != null : "fx:id=\"blueDisk5\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert blueDisk6 != null : "fx:id=\"blueDisk6\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert blueDisk7 != null : "fx:id=\"blueDisk7\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert blueDisk8 != null : "fx:id=\"blueDisk8\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert blueDisk9 != null : "fx:id=\"blueDisk9\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert border != null : "fx:id=\"border\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert centerDisk1 != null : "fx:id=\"centerDisk1\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert centerDisk10 != null : "fx:id=\"centerDisk10\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert centerDisk11 != null : "fx:id=\"centerDisk11\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert centerDisk12 != null : "fx:id=\"centerDisk12\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert centerDisk13 != null : "fx:id=\"centerDisk13\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert centerDisk14 != null : "fx:id=\"centerDisk14\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert centerDisk2 != null : "fx:id=\"centerDisk2\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert centerDisk3 != null : "fx:id=\"centerDisk3\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert centerDisk4 != null : "fx:id=\"centerDisk4\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert centerDisk5 != null : "fx:id=\"centerDisk5\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert centerDisk6 != null : "fx:id=\"centerDisk6\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert centerDisk8 != null : "fx:id=\"centerDisk8\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert centerDisk9 != null : "fx:id=\"centerDisk9\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert frontLeftCorner != null : "fx:id=\"frontLeftCorner\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert frontRightCorner != null : "fx:id=\"frontRightCorner\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert movementRange != null : "fx:id=\"movementRange\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert num1 != null : "fx:id=\"num1\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert num2 != null : "fx:id=\"num2\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert num3 != null : "fx:id=\"num3\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert num4 != null : "fx:id=\"num4\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert num5 != null : "fx:id=\"num5\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert preload != null : "fx:id=\"preload\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert redDisk1 != null : "fx:id=\"redDisk1\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert redDisk10 != null : "fx:id=\"redDisk10\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert redDisk11 != null : "fx:id=\"redDisk11\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert redDisk12 != null : "fx:id=\"redDisk12\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert redDisk2 != null : "fx:id=\"redDisk2\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert redDisk3 != null : "fx:id=\"redDisk3\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert redDisk4 != null : "fx:id=\"redDisk4\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert redDisk5 != null : "fx:id=\"redDisk5\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert redDisk6 != null : "fx:id=\"redDisk6\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert redDisk7 != null : "fx:id=\"redDisk7\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert redDisk8 != null : "fx:id=\"redDisk8\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert redDisk9 != null : "fx:id=\"redDisk9\" was not injected: check your FXML file 'planner-view.fxml'.";
        assert robot != null : "fx:id=\"robot\" was not injected: check your FXML file 'planner-view.fxml'.";

    }
    private void moveForward(){
        y=
    }

}

    /*
    sp.vvalueProperty().addListener(new ChangeListener<Number>() {
    public void changed(ObservableValue<? extends Number> ov,
        Number old_val, Number new_val) {
            fileName.setText(imageNames[(new_val.intValue() - 1)/100]);
        }
        */
