/*
 * Class name :  CompanyServiceImpl
 *
 * @author Futsur Dmitriy
 *
 * @version 1.0 05-Jun-2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
 */

package com.company;

import java.util.List;

/**
 * Company service implementation
 * @author Futsur Dmitriy
 * @version 1.0 05-Jun-2020
 */
public class CompanyServiceImpl implements ICompanyService {

    /**
     * Constructor
     */
    public CompanyServiceImpl() {}

    @Override
    public Company getTopLevelParent(Company child) {
        Company topLevelCompany = child;
        while (child.getParent() != null) {
            child = child.getParent();
            topLevelCompany = child;
        }

        return topLevelCompany;
    }

    @Override
    public int getEmployeeCountForCompanyAndChildren(Company company,
                                                     List<Company> companies) {
        return  company.getEmployeesCount() +
                companies
                        .stream()
                        .mapToInt(Company::getEmployeesCount)
                        .sum();
    }

    public String toString(Company company) {
        if (company != null)
            return "Company {" +
                    "parent = " + company.getParent() +
                    "employeesCount = " + company.getEmployeesCount() +
                    "}";
        return "Object is null";
    }
}