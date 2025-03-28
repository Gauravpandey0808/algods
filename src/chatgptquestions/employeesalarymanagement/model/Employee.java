package chatgptquestions.employeesalarymanagement.model;

import java.time.LocalDate;

public class Employee {

    private final Integer id;
    private final String name;
    private final String department;
    private final Double salary;
    private final LocalDate joiningDate;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public Double getSalary() {
        return salary;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public Employee(EmployeeBuilder employeeBuilder) {
        this.id = employeeBuilder.getId();
        this.name = employeeBuilder.getName();
        this.department = employeeBuilder.getDepartment();
        this.salary = employeeBuilder.getSalary();
        this.joiningDate = employeeBuilder.getJoiningDate();
    }
}
