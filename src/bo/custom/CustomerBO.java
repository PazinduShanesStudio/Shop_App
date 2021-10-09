package bo.custom;

import bo.SuperBO;
import dto.CustomerDTO;

public interface CustomerBO extends SuperBO {
    public boolean addcustomer(CustomerDTO customerDTO) throws Exception;
}
