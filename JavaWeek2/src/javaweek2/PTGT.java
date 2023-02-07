
package javaweek2;

import java.util.*;

public class PTGT {
    protected String ma,hangsx,mau;
    protected int namsx;
    protected float giaban;
    
    public PTGT()
    {
        
    }
    public PTGT(String ma, String hangsx, String mau, int namsx, float giaban) {
        this.ma = ma;
        this.hangsx = hangsx;
        this.mau = mau;
        this.namsx = namsx;
        this.giaban = giaban;
    }
    
    public void input()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ma:");
        this.ma = input.nextLine();
        System.out.println("Enter hangsx:");
        this.hangsx = input.nextLine();
        System.out.println("Enter mau:");
        this.mau = input.nextLine();
        System.out.println("Enter namsx:");
        this.namsx = Integer.parseInt(input.nextLine());
        System.out.println("Enter giaban:");
        this.giaban = Float.parseFloat(input.nextLine());
    }
    
    public String getMa() {
        return ma;
    }

    public String getHangsx() {
        return hangsx;
    }

    public String getMau() {
        return mau;
    }

    public int getNamsx() {
        return namsx;
    }

    public float getGiaban() {
        return giaban;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setHangsx(String hangsx) {
        this.hangsx = hangsx;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public void setNamsx(int namsx) {
        this.namsx = namsx;
    }

    public void setGiaban(float giaban) {
        this.giaban = giaban;
    }

    
    
}
