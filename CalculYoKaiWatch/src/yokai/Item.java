package yokai;

public class Item {
    int IdItem;
    Food food;
    Equipement equipement;

    public Item(int IdItem, Food food)
    {
        this.IdItem = IdItem;
        this.food = food;
    }

    public Item(int IdItem, Equipement equipement)
    {
        this.IdItem = IdItem;
        this.equipement = equipement;
    }
    
}