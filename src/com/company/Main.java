/*
 * Class name :  Main
 *
 * 05-Jun-2020
 *
 * Copyright (c)  Futsur Dmitriy UzhNU
 *
 * Description:
 *  Module_1 Task_4
 *  Arrays. Practice.
    1. Find in the net and download a text version of a novel about Harry
       Potter.  For instance,  "Harry Potter and the Sorcerer's Stone".
    2. Split the novel into an array of words.
    3. Clean the words from a punctuation signs.
    4. Create another array containing distinct words.
    5. Order the words in alphabetic order.
 */

package com.company;

import javax.swing.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Class Main
 * This is a main class that is entry point of program.
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
        glossary.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.naturalOrder()))
                .forEachOrdered(x -> glossarySortedProperNamesAlphabetic.
                        put(x.getKey(),
                        x.getValue()));

        // 1.8.   First 20 pairs and names write into to a file test.txt
        LinkedHashMap<String, Integer> resultList = new LinkedHashMap<>();
        glossarySortedDescFirstTwenty.forEach((k,v)-> {
            resultList.put(k,v);
        });
        glossarySortedProperNamesAlphabetic.forEach((k,v)-> {
            resultList.put(k,v);
        });

        // 1.9.  Create a fine header for the file


    }
}


