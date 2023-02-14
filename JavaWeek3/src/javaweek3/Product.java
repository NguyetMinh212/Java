
package javaweek3;


public class Product {
    public static int num = 0;
    private String id, name,productType ;
    private int price;

    public Product() {
    }
    
    public Product( String name, String productType, int price) {
        this.id = Integer.toString(++num);
        while(this.id.length()<4) this.id="0"+this.id;
        this.name = name;
        this.productType = productType;
        this.price = price;
    }

 

    public void setName(String name) {
        this.name = name;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProductType() {
        return productType;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  id + " " + name + " " + productType + " " + price;
    }
    

}
