public enum Country {
    USA("angielski", "Protestantyzm"),
    IRLANDIA("irlandzki", "katolicyzm"),
    INDIE("hindu", "hinduizm");

    public String language;
    public String religion;

    double GDPinUSD;

    private Country(String language, String religion) {
        this.language = language;
        this.religion = religion;
    }

    public void setGDPinUSD(double value) {
        this.GDPinUSD = value;
    }

    public double getGDPinPLN() {
        double USDPLNExchangeRate = 4.73;
        return this.GDPinUSD * USDPLNExchangeRate;
    }
}
