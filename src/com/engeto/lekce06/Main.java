package com.engeto.lekce06;

import java.util.logging.Logger;

public class Main {

    public static final String FILENAME = "vat-eu.csv";
    public static final String DELIMITER = "\t";
    public static final String COPYFILE = "vat-over-zdeByMeloBytCislo.txt";


    static Logger logger = Logger.getLogger("com.engeto.lekce06");

    public static void main(String[] args) {

        CountryList country = null;

        // vypsání souboru
        try {
            country = CountryList.importCountry(FILENAME, DELIMITER);

        }catch (TaxException ex){
            logger.warning("Loading error: " + FILENAME + "\n" + ex.getMessage());
        }


        // vytvoření kopie souboru

        try {
            country.createCopy(COPYFILE, DELIMITER);
        }catch (Exception ex){
            logger.warning("Copy has not been created " + FILENAME + ex.getMessage());
        }


    }


}
