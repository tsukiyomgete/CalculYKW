package yokai;

public class FoodClass {
    String nomClass;
    Food[] food;
    int nbFood;
    FoodClass(String nomClass, int taille) 
    {
        this.nomClass = nomClass;
        this.food = new Food[taille];
        nbFood = 0;
    }
    
    public void addFood(Food f)
    {
        if(nbFood < food.length)
        {
            food[nbFood] = f;
            nbFood++;
        }      
    }

}