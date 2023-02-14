
package javaweek3;

import static javaweek3.Product.num;

public class PurchaseOrder {
    public static int orderNum = 0;
    private String productId, customerId, employeeId, orderId;
    private int productNum;

    public PurchaseOrder(String productId, String customerId, String employeeId, int productNum) {
        this.productId = productId;
        this.customerId = customerId;
        this.employeeId = employeeId;
        this.orderId = Integer.toString(++orderNum);
        while(this.orderId.length()<6) this.orderId="0"+this.orderId;
        this.productNum = productNum;
    }

    

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getOrderId() {
        return orderId;
    }

    public int getProductNum() {
        return productNum;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    @Override
    public String toString() {
        return productId + " " + customerId + " " + employeeId + " " + orderId + " " + productNum;
    }
    
}
