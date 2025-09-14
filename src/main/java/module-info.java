module org.dein {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.dein to javafx.fxml;
    exports org.dein;
}
