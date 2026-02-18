public class Item {
    int IdItem;
    Food food;
    Equipement equipement;

    Item(int IdItem, Food food)
    {
        this.IdItem = IdItem;
        this.food = food;
    }

    Item(int IdItem, Equipement equipement)
    {
        this.IdItem = IdItem;
        this.equipement = equipement;
    }
    
}