package ibf.ssf.day16.model;

public class Address {
    private String address1;
    private String address2;
    private String postal;

    public Address(String address1, String address2, String postal) {
        this.address1 = address1;
        this.address2 = address2;
        this.postal = postal;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

}
