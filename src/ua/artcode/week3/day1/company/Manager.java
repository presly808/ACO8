package ua.artcode.week3.day1.company;

/**
 * Created by serhii on 10/3/15.
 */
public class Manager extends Employee {


    private int employeeCount;

    private Employee[] employees;

    public Manager() {
        employees = new Employee[10];
    }

    public void addEmployee(Employee employee){
        employees[employeeCount++] =employee;
    }

    public void doTeamWork(){
        for (int i = 0; i < employeeCount; i++) {
            Employee employee = employees[i];
            employee.work();
        }
    }



}
