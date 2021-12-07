module com.mycompany.extra_credit_v2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.extra_credit_v2 to javafx.fxml;
    exports com.mycompany.extra_credit_v2;
}
