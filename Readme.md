# Final course task."
By Dmitriy Futsur

This is a simple description to current task via github Readme file.

Task description:

 1. GLOSSARY - 10 points

        1.1. Download a text about Harry Potter.
    
        1.2. For each distinct word in the text calculate the number of occurrence.
    
        1.3. Upper case matters.
    
        1.4. Sort in the DESC mode by the number of occurrence..
    
        1.5. Find  the first 20 pairs.
    
        1.6  Find all the proper names
    
        1.7.  Count them and arrange in alphabetic order.
    
        1.8.   First 20 pairs and names write into to a file test.txt
    
        1.9.  Create a fine header for the file
    
        1.10  Use Java  Collections to demonstrate your experience (Map, List )

    Show all your skills and experience.  All the tricks (i.e. RegEx) will be taken into account.

 2. COMPANY Service implementation - 15 points
    
    The following text is a real  approbation task for Java Juniors in the EPAM company. No more explanation.

        IMPLEMENT THE FOLLOWING INTERFACE.
        
        Do your best to understand the task and demonstrate all your skills.
        
        1. Create a test set of companies in your main class.
        
        2.  Take for this set  IT-companies:  Chief, Lawyer, Developer  (Design,  Front-end, Back-end, DevOps). See attch.
        
        3. Take into account 4 different cases  for a company  ( on-top, on bottom, in the node,  out of chain)
        
        4. Test all this cases in your main class.
        
    public class Company {
        // parent for this company nullable, when there is no parent for this company
        private Company parent;
        private long employeesCount;
    }
    
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
            long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies);
   
        }