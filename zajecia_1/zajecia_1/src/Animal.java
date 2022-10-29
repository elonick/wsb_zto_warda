public class Animal {
    String imie;
    String rasa;
    double waga;
    FoodType typJedzenia;

    public Animal(String imie, String rasa, double waga, FoodType typJedzenia) {
        this.imie = imie;
        this.rasa = rasa;
        this.waga = waga;
        this.typJedzenia = typJedzenia;
    }
    public void feed(FoodType foodType, double foodWeight) {
        switch (foodType) {
            case MIESO -> waga += foodWeight * 0.5;
            case ZBOZE -> waga += foodWeight * 0.4;
            case WARZYWA -> waga += foodWeight * 0.3;
            default -> System.out.println(imie + "Nie lubi tego jedzenia");
        }
    }

    public void feedFavoriteFood(double foodWeight) {
        switch (this.typJedzenia) {
            case MIESO -> waga += foodWeight * 0.5;
            case ZBOZE -> waga += foodWeight * 0.4;
            case WARZYWA -> waga += foodWeight * 0.3;
        }
    }


}
