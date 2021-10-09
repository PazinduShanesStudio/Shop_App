package entity;

public class Item {
    private String iid;
    private String iname;
    private String qty;

    public Item(String iid, String iname, String qty) {
        this.iid = iid;
        this.iname = iname;
        this.qty = qty;
    }

    public Item() {
    }

    public String getIid() {
        return iid;
    }

    public void setIid(String iid) {
        this.iid = iid;
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Item{" +
                "iid='" + iid + '\'' +
                ", iname='" + iname + '\'' +
                ", qty='" + qty + '\'' +
                '}';
    }
}
