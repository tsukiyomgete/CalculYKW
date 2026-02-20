package yokai;

public class Food {
    String nom;
    double efficacite;
    FoodClass foodClass;

    public Food(String nom, double efficacite, FoodClass fc)
    {
        this.nom = nom;
        this.efficacite = efficacite;
        this.foodClass = fc;
    }
}