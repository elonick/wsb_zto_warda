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

        Animal pies = new Animal("Lessie", "Golden", 30.0, FoodType.MEET);
        System.out.println("Waga Lessie przed jedzeniem: " + pies.weight);
        try {
            pies.feed(FoodType.MEET, -2.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Waga Lessie po 2kg kurczaka: " + pies.weight);
        try {
            pies.feed(FoodType.GREENS, 2.0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Waga Lessie po dodatkowych 2kg marchewki: " + pies.weight);
        try {
            pies.feed(2.0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Waga Lessie po 2kg jej ulubionego jedzenia: " + pies.weight);
    }
}
