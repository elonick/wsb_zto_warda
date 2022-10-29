public enum FuelType {
    DIESEL(8.02),
    GAZ(6.67),
    LPG(3.32),
    H2(300000000.0),
    ELECTRICITY(13.8);

    Double price;

    private FuelType(Double price) {
        this.price = price;
    }

    Boolean isItEco() {
        if(this == DIESEL || this == GAZ || this == LPG) {
            return false;
        } else {
            return true;
        }
    }
}
