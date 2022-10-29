public class Car {
    FuelType fuelType;

    public void refuel() {
        switch (this.fuelType) {
            case H2: System.out.println("Laduje wodor");
            case ELECTRICITY: System.out.println("Laduje akumulator");
            case DIESEL: System.out.println("Laduje rope");
            case GAZ: System.out.println("Laduje benzyne");
            case LPG: System.out.println("Laduje lpg");
            default: System.out.println("Nieobslugiwany typ paliwa");
        }
    }
}
