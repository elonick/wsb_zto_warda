public enum FoodType {
    MEET(0.5),
    GREENS(0.4),
    GRAINS(0.3);

    Double caloriesRate;

    FoodType(Double caloriesRate){
        this.caloriesRate = caloriesRate;
    }
}
