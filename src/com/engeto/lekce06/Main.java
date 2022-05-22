package com.engeto.lekce06;

import java.util.logging.Logger;

public class Main {

    public static final String FILENAME = "vat-eu.csv";
    public static final String DELIMITER = "\t";

    static Logger logger = Logger.getLogger("com.engeto.lekce06");


    public static void main(String[] args) throws TaxException {

        CountryList country = null;

        // vypsání souboru
        try {
            country = CountryList.importCountry(FILENAME, DELIMITER);

        }catch (TaxException ex){
            logger.warning("Loading error: " + FILENAME + "\n" + ex.getMessage());
        }


        // vytvoření kopie souboru

        String numberCopy = "vat-over-"+country.getInput()+".txt";

        try {
            country.createCopy(numberCopy, DELIMITER);

            }catch (Exception ex){
            logger.warning("Copy has not been created " + numberCopy + ex.getMessage());
        }



    }


}
