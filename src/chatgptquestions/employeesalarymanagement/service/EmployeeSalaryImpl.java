package chatgptquestions.employeesalarymanagement.service;

import chatgptquestions.employeesalarymanagement.model.Employee;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeSalaryImpl implements EmployeeSalary{

    private final List<Employee> employees;

    public EmployeeSalaryImpl(List<Employee> employees) {
        this.employees = employees;
    }


    @Override
    public Map<String, Double> getDepartmentAverageSalary() {
        return employees
                .stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
    }

    @Override
    public Map<String, Double> getTopThreeMostPaidEmployee() {
        return employees
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .collect(Collectors.toMap(
                        Employee::getName,
                        Employee::getSalary,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }

    @Override
    public List<String> getEmployeeByJoiningDate() {
        return employees
                .stream()
                .sorted(Comparator.comparing(Employee::getJoiningDate))
                .map(Employee::getName)
                .toList();
    }

    @Override
    public Map<String, Map<String, String>> getSalaryCategory() {
        return employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.groupingBy(emp -> getEmployeeCategory(emp.getSalary()),
                                Collectors.mapping(
                                        Employee::getName,
                                        Collectors.joining(", ")
                                ))
                        ));
    }


    private String getEmployeeCategory(Double salary) {
        return (salary < 50_000) ? "JUNIOR" :
                (salary <= 100_000) ? "MID" :
                        "SENIOR";
    }
}
