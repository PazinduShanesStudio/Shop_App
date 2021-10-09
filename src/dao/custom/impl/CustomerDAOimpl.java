package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.CustomerDAO;
import entity.Customer;

import java.sql.SQLException;

public class CustomerDAOimpl implements CustomerDAO {

    public boolean add(Customer c) throws ClassNotFoundException, SQLException {
        String sql = "INSERT INTO CUSTOMER VALUES(?,?,?)";
        return CrudUtil.executeUpdate(sql, c.getId(), c.getName(), c.getContact());
    }

}
