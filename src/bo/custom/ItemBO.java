package bo.custom;

import bo.SuperBO;
import dto.CustomerDTO;
import dto.ItemDTO;

public interface ItemBO extends SuperBO {
    public boolean additem(ItemDTO itemDTO) throws Exception;

}
