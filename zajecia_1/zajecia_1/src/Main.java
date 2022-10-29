public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Car ford = new Car();
        ford.setFuelType("Diesel");
        System.out.println(ford.getFuelType());

        CarEnum bmw = new CarEnum();
        bmw.fuelTypeEnum = CarEnum.FuelTypeEnum.ON;
        System.out.println(bmw.fuelTypeEnum);
    }
}
