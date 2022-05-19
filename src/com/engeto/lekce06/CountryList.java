package com.engeto.lekce06;

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;

public class CountryList {

    static Scanner scanner = new Scanner(System.in);

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

                items = nextLine.split(delimiter);
                shortName = items[0];
                countryName = items[1];
                tax = parseInt(items[2]);
                reducedTax = items[3];
                specialTax = Boolean.parseBoolean(items[4]);

                result.countryList.add(new Country(shortName, countryName, tax, reducedTax, specialTax));

                System.out.println(countryName + " (" + shortName + "): " + tax + "%");

            }

        } catch (FileNotFoundException ex) {
            throw new TaxException("File: " + filename + " has not been found ... " + ex.getLocalizedMessage());
        }

        System.out.println("-------------------------");
        System.out.println("Countries with higher than 20% tax");
        System.out.println("-------------------------");

        return result;
    }


    public void createCopy (String filename, String delimiter){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
            List<Country> result = new ArrayList<>();
            Collections.sort(countryList, new Comparator<Country>() {
                @Override
                public int compare(Country o1, Country o2) {
                    return o1.getTax().compareTo(o2.getTax());
                }
            }.reversed());

            System.out.println("Write VAT: ");
            Integer input = Integer.valueOf(scanner.nextInt());


            for (Country country : countryList) {
                if (country.getTax() > input) {
                    System.out.println(country.getCountryName() + " (" + country.getShortName() + "): " + country.getTax() + "%");
                    writer.write(country.getCountryName() + " (" + country.getShortName() + "): " + country.getTax() + "% \n");
                }
            }
            System.out.println("=========================");
            writer.write("=========================\n");
            for (Country country : countryList) {
                if (country.getTax() <= input) {
                    System.out.print(country.getShortName() + ", ");
                    writer.write(country.getShortName() + ", ");
                }
            }

        }catch (Exception ex){
            ex.getMessage();

        }



    }

}