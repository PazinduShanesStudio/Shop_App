package controller;

import bo.BOFactory;
import bo.custom.CustomerBO;
import dto.CustomerDTO;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class Customercontroller {
    public TextField txtCID;
    public TextField txtName;
    public TextField txtContact;
    CustomerBO customerBO = (CustomerBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.CUSTOMER);


    public void saveOnAction(javafx.event.ActionEvent actionEvent) {
        String cid = txtCID.getText();
        String fName = txtName.getText();
        String Contact = txtContact.getText();

        CustomerDTO newCustomer = new CustomerDTO(cid, fName, Contact);
        try {
            boolean isAdded = customerBO.addcustomer(newCustomer);
            new Alert(Alert.AlertType.CONFIRMATION, "Customer Added Successful!", ButtonType.OK).show();
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, "Customer Added Not Successful!", ButtonType.OK).show();
        }
    }
}
