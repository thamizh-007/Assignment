package com.thamizhvijayan.assignment;

import com.assignment.utilities.EmployeeUtilities;
import com.employee.Developer;
import com.employee.Manager;


/**
 * Main class for testing Employee classes and utilities.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        // Create instances
        Manager manager = new Manager(101, "Alice", 75000, 5);
        Developer developer = new Developer(102, "Bob", 60000, "Java");

        // Print details
        System.out.println("Manager Details:");
        EmployeeUtilities.printEmployeeDetails(manager);

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.printEmployeeDetails(developer);

        // Increase salary
        System.out.println("\nUpdating Salaries...");
        EmployeeUtilities.increaseSalary(manager, 10);
        EmployeeUtilities.increaseSalary(developer, 15);
    }
}
