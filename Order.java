
public class Order
{
    // 0 1 2 3 4
    public int itemCount;
    public Food[] items;
    public Order()
    {
        itemCount = 0;
        items = new Food[5];
    }

    public void addItem(Food item)
    {
        if(itemCount < 5)
        {
            items[itemCount] = item;
            itemCount++;
        }
    }

    @Override
    public String toString()
    {
        double totalPrice = 0.0;
        String output = "Your order contains: \n";
        for(int i=0;i<itemCount;i++)
        {
            output += items[i] + "\n";
            totalPrice = totalPrice + items[i].price;
        }
        output += "Sub Total: $" + String.format("%.2f", totalPrice) + "\n";
        output += "Tax: $" + String.format("%.2f", (totalPrice*0.05)) + "\n";
        output += "TOTAL: $" + String.format("%.2f", (totalPrice*1.05)) + "\n";
        output += "(End of order)";
        return output;
    }
}
