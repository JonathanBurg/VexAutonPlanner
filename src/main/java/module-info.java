module com.planner.autonplannervexv5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.planner.autonplannervexv5 to javafx.fxml;
    exports com.planner.autonplannervexv5;
}