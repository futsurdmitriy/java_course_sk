/*
 * Class name :  IPackaging
 *
 * Version info 1.0
 *
 * 06-Jun-2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
    Polymorphism.
    Create and implement two interfaces for your class.
 */

package com.company;

public interface IPackaging {

    /**
     *
     * @return
     */
    String toString();

    /**
     *
     * @return
     */
    String toJSON();

    /**
     *
     * @return
     */
    String toXML();

    /**
     *
     * @return
     */
    String toConsole();

}
