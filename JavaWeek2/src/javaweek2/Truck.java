
package javaweek2;

import java.util.*;


public class Truck extends PTGT{
    private float trongtai;

    public Truck()
    {
        
    }
    public Truck(String ma, String hangsx, String mau, int namsx, float giaban, float trongtai) {
        super(ma, hangsx, mau, namsx, giaban);
        this.trongtai = trongtai;
    }

    @Override
    public String toString() {
        return "Truck{" + "ma="+ma+", hangsx="+hangsx+", mau="+mau+", namsx="+namsx+", giaban="+giaban +", trongtai=" + trongtai + '}';
    }
    @Override
    public void input()
    {
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter trong tai: ");
        this.trongtai = Float.parseFloat(input.nextLine());
    }
}
