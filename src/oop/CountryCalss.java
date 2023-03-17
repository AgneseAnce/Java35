package oop;

public class CountryCalss {
    // Creating country class object
    public static void main(String[] args) {

        Country latvia = new Country();
        latvia.setName("Latvia");
        latvia.setPopulation(1831586);
        latvia.setCapital("Riga");
        latvia.setCurrency("EUR");
        latvia.setInEU(true);

        latvia.countryInfo();
        latvia.isThisCountryInEU();
        System.out.println();
        Country china = new Country();
        china.setName("China");
        china.setPopulation(1500000000);
        china.setCapital("Beijing");
        china.setCurrency("CNY");
        china.setInEU(false);

        china.countryInfo();
        china.isThisCountryInEU();
    }
}
