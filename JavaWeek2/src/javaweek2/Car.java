
package javaweek2;

import java.util.*;


public class Car extends PTGT {
    private String kieudongco;
    private int sochongoi;

    public Car()
    {

    }
    public Car(String ma, String hangsx, String mau, int namsx, float giaban, String kieudongco, int sochongoi) {
        super(ma, hangsx, mau, namsx, giaban);
        this.kieudongco = kieudongco;
        this.sochongoi = sochongoi;
    }

    public String getKieudongco() {
        return kieudongco;
    }

    public int getSochongoi() {
        return sochongoi;
    }

    @Override
    public String toString() {
        return "Car{" +"ma="+ma+", hangsx="+hangsx+", mau="+mau+", namsx="+namsx+", giaban="+giaban +", kieudongco=" + kieudongco + ", sochongoi=" + sochongoi + '}';
    }
    
    @Override
    public void input()
    {
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter kieu dong co: ");
        this.kieudongco = input.nextLine();
        System.out.println("Enter so cho ngoi: ");
        this.sochongoi = Integer.parseInt(input.nextLine());
    }
}
