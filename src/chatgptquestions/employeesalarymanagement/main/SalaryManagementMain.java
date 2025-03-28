package chatgptquestions.employeesalarymanagement.main;

import chatgptquestions.employeesalarymanagement.model.Employee;
import chatgptquestions.employeesalarymanagement.model.EmployeeBuilder;
import chatgptquestions.employeesalarymanagement.service.EmployeeSalary;
import chatgptquestions.employeesalarymanagement.service.EmployeeSalaryImpl;

import java.time.LocalDate;
import java.util.List;

public class SalaryManagementMain {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new EmployeeBuilder().setId(1)
                        .setName("Alice")
                        .setDepartment("IT")
                        .setJoiningDate(LocalDate.of(2020, 5, 10))
                        .setSalary(90_000.00)
                        .build(),
                new EmployeeBuilder().setId(2)
                        .setName("Bob")
                        .setDepartment("HR")
                        .setJoiningDate(LocalDate.of(2019, 8, 15))
                        .setSalary(60_000.00)
                        .build(),
                new EmployeeBuilder().setId(3)
                        .setName("Charlie")
                        .setDepartment("IT")
                        .setJoiningDate(LocalDate.of(2021, 3, 20))
                        .setSalary(120_000.00)
                        .build(),
                new EmployeeBuilder().setId(4)
                        .setName("David")
                        .setDepartment("Finance")
                        .setJoiningDate(LocalDate.of(2018, 2, 5))
                        .setSalary(45_000.00)
                        .build(),
                new EmployeeBuilder().setId(5)
                        .setName("Eve")
                        .setDepartment("Finance")
                        .setJoiningDate(LocalDate.of(2017, 11, 30))
                        .setSalary(150_000.00)
                        .build()
        );

        EmployeeSalary employeesSalary = new EmployeeSalaryImpl(employees);

        System.out.println(employeesSalary.getDepartmentAverageSalary());
        System.out.println(employeesSalary.getTopThreeMostPaidEmployee());
        System.out.println(employeesSalary.getEmployeeByJoiningDate());
        System.out.println(employeesSalary.getSalaryCategory());



    }
}
