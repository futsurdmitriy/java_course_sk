# Task "JavaCollectionsFramework. List."
By Dmitriy Futsur

You may find all the logic in the "Main.java" class in the "package com.company" package.
To do code more readable I have created a couple of functions to avoid repeated code.

This is a simple description to current task via github Readme file.

Task description:

JavaCollectionsFramework. List.

1. Create ArrayList and LinkedList containing  100 000 Integer elements. Compare time intervals.
2. Insert  new 1000 elements  on the  beginning, on  the middle  and on the end of ones. Compare time intervals.
3. Update 1000 elements  from the  beginning, from  the middle  and from the end of ones. Compare time intervals.
4. Delete 1000 elements  from the  beginning, from  the middle  and from the end of ones. Compare time intervals.

# Result of the program:
    CREATION of simple list took "58" milliseconds.
    CREATION of linked list took "50" milliseconds.
    ========================================================================

    INSERTION to BEGIN at simple list took "48" milliseconds.
    INSERTION to BEGIN at linked list took "2" milliseconds.
    INSERTION to MIDDLE of simple list took "18" milliseconds.
    INSERTION to MIDDLE of linked list took "274" milliseconds.
    INSERTION to the END of simple list took "1" milliseconds.
    INSERTION to the END of linked list took "20" milliseconds.
    ========================================================================
    
    UPDATE at BEGIN of simple list took "2" milliseconds.
    UPDATE at BEGIN of linked list took "9" milliseconds.
    UPDATE at the MIDDLE of simple list took "1" milliseconds.
    UPDATE at the MIDDLE of linked list took "296" milliseconds.
    UPDATE at the END of simple list took "0" milliseconds.
    UPDATE at the END of linked list took "12" milliseconds.
    ========================================================================
    
    DELETION from the BEGIN of simple list took "55" milliseconds.
    DELETION from the BEGIN of linked list took "5" milliseconds.
    DELETION from the MIDDLE of simple list took "23" milliseconds.
    DELETION from the MIDDLE of linked list took "294" milliseconds.
    DELETION from the end of simple list took "1" milliseconds.
    DELETION from the end of linked list took "3" milliseconds.
    
    Process finished with exit code 0

 