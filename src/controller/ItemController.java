package controller;

import bo.BOFactory;
import bo.custom.CustomerBO;
import bo.custom.ItemBO;
import dto.CustomerDTO;
import dto.ItemDTO;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class ItemController {
    public TextField txtIID;
    public TextField txtIName;
    public TextField txtQty;
    ItemBO itemBO = (ItemBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.ITEM);


    public void saveItemOnAction(javafx.event.ActionEvent actionEvent) {
        String iid = txtIID.getText();
        String iName = txtIName.getText();
        String qty = txtQty.getText();

        ItemDTO newItem = new ItemDTO(iid, iName, qty);
        try {
            boolean isAdded = itemBO.additem(newItem);
            new Alert(Alert.AlertType.CONFIRMATION, "Item Added Successful!", ButtonType.OK).show();
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, "Item Added Not Successful!", ButtonType.OK).show();
        }
    }
}
