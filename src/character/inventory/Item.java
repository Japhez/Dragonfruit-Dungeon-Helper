package character.inventory;

/**
 *
 * @author Japhez
 */
public class Item
{

    private String name;
    private String description;
    private double weight;

    public Item(String name, String description, double weight)
    {
        this.name = name;
        this.description = description;
        this.weight = weight;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public double getWeight()
    {
        
        System.out.println("weight: "+ weight);
        return weight;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    @Override
    public String toString()
    {
        return name;
    }
}
