/*
 * Class name :  Main
 *
 * @author Dmitriy Futsur
 *
 * @version 1.0 23 Jun 2020
 *
 * Copyright (c) Dmitriy Futsur
 */

package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * Class Main
 * This is a main class that is entry point of program.
 * @author Futsur Dmitriy
 * @version 1.0 05-Jun-2020
 */
public class Main {

    /**
     * @param args Default parameter for main method.
     *
     * @throws IOException In case file doesn`t exist exception will be thrown.
     * @author Dmitriy Futsur
     * @version 1.0
     */
    public static void main(String[] args) throws IOException {

        CompanyServiceImpl companyService = new CompanyServiceImpl();

        // Built the companies
        Company chief = new Company(null, 1, 1);
        Company accounting = new Company(null, 2, 2);
        Company lawyer = new Company(chief, 5, 3);
        Company developer = new Company(chief, 25, 4);
        Company backEnd = new Company(developer, 10, 5);
        Company frontEnd = new Company(developer, 5, 6);
        Company devOps = new Company(backEnd, 2, 7);
        Company design = new Company(frontEnd, 3, 8);

        // Create a list of companies
        List<Company> companiesList = new ArrayList<>(Arrays.asList(
                chief, lawyer, developer, backEnd, frontEnd, devOps,
                design, accounting
        ));

        // Define children for each company
        List<Company> chiefChildren = new ArrayList<>(Arrays.asList(
                lawyer, developer, backEnd, frontEnd, devOps, design
        ));
        List<Company> accountingChildren = new ArrayList<>();
        List<Company> lawyerChildren = new ArrayList<>();
        List<Company> developerChildren = new ArrayList<>(Arrays.asList(
                backEnd, frontEnd, devOps, design
        ));
        List<Company> backEndChildren = new ArrayList<>(Arrays.asList(devOps));
        List<Company> devOpsChildren = new ArrayList<>();
        List<Company> frontEndChildren = new ArrayList<>(Arrays.asList(design));
        List<Company> designChildren = new ArrayList<>();

        System.out.println("\n------Print employee count of company"
                + "itself and for children companies------");

        System.out.println(
                "Employee count for chief company and its children = " +
                companyService.getEmployeeCountForCompanyAndChildren(
                chief, chiefChildren));
        System.out.println(
                "Employee count for lawyer company and its children = " +
                        companyService.getEmployeeCountForCompanyAndChildren(
                                lawyer, lawyerChildren));
        System.out.println(
                "Employee count for developer company and its children = " +
                        companyService.getEmployeeCountForCompanyAndChildren(
                                developer, developerChildren));
        System.out.println(
                "Employee count for backEnd company and its children = " +
                        companyService.getEmployeeCountForCompanyAndChildren(
                                backEnd, backEndChildren));
        System.out.println(
                "Employee count for devOps company and its children = " +
                        companyService.getEmployeeCountForCompanyAndChildren(
                                devOps, devOpsChildren));
        System.out.println(
                "Employee count for frontEnd company and its children = " +
                        companyService.getEmployeeCountForCompanyAndChildren(
                                frontEnd, frontEndChildren));
        System.out.println(
                "Employee count for design company and its children = " +
                        companyService.getEmployeeCountForCompanyAndChildren(
                                design, designChildren));
        System.out.println(
                "Employee count for accounting company and its children = " +
                        companyService.getEmployeeCountForCompanyAndChildren(
                                accounting, accountingChildren));

        System.out.println("\n------Print the top parent of company------");
        System.out.println(companyService.getTopLevelParent(design));
        System.out.println(companyService.getTopLevelParent(accounting));
        System.out.println(companyService.getTopLevelParent(devOps));

        // 1.1 Parse the file harry.txt (see the attachment).
        // Extract to a separate file all the logs from October 2019.
        List<String> lines = Files.readAllLines(Paths.get(System.getProperty(
                "user.dir") + "/src/_harryPotter_1.txt"),
                StandardCharsets.UTF_8);

        // 1.3. Use RegEx. ([\\P{L}]+)
        // In addition to complications, Unicode also brings new possibilities.
        // One is that each Unicode character belongs to a certain category.
        // You can match a single character belonging to the “letter” category
        // with \p{L}. You can match a single character not belonging to
        // that category with \P{L}.
        // URL : http://www.regular-expressions.info/unicode.html#prop

        List<String> words = new ArrayList<>(Arrays.asList(
                lines.toString()
                        .replaceAll("[\\P{L}]+", " ")
                        .trim()
                        .split("\\s+")
        ));

        // 1.2. For each distinct word in the text calculate the number
        // of occurrence.
        HashMap<String, Integer> glossary = new HashMap<>();
        words.forEach(word -> {
            glossary.put(word, Collections.frequency(words, word));
        });

        // 1.4. Sort in the DESC mode by the number of occurrence.
        LinkedHashMap<String, Integer> glossarySortedDesc =
                new LinkedHashMap<>();
        glossary.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> glossarySortedDesc.put(x.getKey(),
                        x.getValue()));

        // 1.5. Find  the first 20 pairs.
        List<String> glossarySortedDescKeys =
                new ArrayList<>(glossarySortedDesc.keySet());
        LinkedHashMap<String, Integer> glossarySortedDescFirstTwenty =
                new LinkedHashMap<>();
        glossarySortedDescFirstTwenty.putAll(glossarySortedDesc);
        for (int i = glossarySortedDescKeys.size() - 1; i >= 20; i--) {
            glossarySortedDescFirstTwenty.remove(glossarySortedDescKeys.get(i));
        }

        // 1.6  Find all the proper names.
        LinkedHashMap<String, Integer> glossarySortedDescProperNames =
                new LinkedHashMap<>();
        glossarySortedDescProperNames.putAll(glossarySortedDesc);

        glossarySortedDesc.forEach((k,v)-> {
            if (!Character.isUpperCase(k.charAt(0))) {
                glossarySortedDescProperNames.remove(k);
            }
        });

        // 1.7.  Count them and arrange in alphabetic order.
        LinkedHashMap<String, Integer> glossarySortedProperNamesAlphabetic =
                new LinkedHashMap<>();
        glossarySortedDescProperNames.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.naturalOrder()))
                .forEachOrdered(x -> glossarySortedProperNamesAlphabetic.
                        put(x.getKey(),
                        x.getValue()));

        // 1.9.  Create a fine header for the file
        // 1.8.   First 20 pairs and names write into to a file test.txt
        FileWriter fw = null;
        fw = new FileWriter("test.txt");
        fw.write(
                "This is very fine header, just look at me. It`s nice\n" +
                    "-----------This is First 20 pairs------------------\n"
        );
        fw.write(" | Word | Occurances | \n");
        for (Map.Entry<String, Integer> entry :
                glossarySortedDescFirstTwenty.entrySet()) {
            fw.write(" | " + entry.getKey() + " : " +
                    entry.getValue() + "\n");
        }
        fw.write(
                "-----------This is alphabetic sorted names ---------\n"
        );
        fw.write(" | Word | Occurances | \n");
        for (Map.Entry<String, Integer> entry :
                glossarySortedProperNamesAlphabetic.entrySet()) {
            fw.write(" | " + entry.getKey() + " : " +
                    entry.getValue() + "\n");
        }

        fw.close();

    }
}


