package com.engeto.lekce06;

import java.util.logging.Logger;

public class Main {

    public static final String FILENAME = "vat-eu.csv";
    public static final String DELIMITER = "\t";
    public static String COPYFILE = "vat-over-.txt";

    // napadlo mě, něco takového na vytažení inputu, který uživatel zadá a poté použít parse a vložit do názvu, ale nepřišel jsem na to jak
//    public static Integer num = new CountryList().getInput();
//    public static String fileNum = Integer.toString(num);




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
