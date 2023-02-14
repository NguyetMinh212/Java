
package javaweek3;

public class Employee {
    private String id, name, address, phoneNum, employeeType;

    public Employee() {
    }

    public Employee(String id, String name, String address, String phoneNum) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        if(this.id.substring(0,2).compareTo("PT")==0) this.employeeType = "Part-time";
        else if(this.id.substring(0,2).compareTo("FT")==0) this.employeeType = "Full-time";
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getEmployeeType() {
        return employeeType;
    }

    @Override
    public String toString() {
        return  id + " " + name + " " + address + " " + phoneNum + " " + employeeType ;
    }
    
}
