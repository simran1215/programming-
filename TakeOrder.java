import java.util.Scanner;

public class TakeOrder
{
    public static void main(String [] args)
    {

        Food[] menu = new Food[5];
        menu[0] = new Food("Flyers' Burger", 4.50);
        menu[1] = new Food("Flyers' Drink", 1.50);
        menu[2] = new Food("Flyers' Fries", 2.50);
        menu[3] = new Food("Flyers' Dessert", 3.00);
        menu[4] = new Food("Flyers' Nuggets", 2.75);

        Scanner sc = new Scanner(System.in);
        while(true)
        {
            Order nextOrder = new Order();
            System.out.println("");
            System.out.println("Will this be for [d]elivery or [p]ickup (or [q]uit program)?");
            System.out.println("(type d, p, or q):");
            String choice = sc.nextLine();

            if(choice.equals("q"))
            {
                System.out.println("Goodbye!");
                break;
            }

            String selection = "";
            while(selection.equals("9") == false)
            {
                System.out.println("What would you like to add to your order?");
                for(int i=0;i<5;i++)
                {
                    System.out.println("" + i + ") " + menu[i]);
                }
                System.out.println("9) Done");
                selection = sc.nextLine();
                if(selection.equals("9"))
                {
                    System.out.println("Order complete");
                }
                else
                {
                    int itemChosen = Integer.parseInt(selection);
                    nextOrder.addItem(menu[itemChosen]);
                }
            }

            System.out.println(nextOrder);
            
            if(choice.equals("d"))
            {
                System.out.println("What is your zip code?");
                String zipString = sc.nextLine();
                int zip = Integer.parseInt(zipString);
                
                Delivery deliveryOrder = new Delivery(nextOrder, zip);
                System.out.println(deliveryOrder);
            }

            if(choice.equals("p"))
            {
                PickUp pickupOrder = new PickUp(nextOrder);
                System.out.println(pickupOrder);
            }
        }

        System.out.println("System exit.");
    }
}
