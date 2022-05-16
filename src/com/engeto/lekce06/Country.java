package com.engeto.lekce06;

public class Country {
    private String shortName;
    private String countryName;
    private int tax; // mohl by byt nejspíš double, kdyby bylo větší množství států nebo možnost pro přidání, prozatím nechám int
    private String reducedTax;
    private boolean specialTax;

//    public Country(String shortName, String countryName, int tax, String reducedTax, boolean specialTax) {
//        this.shortName = shortName;
//        this.countryName = countryName;
//        this.tax = tax;
//        this.reducedTax = reducedTax;
//        this.specialTax = specialTax;
//    }

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

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
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
}
