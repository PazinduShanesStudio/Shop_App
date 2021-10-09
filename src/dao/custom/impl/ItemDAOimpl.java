package dao.custom.impl;

import dao.CrudUtil;
import dao.custom.ItemDAO;
import entity.Item;

public class ItemDAOimpl implements ItemDAO {
    @Override
    public boolean add(Item item) throws Exception {
        String sql = "INSERT INTO ITEM VALUES(?,?,?)";
        return CrudUtil.executeUpdate(sql, item.getIid(), item.getIname(), item.getQty());

    }
}
