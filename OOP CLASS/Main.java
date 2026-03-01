import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter a new skin: ");
        String name = input.nextLine();
        
        System.out.print("Enter skin price: ");
        int cost = input.nextInt();        
        
        LegendSkin Skin1 = new LegendSkin(name, cost);

        
        Skin1.displaydetails();

    }
}