package bo.custom.impl;

import bo.custom.ItemBO;
import dao.DAOFactory;
import dao.DAOType;
import dao.custom.impl.CustomerDAOimpl;
import dao.custom.impl.ItemDAOimpl;
import dto.ItemDTO;
import entity.Customer;
import entity.Item;

public class ItemBOimpl implements ItemBO {

    ItemDAOimpl itemDAOimpl = DAOFactory.getInstance().getDAO(DAOType.ITEM);

    @Override
    public boolean additem(ItemDTO itemDTO) throws Exception {
        return itemDAOimpl.add(new Item(itemDTO.getIid(), itemDTO.getIname(),itemDTO.getQty()));
    }
}
