
package javaweek3;

import java.io.*;
import java.util.*;

public class JavaWeek3 {
    
    public static void AddMHtoFile()
    {
        try{
            FileWriter fw = new FileWriter("MH.DAT.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            String type = sc.nextLine();
            int price = Integer.parseInt(sc.nextLine());
            Product p = new Product(name, type, price);
            bw.write(p.toString());
            bw.newLine();
            bw.close();
            fw.close();
                    
        } catch(Exception e)
        {
            
        }
        
    }
    
    public static void AddNVtoFile()
    {
        try{
            FileWriter fw = new FileWriter("NV.DAT.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            Scanner sc = new Scanner(System.in);
            String id = sc.nextLine();
            String name = sc.nextLine();
            String address = sc.nextLine();
            String phone = sc.nextLine();
            //System.out.println(id.substring(0, 2));
            Employee e = new Employee(id, name, address, phone);
            bw.write(e.toString());
            bw.newLine();
            bw.close();
            fw.close();
                    
        } catch(Exception e)
        {
            
        }
    }
    
    public static void AddKHtoFile()
    {
        try{
            FileWriter fw = new FileWriter("KH.DAT.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            String address = sc.nextLine();
            String phone = sc.nextLine();
            String gmail = sc.nextLine();
            Customer c = new Customer(name, address, phone, gmail);
            bw.write(c.toString());
            bw.newLine();
            bw.close();
            fw.close();
                    
        } catch(Exception e)
        {
            
        }
    }
    
   public static void AddDHtoFile()
    {
        try{
            FileWriter fw = new FileWriter("DH.DAT.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            Scanner sc = new Scanner(System.in);
            String proId = sc.nextLine();
            String emId = sc.nextLine();
            String cusId = sc.nextLine();
            int proNum = Integer.parseInt(sc.nextLine());
            PurchaseOrder po = new PurchaseOrder(proId, cusId,emId, proNum);
            bw.write(po.toString());
            bw.newLine();
            bw.close();
            fw.close();
                    
        } catch(Exception e)
        {
           
        }
    }
    
    public static void showListMHInFile()
    {
        try{
             FileReader fr = new FileReader("MH.DAT.txt");
             BufferedReader br = new BufferedReader(fr);
             String line = "";
             while(true)
             {
                 line = br.readLine();
                 if(line == null) break;
                 System.out.println(line);
             }
        } catch (Exception e)
        {
            
        }
    }
    
    public static void showListNVInFile()
    {
        try{
             FileReader fr = new FileReader("NV.DAT.txt");
             BufferedReader br = new BufferedReader(fr);
             String line = "";
             while(true)
             {
                 line = br.readLine();
                 if(line == null) break;
                 System.out.println(line);
             }
        } catch (Exception e)
        {
            
        }
    }
    
    public static void showListKHInFile()
    {
        try{
             FileReader fr = new FileReader("KH.DAT.txt");
             BufferedReader br = new BufferedReader(fr);
             String line = "";
             while(true)
             {
                 line = br.readLine();
                 if(line == null) break;
                 System.out.println(line);
             }
        } catch (Exception e)
        {
            
        }
    }
    
    public static void sortByEmId()
    {
        List<PurchaseOrder> list = new ArrayList<>();
        try{
            FileReader fr= new FileReader("DH.DAT.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while(true)
            {
                line = br.readLine();
                if(line==null) break;
                //System.out.println(line);
                String[] tmp = line.trim().split("\\s+");
                String proId="", cusId="", emId="", orderId = "";
                int proNum=0;
                for(int i=0; i<tmp.length; i++)
                {
                    if(i==0){
                         proId = tmp[i];
                    }
                    else if(i==1)
                    {
                         cusId = tmp[i];
                    }
                    else if(i==2)
                    {
                         emId = tmp[i];
                    }
                    else if(i==3)
                    {
                        orderId = tmp[i];
                    }
                    else if(i==4)
                    {
                         proNum = Integer.parseInt(tmp[i]);
                    }
                          
                }
                list.add(new PurchaseOrder(proId, cusId, emId,orderId, proNum));
                
            }
            
        }catch(Exception e)
        {
            
        }
        
        Collections.sort(list, new Comparator<PurchaseOrder>(){
            @Override
            public int compare(PurchaseOrder o1, PurchaseOrder o2) {
                return o1.getEmployeeId().compareTo(o2.getEmployeeId());
            }
            
    });
        for(PurchaseOrder i: list)
        {
            System.out.println(i.toString());
        }
    }
   
    public static void main(String[] args)
    {
        //JavaWeek3.AddDHtoFile();
        //JavaWeek3.AddDHtoFile();
       // JavaWeek3.AddDHtoFile();
        JavaWeek3.sortByEmId();
       
        
        
    }
}
