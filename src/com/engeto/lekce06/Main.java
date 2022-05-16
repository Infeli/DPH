package com.engeto.lekce06;

import java.util.logging.Logger;

public class Main {

    public static final String FILENAME = "vat-eu.csv";
    public static final String DELIMITER = "\t";

    static Logger logger = Logger.getLogger("com.engeto.lekce06");

    public static void main(String[] args) {

        CountryList country = null;
        try {
            country = CountryList.importCountry(FILENAME, DELIMITER);
        }catch (TaxException ex){
            logger.warning("Loading error: " + FILENAME + "\n" + ex.getLocalizedMessage());
        }



    }
}
