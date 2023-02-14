
package javaweek3;


public class Customer {
    public static int cusNum = 0;
    private String id, name, address, phoneNum, gmail;

    public Customer() {
    }

    public Customer(String name, String address, String phoneNum, String gmail) {
        this.id = Integer.toString(++cusNum);
        while(this.id.length()<5) this.id="0"+this.id;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.gmail = gmail;
    }

    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + address + " " + phoneNum + " " + gmail;
    }
    
}
