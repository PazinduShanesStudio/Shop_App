package dto;

public class ItemDTO {
    private String iid;
    private String iname;
    private String qty;

    public ItemDTO(String iid, String iname, String qty) {
        this.iid = iid;
        this.iname = iname;
        this.qty = qty;
    }

    public ItemDTO() {
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
        return "ItemDTO{" +
                "iid='" + iid + '\'' +
                ", iname='" + iname + '\'' +
                ", qty='" + qty + '\'' +
                '}';
    }
}
