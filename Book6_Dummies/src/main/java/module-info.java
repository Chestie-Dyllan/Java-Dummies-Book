module com.example.book6_dummies {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.book6_dummies.Chap1 to javafx.fxml;
    exports com.example.book6_dummies.Chap1;
    opens com.example.book6_dummies.Chap2 to javafx.fxml;
    exports com.example.book6_dummies.Chap2;
    opens com.example.book6_dummies.Chap3 to javafx.fxml;
    exports com.example.book6_dummies.Chap3;
    opens com.example.book6_dummies.Chap4 to javafx.fxml;
    exports com.example.book6_dummies.Chap4;
    opens com.example.book6_dummies.Chap5 to javafx.fxml;
    exports com.example.book6_dummies.Chap5;
    opens com.example.book6_dummies.Chap6 to javafx.fxml;
    exports com.example.book6_dummies.Chap6;
}