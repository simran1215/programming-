
public class Food
{
    public String name;
    public double price;
    public Food(String n, double p)
    {
        name = n;
        price = p;
    }
    
    @Override
    public String toString()
    {
        return name + ": $" + String.format("%.2f", price) + " each";
    }
}
