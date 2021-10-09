package dao;

import java.io.Serializable;

public interface SuperDAO <Entity,ID extends Serializable> {

    public boolean add(Entity entity) throws Exception;
}
