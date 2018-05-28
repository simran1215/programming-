

public class PickUp
{
    public Order yourOrder;
    public PickUp(Order o)
    {
        yourOrder = o;
    }
    
    @Override
    public String toString()
    {
        return "Your " + yourOrder.itemCount + " item(s) will be ready for pickup shortly!";
    }
    
}
