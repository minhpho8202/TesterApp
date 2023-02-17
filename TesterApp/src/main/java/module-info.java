module com.dmp.testerapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dmp.testerapp to javafx.fxml;
    exports com.dmp.testerapp;
}
