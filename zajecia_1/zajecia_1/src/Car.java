public class Car {
    private String fuelType;
    String getFuelType() {
        return fuelType;
    }

    void setFuelType(String fuelType) {
        //validation
        if(fuelType.equals("Diesel") || fuelType.equals("LPG") || fuelType.equals("PB")) {
            this.fuelType = fuelType;
        } else {
            System.out.println("Nie obslugujemy typu paliwa " + fuelType);
        }
    }
}
