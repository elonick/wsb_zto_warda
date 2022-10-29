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
        System.out.printf("GDP w Irlandii wynosi: %.2f", irland.getGDPinPLN());
    }
}
