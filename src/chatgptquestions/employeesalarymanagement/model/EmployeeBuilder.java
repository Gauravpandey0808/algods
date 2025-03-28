package chatgptquestions.employeesalarymanagement.model;

import java.time.LocalDate;

public class EmployeeBuilder {
    private  Integer id;
    private  String name;
    private  String department;
    private  Double salary;
    private  LocalDate joiningDate;

    public Integer getId() {
        return id;
    }

    public EmployeeBuilder setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public EmployeeBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    public Double getSalary() {
        return salary;
    }

    public EmployeeBuilder setSalary(Double salary) {
        this.salary = salary;
        return this;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public EmployeeBuilder setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
        return this;
    }

    public Employee build() {
        return new Employee(this);
    }
}
