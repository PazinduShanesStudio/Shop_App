package bo;

import bo.custom.impl.CustomerBOimpl;

public class BOFactory {
    private static BOFactory boFactory;
    private BOFactory(){

    }
    public static BOFactory getInstance(){
        return (boFactory==null) ? boFactory=new BOFactory() : boFactory;
    }

    public <T extends SuperBO> T getBO(BOType boType){
        switch (boType){
            case CUSTOMER:
                return (T) new CustomerBOimpl();
            default:
                return null;
        }
    }
}
