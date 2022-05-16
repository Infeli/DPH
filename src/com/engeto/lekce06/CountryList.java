package com.engeto.lekce06;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountryList {

    private List<Country> countryList = new ArrayList<>(); // tvorba kolekce

    public static CountryList importCountry(String filename, String delimiter) throws TaxException {
        String nextLine = "";
        String[] items = {filename};
        String shortName;
        String countryName;
        int tax;
        String reducedTax;
        Boolean specialTax;
        int lineNumber = 1;

        CountryList result = new CountryList();



        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(filename)))) {
            while (scanner.hasNextLine()) {
                lineNumber++;
                nextLine = scanner.nextLine();
                System.out.println(nextLine);

                items = nextLine.split(delimiter);
                shortName = items[0];
                countryName = items[1];
                tax = Integer.parseInt(items[2]);
                reducedTax = items[3];
                specialTax = Boolean.parseBoolean(items[4]);

            }
        }
        catch (FileNotFoundException ex) {
            throw new TaxException("File: " + filename + " has not been found ... " + ex.getLocalizedMessage());
        }
        return result;
    }


}
