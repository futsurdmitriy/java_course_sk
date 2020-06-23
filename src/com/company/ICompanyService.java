/*
 * Class name :  ICompanyService
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

/**
 *  @author Dmitriy Futsur
 *  @version 1.0 23 Jun 2020
 */
public interface ICompanyService {

    /**
     * @param child - company for which we are searching the top level parent
     *                  (parent of parent of ...)
     * @return top level paren
     */
    Company getTopLevelParent(Company child);

    /**
     *
     * @param company  - company for which we are searching the count of employees
     *                 (count of this company employees +
     *                 count employees of all children and their children employees )
     * @param companies  - list of all available companies
     *
     * @return count of employees
     */
    int getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies);

}