public class Animal {
    String name;
    String species;
    double weight;
    FoodType foodType;

    public Animal(String name, String species, double weight, FoodType foodType) {
        this.name = name;
        this.species = species;
        this.weight = weight;
        this.foodType = foodType;
    }

    public void feed(FoodType foodType, double foodWeight) throws Exception{
        if(foodWeight <= 0) {
            throw new Exception("Nie da sie karmic ujemnym jedzeniem");
        }
        weight += foodWeight * foodType.caloriesRate;
    }

    public void feed(double foodWeight) throws Exception{
        feed(this.foodType, foodWeight);
    }
}
