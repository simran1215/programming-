
public class Delivery
{
    public Order yourOrder;
    public int zip;
    public double deliveryCost;
    public Delivery(Order o, int z)
    {
        yourOrder = o;
        zip = z;
        if(zip < 60441 || zip > 60451)
        {
            System.out.println("Delivery not available");
            deliveryCost = 0;
        }
        else if(zip ==  60441 || zip == 60451)
        {
            System.out.println("Delivery available with cost");
            deliveryCost = 7;
        }
        else
        {
            System.out.println("Delivery available");
            deliveryCost = 5;
        }
    }
    
    @Override
    public String toString()
    {
        if(deliveryCost == 0)
        {
            return "Items can not be delivered, please redo the order as a pickup order";
        }
        else
        {
            return "Your " + yourOrder.itemCount + " item(s) will have an additional delivery fee of $" + String.format("%.2f", deliveryCost);
        }
    }

}
