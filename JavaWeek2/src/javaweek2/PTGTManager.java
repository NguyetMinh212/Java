
package javaweek2;

import java.util.*;


public class PTGTManager {
    private List<PTGT> list;
    private int motorNum, truckNum, carNum, sumNum;
    
    public PTGTManager() {
        this.list = new ArrayList<>();
    }
  
    public void addNew()
    {
        System.out.println("Number of PTGT: ");
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        
        while(num-- >0)
        {
            System.out.println("Enter 1 to insert Car");
            System.out.println("Enter 2 to insert Motorbike");
            System.out.println("Enter 3 to insert Truck");
            System.out.println("Your choice is: ");
            String type = input.nextLine();
            PTGT ptgt;
            switch(type)
            {
                case "1" -> {
                    ptgt = new Car();
                    ptgt.input();
                    list.add(ptgt);
                }
                case "2" -> {
                    ptgt = new Motorbike();
                    ptgt.input();
                    list.add(ptgt);
                }
                case "3" -> {
                    ptgt = new Truck();
                    ptgt.input();
                    list.add(ptgt);
                }
            }
        }
    }
    
    public void ShowListInfo()
    {
        System.out.println("List of Cars:");
        for(PTGT v:list)
        {
            if(v instanceof Car)
            {
                System.out.println(v.toString());
                carNum++;
            }
        }
        sumNum+=carNum;
        System.out.println("Number of Cars: " + carNum);
        
        System.out.println("List of Motorbikes:");
        for(PTGT v:list)
        {
            if(v instanceof Motorbike)
            {
                System.out.println(v.toString());
                motorNum++;
            }
        }
        sumNum+=motorNum;
        System.out.println("Number of Motorbikes: " + motorNum);
        
        System.out.println("List of Trucks:");
        for(PTGT v:list)
        {
            if(v instanceof Truck)
            {
                System.out.println(v.toString());
                truckNum++;
            }
        }
        sumNum+=truckNum;
        System.out.println("Number of Trucks: " + truckNum);
        System.out.println("Total number of Vehicles: "+sumNum);
    }
    
    public void searchByID(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ID you want to search: ");
        String id = input.nextLine();
        for(PTGT v : list)
        {
            if(v.getMa().equals(id))
            {
                System.out.println(v.toString());
            }
        }
    }
    
    public void searchByLabel(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the label you want to search: ");
        String label = input.nextLine();
        for(PTGT v : list)
        {
            if(v.getHangsx().equals(label))
            {
                System.out.println(v.toString());
            }
        }
    }
    
    public void searchByYear(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year you want to search: ");
        int year = Integer.parseInt(input.nextLine());
        for(PTGT v : list)
        {
            if(v.getNamsx() == year )
            {
                System.out.println(v.toString());
            }
        }
    }
    
    public void searchByPrice(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price you want to search: ");
        System.out.println("From: ");
        Float from = Float.parseFloat(input.nextLine());
        System.out.println("To: ");
        Float to = Float.parseFloat(input.nextLine());
        for(PTGT v : list)
        {
            if(v.getGiaban()>= from && v.getGiaban()<=to)
            {
                System.out.println(v.toString());
            }
        }
    }
    
    public void searchByColor(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the color you want to search: ");
        String color = input.nextLine();
        for(PTGT v : list)
        {
            if(v.getMau().equals(color) )
            {
                System.out.println(v.toString());
            }
        }
    }
    public void showInfo()
    {
        for(PTGT v : list)
        {
            System.out.println(v.toString());
        }
              
    }
    public void sortByLabel()
    {
        Collections.sort(list, new Comparator<PTGT>(){
            @Override
            public int compare(PTGT o1, PTGT o2) {
                return o1.getHangsx().compareTo(o2.getHangsx());
            }
        }
        );
        for(PTGT v : list)
        {
            System.out.println(v.toString());
        }
    }
    
}
