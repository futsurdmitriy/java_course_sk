/*
 * Class name :  CompanyServiceImpl
 *
 * Version info 1.0
 *
 * 23 Jun 2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
 */

package com.company;

import java.util.List;

public class CompanyServiceImpl implements ICompanyService {

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