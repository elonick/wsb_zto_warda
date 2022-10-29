public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Car ford = new Car();
        ford.fuelType = FuelType.LPG;
        System.out.println(ford.fuelType);
        System.out.println(ford.fuelType.price);
        System.out.println(ford.fuelType.isItEco());

        Country irland = Country.IRLANDIA;
        Country indie = Country.INDIE;
        System.out.println("Obowiazujacy jezyk w irlandii: " + irland.language);
        System.out.println("Najpopularniejsza religia w Indiach: " + indie.religion);

        irland.setGDPinUSD(10000);
        System.out.printf("GDP w Irlandii wynosi: %.2f\n", irland.getGDPinPLN());

        Animal pies = new Animal("Lessie", "Golden", 30.0, FoodType.MIESO);
        System.out.println("Waga Lessie przed jedzeniem: " + pies.waga);
        pies.feed(FoodType.MIESO, 2.0);
        System.out.println("Waga Lessie po 2kg kurczaka: " + pies.waga);
        pies.feed(FoodType.WARZYWA, 2.0);
        System.out.println("Waga Lessie po dodatkowych 2kg marchewki: " + pies.waga);
        pies.feedFavoriteFood(2.0);
        System.out.println("Waga Lessie po 2kg jej ulubionego jedzenia: " + pies.waga);
    }
}
