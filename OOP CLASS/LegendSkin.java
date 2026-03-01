import java.util.Scanner;

class LegendSkin {
    private String skinname;
    private int skincost;
    
    public LegendSkin(String name, int cost){
        this.skinname = name;
        this.skincost = cost;
    }
        
    public void displaydetails(){
        System.out.println("\nSkin: " + skinname);
        System.out.println("Cost: " + skincost);        
    }
}