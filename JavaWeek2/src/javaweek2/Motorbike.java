
package javaweek2;

import java.util.*;

public class Motorbike extends PTGT {
    private float congsuat;
    
    public Motorbike()
    {
        
    }

    public Motorbike(String ma, String hangsx, String mau, int namsx, float giaban,float congsuat) {
        super(ma, hangsx, mau, namsx, giaban);
        this.congsuat = congsuat;
    }

    @Override
    public String toString() {
        return "Motorbike{"+ "ma="+ma+", hangsx="+hangsx+", mau="+mau+", namsx="+namsx+", giaban="+giaban+ ", congsuat=" + congsuat + '}';
    }
    @Override
    public void input()
    {
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter cong suat: ");
        this.congsuat = Float.parseFloat(input.nextLine());
    }
}
