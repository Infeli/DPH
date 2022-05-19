package com.engeto.lekce06;

public class Country implements Comparable<Country>{
    private String shortName;
    private String countryName;
    private Integer tax;            // Integer namísto obyč. intu kvůli compareTo
    private String reducedTax;
    private boolean specialTax;

    public Country(String shortName, String countryName, int tax, String reducedTax, boolean specialTax) {
        this.shortName = shortName;
        this.countryName = countryName;
        this.tax = tax;
        this.reducedTax = reducedTax;
        this.specialTax = specialTax;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Integer getTax() {
        return tax;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
    }

    public String getReducedTax() {
        return reducedTax;
    }

    public void setReducedTax(String reducedTax) {
        this.reducedTax = reducedTax;
    }

    public boolean isSpecialTax() {
        return specialTax;
    }

    public void setSpecialTax(boolean specialTax) {
        this.specialTax = specialTax;
    }


    @Override
    public int compareTo(Country o) {
        return 0;
    }

    @Override
    public String toString() {
        return countryName + " ("+ shortName + "): " + tax + "% \n";
    }
}
