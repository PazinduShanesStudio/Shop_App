package bo.custom.impl;

import bo.custom.CustomerBO;
import dao.DAOFactory;
import dao.DAOType;
import dao.custom.impl.CustomerDAOimpl;
import dto.CustomerDTO;
import entity.Customer;

public class CustomerBOimpl implements CustomerBO {

    CustomerDAOimpl customerDAOimpl = DAOFactory.getInstance().getDAO(DAOType.CUSTOMER);


    @Override
    public boolean addcustomer(CustomerDTO customerDTO) throws Exception {
        return customerDAOimpl.add(new Customer(customerDTO.getId(),customerDTO.getName(),customerDTO.getContact()));
    }
}
